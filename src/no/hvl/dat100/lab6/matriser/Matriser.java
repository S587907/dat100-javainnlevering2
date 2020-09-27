package no.hvl.dat100.lab6.matriser;
import java.util.Arrays;
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
			
			for(int x : row ) {
				stri += x + " ";
				
			}
			stri += "\n";
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		}
		return stri;
	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int nymatrise[][] = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nymatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		// TODO
		//throw new UnsupportedOperationException("skaler ikke implementert");
		
	return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
			   if (a.length != b.length) {
			 return false;
			   }
			   for (int i = 0; i < a.length; i++) {
			 if (!Arrays.equals(a[i], b[i])) {
			  
			     return false;
			 }
			   }
			   return true;

		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
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
