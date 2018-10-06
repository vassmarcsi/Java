package HanyJegyu;

public class HanyJegyuASzam {

	/**
	 * Program, mely egy 1 és 1 000 000 közötti számról eldönti, hogy hány jegyu!
	 * @param args - a vizsgálandó szám
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int szam = 100000;
		
		if ((szam >= 1) && (szam < 10))
			System.out.println("Egyjegyű");
		else if ((szam >= 10) && (szam < 100))
			System.out.println("Kétjegyű");
		else if ((szam >= 100) && (szam < 1000))
			System.out.println("Háromjegyű");
		else if ((szam >= 1000) && (szam < 10000))
			System.out.println("Négyjegyű");
		else if ((szam >= 10000) && (szam < 100000))
			System.out.println("Ötjegyű");
		else if ((szam >= 100000) && (szam < 1000000))
			System.out.println("Hatjegyű");
		else
			System.out.println("Tartományon kívüli szám.");
			
	}

}
