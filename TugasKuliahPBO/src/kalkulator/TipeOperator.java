package kalkulator;

import java.util.Map;

public class TipeOperator {
	public final static String TAMBAH  = "+", KURANG  = "-",
							   BAGI    = "/", KALI    = "*",
							   SAMADGN = "=", CLEAR   = "C",
							   KOMA = ".", KURUNGBUKA = "(",
							   PERSEN = "%", KURUNGTUTUP   = ")",
							   PANGKAT = "pow", MODULUS = "mod";

	public static final Map<String, Integer> nilaiOperatorAritmatika = Map.of(
		    TipeOperator.TAMBAH, 1,   
		    TipeOperator.KURANG, 1,   
		    TipeOperator.KALI, 2,     
		    TipeOperator.BAGI, 2,     
		    TipeOperator.MODULUS, 2,
		    TipeOperator.PERSEN, 2,  
		    TipeOperator.PANGKAT, 3   
	);	
	
}
