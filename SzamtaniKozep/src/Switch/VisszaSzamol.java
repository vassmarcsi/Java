package Switch;

public class VisszaSzamol {

	/**
	 * Programot, mely a paraméterként megadott számtól visszaszámol 0-ig (a
	 * számokat betuvel írja ki)! Ha azonban a paraméterben megadott szám nagyobb
	 * 10-nél, kiírja a program, hogy a megadott szám túl nagy!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int szam = -1;

		if ((szam <= 10) && (szam >= 0)) {
			switch (szam) {
			case 10:
				System.out.println("Tíz");
			case 9:
				System.out.println("Kilenc");
			case 8:
				System.out.println("Nyolc");
			case 7:
				System.out.println("Hét");
			case 6:
				System.out.println("Hat");
			case 5:
				System.out.println("Öt");
			case 4:
				System.out.println("Négy");
			case 3:
				System.out.println("Három");
			case 2:
				System.out.println("Kettő");
			case 1:
				System.out.println("Egy");
			case 0:
				System.out.println("Kilővés");
				break;
			default:
				System.out.println("Nem jó a bemeneti érték.");
			}
		} else
			System.out.println("Túl nagy vagy túl kicsi a szám.");

	}

}
