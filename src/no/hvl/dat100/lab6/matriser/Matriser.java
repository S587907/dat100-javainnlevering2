package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for(int x : rad) {
				System.out.println(x + " ");
				
			}
			System.out.println();
		}
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String stri = "";
		for (int[] row : matrise) {
			stri += "\n";
			for(int x : row ) {
				stri += x + " " ;
				
			}
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		}
		return stri;
	
	}
//	String stri = "[";
//	
//	for (int i = 0; i < tabell.length; i++) {
//		if (i != tabell.length-1) {
//			stri += tabell[i] + ",";	
//	} 	else { 
//			stri += tabell[i];	
//	}	
//		
//	}
//	return stri + "]";
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
