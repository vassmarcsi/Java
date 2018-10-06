package HaromszogE;

public class Haromszog {

	/**
	 * A paraméterként adott háromszög oldalak hosszúsága alapján eldönti, hogy a
	 * háromszög szerkesztheto-e!
	 * 
	 * @param args - oldalak (a,b,c)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 8;
		int c = 16;

		if ((c < a + b) && (b < a + c) && (a < b + c))
			System.out.println("A háromszög a megadott értékek alapján szerkeszthető.");
		else
			System.out.println("A háromszög a megadott értékek alapján nem szerkeszthető.");
	}

}
