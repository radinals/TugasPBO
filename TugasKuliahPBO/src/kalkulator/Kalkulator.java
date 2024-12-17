package kalkulator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.OperatorInstruction;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.function.ToDoubleBiFunction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator extends JFrame implements ActionListener {

	private JPanel areaPanelBawah;
	private JPanel areaTombolAngka;
	private JPanel areaTombolOperator;
	private JPanel areaHasil;

	private JTextField outputArea, equationArea;
	private Font fontOutput, fontTombol, fontResult;

	private String teksPerhitungan;
	private String bufferAngka;

	private LinkedList<String> operatorStack;
	private LinkedList<String> operandStack;

	public Kalkulator() {
		setSize(400,500);
		setLayout(new GridLayout(2,1));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fontOutput = new Font("Arial", 0, 40);
		fontResult = new Font("Arial", 0, 30);
		fontTombol = new Font("Arial", 0, 20);

		outputArea = new JTextField();
		equationArea = new JTextField();
		outputArea.setFont(fontOutput);
		equationArea.setFont(fontResult);

		areaHasil = new JPanel();
		areaHasil.setLayout(new GridLayout(2,1));
		areaHasil.setVisible(true);
		areaHasil.add(equationArea);
		areaHasil.add(outputArea);

		areaPanelBawah = new JPanel();
		areaPanelBawah.setLayout(new GridLayout(2,1));
		areaPanelBawah.setVisible(true);

		add(areaHasil);

		addTombolOperator();
		areaPanelBawah.add(areaTombolOperator);

		addTombolAngka();
		areaPanelBawah.add(areaTombolAngka);


		add(areaPanelBawah);
		teksPerhitungan="";
		bufferAngka="";
		operandStack = new LinkedList<String>();
		operatorStack = new LinkedList<String>();
	}

	private JButton buatTombol(String label) {
		JButton tombol = new JButton(label);
		tombol.addActionListener(this);
		tombol.setVisible(true);
		tombol.setFont(fontTombol);
		return tombol;
	}

	private void addTombolAngka() { 
		areaTombolAngka = new JPanel();
		areaTombolAngka.setLayout(new GridLayout(4,3, 5, 5));
		areaTombolAngka.setVisible(true);


		for(int i = 1; i <= 9; i++) {
			areaTombolAngka.add(buatTombol(String.valueOf(i)));
		}

		areaTombolAngka.add(buatTombol(String.valueOf(0)));
		areaTombolAngka.add(buatTombol(TipeOperator.CLEAR));
		areaTombolAngka.add(buatTombol(TipeOperator.SAMADGN));
	}

	private void addTombolOperator() { 
		areaTombolOperator = new JPanel();
		areaTombolOperator.setLayout(new GridLayout(2,TipeOperator.nilaiOperatorAritmatika.size()+3));
		areaTombolOperator.setVisible(true);

		for (String label : TipeOperator.nilaiOperatorAritmatika.keySet()) {
			areaTombolOperator.add(buatTombol(label));
		}

		areaTombolOperator.add(buatTombol(TipeOperator.KOMA));
		areaTombolOperator.add(buatTombol(TipeOperator.KURUNGBUKA));
		areaTombolOperator.add(buatTombol(TipeOperator.KURUNGTUTUP));
	}


	private String getHasil(String op1, String operator, String op2 ) {
		double nop1, nop2;

		try {
			nop1 = Double.valueOf(op1);
			nop2 = Double.valueOf(op2);
		} catch (Exception e) {
			return null;
		}

		double hasil = 0;

		System.out.println(op1 + " " + operator + " " + op2);

		switch(operator) {
		case TipeOperator.TAMBAH:
			hasil = nop1 + nop2;
			break;
		case TipeOperator.KURANG:
			hasil = nop1 - nop2;
			break;
		case TipeOperator.BAGI:
			hasil = nop1 / nop2;
			break;
		case TipeOperator.KALI:
			hasil = nop1 * nop2;
			break;
		case TipeOperator.MODULUS:
			hasil = nop1 % nop2;
			break;
		case TipeOperator.PANGKAT:
			hasil = Math.pow(nop1, nop2);
			break;
		case TipeOperator.PERSEN:
			hasil = nop1 * (nop2 / 100.0);
			break;
		}

		if ((hasil - (int)hasil) == 0.0) { 
			return String.valueOf((int)hasil);
		}else {
			return String.valueOf(hasil);
		}

	}

	public String lakukanPerhitungan() {

		while (operatorStack.peek() == TipeOperator.KURUNGTUTUP ||
				operatorStack.peek() == TipeOperator.KURUNGBUKA )
		{
			operatorStack.poll();
		}

		if(operatorStack.isEmpty() || operandStack.isEmpty())
			return null;

		String operand2 = operandStack.poll();
		String operand1 = operandStack.poll();
		String operator = operatorStack.poll();
		return getHasil(operand1, operator, operand2);
	}

	private void tambahOperandDariBuffer() {
		if (!bufferAngka.isEmpty()) {
			operandStack.push(bufferAngka);
			bufferAngka = "";
		}
	}

	private void resetPerhitungan() {
		teksPerhitungan = "";
		bufferAngka = "";
		operatorStack.clear();
		operandStack.clear();
		outputArea.setText("");
		equationArea.setText("");
	}

	private void prosesOperator(String operator) {
		if( !operatorStack.isEmpty() && operandStack.size() > 1 && operator != TipeOperator.KURUNGBUKA &&
				TipeOperator.nilaiOperatorAritmatika.getOrDefault(operator, 0) <= TipeOperator.nilaiOperatorAritmatika.getOrDefault(operatorStack.peek(),0) )
		{
			operandStack.push(lakukanPerhitungan());
		}

		operatorStack.push(operator);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tombol = (JButton) e.getSource();
		String label = tombol.getText();

		switch(label) {

		// Jika tombol "C" Ditekan
		case TipeOperator.CLEAR:
			resetPerhitungan();
			break;

			// Jika tombol "=" Ditekan
		case TipeOperator.SAMADGN:
			tambahOperandDariBuffer();

			while(!operatorStack.isEmpty() && operandStack.size() > 1) {
				operandStack.push(lakukanPerhitungan());
			}

			outputArea.setText( String.format("%s %s", label, operandStack.peek()));
			break;

			// Jika tombol Operator Ditekan
		case TipeOperator.KURANG:
		case TipeOperator.TAMBAH:
			if(bufferAngka.isEmpty() && operatorStack.peek() != TipeOperator.KURUNGTUTUP) {
				bufferAngka += label;
				teksPerhitungan += " " + label;
				break;
			}
			// TODO: support negative/positive numbers

		case TipeOperator.BAGI:        case TipeOperator.MODULUS:
		case TipeOperator.KALI:        case TipeOperator.PERSEN:
		case TipeOperator.PANGKAT:
		case TipeOperator.KURUNGBUKA:
		case TipeOperator.KURUNGTUTUP:
			tambahOperandDariBuffer();
			prosesOperator(label);
			teksPerhitungan += String.format(" %s ", label);
			break;

			// Jika tombol "." Ditekan
		case TipeOperator.KOMA:
			if(bufferAngka.isEmpty() || !Character.isDigit(bufferAngka.charAt(0))) {
				bufferAngka += 0;
				teksPerhitungan += 0;
			}

			// FALLTHROUGH

			// Jika tombol selain operator (angka) ditekan
		default: 
			bufferAngka += label;
			teksPerhitungan += label;

		}

		System.out.println("OP: " +  operandStack);
		System.out.println("OR: " +  operatorStack);

		equationArea.setText(teksPerhitungan);
	}
}
