package MelyikANagyobb;

public class Osszehasonlit {

	/**
	 * Program, amely a paraméterként adott két számról eldönti, hogy melyik a nagyobb! Megvizsgálja, hogy a felhasználó valóban két paramétert adott-e meg; két érték esetén végrehajtja az összehasonlítást, ellenkezo esetben kiírja a hibaüzenetet!
	 * @param args - Két számot kell megadni
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length < 2)
			System.out.println("Nem adott meg két adatot!");
		else
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			if (a > b)
				System.out.println("A(z) " + a + " nagyobb ennél a számnál: " + b);
			else if (a == b)
				System.out.println("A két szám megegyezik: " + b);
			else
				System.out.println("A(z) " + b + " nagyobb ennél a számnál: " + a);
		}

		
		
	}

}
