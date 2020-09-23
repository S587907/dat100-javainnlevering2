package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++)
			System.out.println(tabell[i]);

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	
	
	
	
	// b)
	public static String tilStreng(int[] tabell) {
		String stri = "";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length) ;
		
			}
		
		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
		
	}

	
	
	
	
	
	
	
	// c)
	public static int summer(int[] tabell) {
		int j = 0;
		int sum = 0;
		int sum1 = 0;
		
		{
		for (int i = 0; i < tabell.length; i++) 
				sum += tabell[i];
				System.out.println("Sum tabbel: " + sum);
		}
		
		
		while (j < tabell.length)
		{
			sum1 += tabell[j];
			System.out.print(sum1);
			j++;
		}

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
		
	}

	
	
	
	
	
	
	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	
	
	
	
	
	
	
	
	
	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
