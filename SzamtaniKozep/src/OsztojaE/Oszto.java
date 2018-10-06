package OsztojaE;

public class Oszto {

	
	/**
	 * Program, mely a paraméterként adott számról eldönti, hogy osztható-e 2-vel, 3-mal és 5-tel. A program kiírja a képernyore mindhárom vizsgált prímszámról, hogy az osztója vagy nem osztója a felhasználó által adott számnak!
	 * @param args - egy pozitív egész szám
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int szam = 15;
		
		if (szam % 2 == 0)
			System.out.println(szam +" osztható kettővel.");
		else
			System.out.println(szam +" nem osztható kettővel.");
		if (szam % 3 == 0)
			System.out.println(szam +" osztható hárommal.");
		else
			System.out.println(szam +" nem osztható hárommal.");
		if (szam % 5 == 0)
			System.out.println(szam +" osztható öttel.");
		else
			System.out.println(szam +" nem osztható öttel.");
	}

}
