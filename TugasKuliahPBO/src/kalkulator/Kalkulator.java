package kalkulator;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator extends JFrame implements ActionListener {

	// setup area-area ui
	private JPanel areaPanelBawah, areaTombolAngka, areaTombolOperator,
				   areaOutput, areaHasilHitung;

	// setup widget output
	private JTextField outputHasil, outputRumus;
	
	// font untuk ui
	private Font fontOutput, fontTombol, fontRumus;

	// untuk menyimpan nilai perhitungan, dan menyimpan sementara angka diinput
	private String bufferRumus,  bufferAngka, modBufferAngka;

	// stack untuk menyimpan angka dan operator
	private LinkedList<String> operatorStack, operandStack;
	
	private boolean hasilDitampilkan;

	public Kalkulator() {
		// inisialisasi awal state
		bufferRumus = bufferAngka = "";
		modBufferAngka = null;
		hasilDitampilkan = false;

		// stacks-stack untuk operasi
		operandStack = new LinkedList<String>();
		operatorStack = new LinkedList<String>(); 

		// inisialisasi elemen ui
		setupUI();
	}
	
	private void setupUI() {
		// setup frame utama

		// beri title window
		setTitle("Kalkulator");

		// bounding di pinggir frame
		setBounds(100, 100, 500, 600);

		// gunakan layout grid
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		setLayout(new GridLayout(2,1));

		// pastikan dapt dilihat
		setVisible(true);
		// on exit
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setup widget-widget
		setupFont(); // buatkan font-font
		setupAreaOutput(); // siapkan area output/hasil
		setupAreaTombol(); // siapkan tombol-tombol

		// pastikan ui sudah memiliki ukuran yang tepat
		revalidate();
		repaint();
	}
	
	private void setupFont() {
		// setup font
		fontOutput = new Font("Arial", 0, 40);
		fontRumus =  new Font("Arial", 0, 30);
		fontTombol = new Font("Arial", 0, 20);
	}
	
	
	private void setupAreaOutput() {
		// buatkan widget textfield output perhitungan
		outputHasil = new JTextField();
		outputRumus = new JTextField();

		// set font texfield
		outputHasil.setFont(fontOutput);
		outputRumus.setFont(fontRumus);
		
		// buat textfield tidak dapt diedit
		outputHasil.setEditable(false);
		outputRumus.setEditable(false);

		// siapkan area hasil
		areaHasilHitung = new JPanel();
		areaHasilHitung.setLayout(new GridLayout(1,2));
		// spasi diawal panel
		areaHasilHitung.add(new JPanel());
		// tambahkan texfield untuk hasil perhitungan
		areaHasilHitung.add(outputHasil);

		// siapkan area output
		areaOutput = new JPanel();
		areaOutput.setLayout(new GridLayout(2,1));
		areaOutput.setVisible(true);

		// tambahkan ke area output
		areaOutput.add(areaHasilHitung);
		// tambahkan texfield untuk rumus perhitungan
		areaOutput.add(outputRumus);

		getContentPane().add(areaOutput);
	}
	
	private void setupAreaTombol() {
		// siapkan area panel bawah
		areaPanelBawah = new JPanel();
		// gunakan layout grid
		areaPanelBawah.setLayout(new GridLayout(2,1));
		//pastikan dapt dilihat
		areaPanelBawah.setVisible(true);

		// siapkan area angka
		areaTombolAngka = new JPanel();
		// gunakan layout grid
		areaTombolAngka.setLayout(new GridLayout(4,3, 5, 5));
		// pastikan dapat dilihat
		areaTombolAngka.setVisible(true);

		// siapkan area operator
		areaTombolOperator = new JPanel();
		// gunakan layout grid
		areaTombolOperator.setLayout(new GridLayout(
				2, Simbol.operatorAritmatika.size()+3 // 3 untuk tombol tambahan
		));
		
		// pastikan area tombol dapat dilihat
		areaTombolOperator.setVisible(true);

		// panggil method pembuat tombol
		addTombolOperator();
		addTombolAngka();

		// tambahkan ke area panel bawah panel tombol-tombol
		areaPanelBawah.add(areaTombolOperator);
		areaPanelBawah.add(areaTombolAngka);

		// tambahkan ke frame utama
		getContentPane().add(areaPanelBawah);
	}

	// buatkan JButton
	private JButton buatTombol(String label) {
		// buat tombol baru
		JButton tombol = new JButton(label);
		// pastikan tombol dapat dilihat
		tombol.setVisible(true);
		// set font untuk tombol
		tombol.setFont(fontTombol);
		// semua tombol memiliki handler yang sama
		tombol.addActionListener(this);
		// kembalikan tombol tersebut
		return tombol;
	}

	private void addTombolAngka() { 
		// tambahkan tombol-tombol angka [0-9] ke area tombol angka
		for(int i = 0; i <= 9; i++) {
			areaTombolAngka.add(buatTombol(String.valueOf(i)));
		}
		// tambahkan tombol clear
		areaTombolAngka.add(buatTombol(Simbol.CLEAR));
		// tambahkan tombol koma
		areaTombolAngka.add(buatTombol(Simbol.KOMA));
	}

	// buatkan tombol-tombol operator
	private void addTombolOperator() { 
		// tambahkan tombol-tombol ke area tombol operator
		
		// tambahkan tombol "="
		areaTombolOperator.add(buatTombol(Simbol.SAMADGN));

		// loop ke semua operator aritmatika dan tambahkan
		for (String label : Simbol.operatorAritmatika.keySet()) {
			areaTombolOperator.add(buatTombol(label));
		}

		// tambahkan tombol-tombol kurung
		areaTombolOperator.add(buatTombol(Simbol.KURUNGBUKA));
		areaTombolOperator.add(buatTombol(Simbol.KURUNGTUTUP));
	}

	
	private String getHasil(String op1, String operator, String op2 ) {

		// konversikan data string menjadi float
		float nop1, nop2;
		try {
			nop1 = Float.valueOf(op1);
			nop2 = Float.valueOf(op2);
		// kembalikan null jika terjadi error apapun
		} catch (Exception e) {
			return null;
		}
		

		// lakukan perhitungan sesuai operator
		float hasil = 0;
		switch(operator) {
		case Simbol.TAMBAH:
			hasil = nop1 + nop2;
			break;
		case Simbol.KURANG:
			hasil = nop1 - nop2;
			break;
		case Simbol.BAGI:
			hasil = nop1 / nop2;
			break;
		case Simbol.KALI:
			hasil = nop1 * nop2;
			break;
		case Simbol.MODULUS:
			hasil = nop1 % nop2;
			break;
		case Simbol.PANGKAT:
			hasil = (float) Math.pow(nop1, nop2);
			break;
		case Simbol.PERSEN:
			hasil = nop1 * (nop2 / 100.0f);
			break;
		}

		System.out.println("###############################################");
		System.out.printf("Menghitung: %s %s %s = %s\n", op1, operator, op1, hasil );

		// jika tidak ada nilai dbalik koma, konversikan menjadi integer
		// atau berikan saja bentuk float nya
		if ((hasil - (int)hasil) == 0.0f) { 
			return String.valueOf((int)hasil);
		}else {
			return String.valueOf(hasil);
		}

	}

	private String lakukanPerhitungan() {

		// loop untuk tiap operator yang adalah "(" atau ")" di
		// teratas stack dan pop data tersebut agar hilang
		while (operatorStack.peek() == Simbol.KURUNGTUTUP ||
				operatorStack.peek() == Simbol.KURUNGBUKA )
		{
			operatorStack.poll();
		}

		// jangan lakukan apapun jika tidak ada yg bisa dilakukan
		if(operatorStack.isEmpty() || operandStack.isEmpty()) return null;

		// ambil 2 angka teratas dari stack operand
		String operand2 = operandStack.poll();
		String operand1 = operandStack.poll();
		
		// ambil operator teratas dari stack operator
		String operator = operatorStack.poll();

		// hitung dan return hasilnya
		return getHasil(operand1, operator, operand2);
	}

	// menambahkan angka yang ada di buffer ke stack
	private void tambahOperandDariBuffer() {
		// jika buffer kosong berhenti
		if (bufferAngka.isEmpty())
			return;
		
		// tambahkan modifer angka (+/-) jika ada
		if (modBufferAngka != null) {
			bufferAngka = modBufferAngka + bufferAngka;
			modBufferAngka = null;
		};

		// tambahkan nilai dari buffer
		operandStack.push(bufferAngka);

		// kosongkan buffer
		bufferAngka = "";
	}

	// bersihkan/reset semua data
	private void resetPerhitungan() {
		bufferRumus = "";
		bufferAngka = "";
		operatorStack.clear();
		operandStack.clear();
		outputHasil.setText("");
		outputRumus.setText("");
		hasilDitampilkan = false;
	}

	private void prosesOperator(String operator) {
		// lakukan perhitungan jika timbul operator yang lebih rendah prioritasnya dibanding yang ada
		// di teratas stack operator
		if( !operatorStack.isEmpty() && operandStack.size() > 1 && operator != Simbol.KURUNGBUKA &&
				Simbol.operatorAritmatika.getOrDefault(operator, 0) <= Simbol.operatorAritmatika.getOrDefault(operatorStack.peek(),0) )
		{
			operandStack.push(lakukanPerhitungan());
		}

		// tambahkan operator tersebut ke stack operator
		operatorStack.push(operator);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// dapatkan tombol yang ditekan
		JButton tombol = (JButton) e.getSource();
		String label = tombol.getText();

		switch(label) {

		// Jika tombol "C" Ditekan
		case Simbol.CLEAR:
			resetPerhitungan();
			break;

		// Jika tombol "=" Ditekan
		case Simbol.SAMADGN:
			if (bufferAngka.isEmpty() || hasilDitampilkan) break;

			// tambahkan angka yang diinput ke stack operand
			tambahOperandDariBuffer();

			// lakukan perhitungan untuk semua yang ada di stack
			while(!operatorStack.isEmpty() && operandStack.size() > 1) {
				operandStack.push(lakukanPerhitungan());
			}

			// tampilkan hasil perhitungan
			outputHasil.setText( String.format("%s %s", label, operandStack.peek()));

			// agar tidak bisa ditekan dua kali
			hasilDitampilkan = true;
			break;

		// Jika tombol Operator Ditekan
		case Simbol.KURANG:
		case Simbol.TAMBAH:
			// Jika Tombol Kurang/Tambah ditekan dan belum ada angka yang diinput,
			// anggap sebagai negatif/positif.
			if(bufferAngka.isEmpty()  && !hasilDitampilkan && modBufferAngka == null && operatorStack.peek() != Simbol.KURUNGTUTUP) {
				modBufferAngka = label;
				bufferRumus += " " + label;
			}
		case Simbol.BAGI:        case Simbol.MODULUS:
		case Simbol.KALI:        case Simbol.PERSEN:
		case Simbol.PANGKAT:
			// pastikan ada angka yang telah diinput
			if (bufferAngka.isEmpty() && operandStack.isEmpty()) break;
			// agar bisa menekan tombol "=" lagi
			if (hasilDitampilkan) hasilDitampilkan = false;
		case Simbol.KURUNGBUKA:
		case Simbol.KURUNGTUTUP:
			// tambahkan angka yang diinput ke stack operand
			tambahOperandDariBuffer(); 
			// proses perhitungan dari operator yang ditekan
			prosesOperator(label);
			// tambahkan simbol operator ke buffer output
			bufferRumus += String.format(" %s ", label);
			break;

		// Jika tombol "." Ditekan
		case Simbol.KOMA:
			// tampilkan "0." jika belum ada angka diinput
			if(!hasilDitampilkan && (bufferAngka.isEmpty() || !Character.isDigit(bufferAngka.charAt(0)))) {
				bufferAngka += 0;
				bufferRumus += 0;
			}
			// FALLTHROUGH

		// Jika tombol selain operator (angka) ditekan
		default: 
			if (hasilDitampilkan) break;
			
			{ // mengecek jika masih ada ruang untuk nilai.
				if (!bufferAngka.isEmpty()) { 
					try {
						double tmp = Double.valueOf(bufferAngka + label);
						if (tmp > Float.MAX_VALUE)
							return;
					} catch (Exception e2) {
						return;
					}
				}
			}
			
			// append satu persatu angka ke buffer angka
			bufferAngka += label;

			// append juga angka ke buffer output
			bufferRumus += label;

		}

		// tampilkan isi dari buffer output di widget output rumus
		outputRumus.setText(bufferRumus);
		printInfo();
	}

	public static void main(String[] args) {
		new Kalkulator();
	}
	
	private void printInfo() {
		System.out.println("###############################################");
		System.out.println("Stack Operator           : " + operatorStack);
		System.out.println("Stack Operand            : " + operatorStack);
		System.out.println("Buffer Angka             : " + bufferAngka);
		System.out.println("Modifier Angka           : " + modBufferAngka);
		System.out.println("Rumus                    : " + bufferRumus);
		System.out.println("Sedang Menampilkan Hasil : " + hasilDitampilkan);
	}
}
