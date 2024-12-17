package kalkulator;

import java.util.Map;

public class Simbol {
	// constant nama-nama tombol
	public final static String TAMBAH  = "+",   KURANG      = "-",
							   BAGI    = "/",   KALI        = "*",
							   SAMADGN = "=",   CLEAR       = "C",
							   KOMA    = ".",   KURUNGBUKA  = "(",
							   PERSEN  = "%",   KURUNGTUTUP = ")",
							   PANGKAT = "pow", MODULUS     = "mod";

	// menyimpan nilai/skala prioritas operator aritmatika
	public static final Map<String, Integer> operatorAritmatika = Map.of(
		    Simbol.TAMBAH, 1,   
		    Simbol.KURANG, 1,   
		    Simbol.KALI, 2,     
		    Simbol.BAGI, 2,     
		    Simbol.MODULUS, 2,
		    Simbol.PERSEN, 2,  
		    Simbol.PANGKAT, 3   
	);	
}
