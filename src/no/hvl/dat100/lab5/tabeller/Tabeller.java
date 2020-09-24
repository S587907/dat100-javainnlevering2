package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
			for (int i = 0; i < tabell.length; i++)
				System.out.println("Skriv ut tabell" + i + ": " + tabell[i]);
		
		
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	
	// b)
	public static String tilStreng(int[] tabell) {

		String stri = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length-1) {
				stri += tabell[i] + ",";	
		} 	else { 
				stri += tabell[i];	
		}	
			
		}
		return stri + "]";
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");	
	}

	
	
	
	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];}
		return sum;
		
		/*int sum = 0;
		int j = 0;
		while (j < tabell.length) {
			sum += tabell[j];
			j++;
		}
		System.out.println("Total summen av tabellen: " + sum);
		
		
		*/
		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
		
	}
	

	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false; 
		int i = 0;
			while (!funnet && i<tabell.length) {
				if(tabell[i] == tall)
					funnet = true;
				else
					i++;
			}
		if (funnet);
		return funnet;
		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
	
		int lengde = tabell.length;
		int i = 0;
				
		while (i < lengde) {
			if (tabell[i] == tall) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] revTabell = new int [tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			revTabell[i] = tabell[tabell.length-1-i];
		}
		return revTabell;
		// TODO
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		int i = 1;
		boolean sortert = true;

		while (sortert && i < tabell.length - 1) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;

		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int nyLengde = tabell1.length + tabell2.length;
        int [] samlaTabell = new int [nyLengde];
        
        for (int i = 0; i < tabell1.length; i++) {
            samlaTabell [i] = tabell1 [i];
        }

        for (int j = 0; j < tabell2.length; j++) {
        	samlaTabell [tabell1.length + j] = tabell2[j];
        }    
        return samlaTabell;
		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}




}
