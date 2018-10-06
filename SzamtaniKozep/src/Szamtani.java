/**
 * @author Vass Mária
 *
 **/
public class Szamtani {

	/**
	 * Ez a metódus azért felelős, hogy ...
	 * 
	 * @param args - argumentumok
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]); // első szám
		int b = Integer.parseInt(args[1]); // második szám
		int c = Integer.parseInt(args[2]); // harmadik szám
		int d = Integer.parseInt(args[3]); // negyedik szám
		int e = Integer.parseInt(args[4]); // ötödik szám

		float szamtani = ((float) a + (float) b + (float) c + (float) d + (float) e) / 5;

		System.out.println("A számok, melyeknek meg szeretném határozni a számtani közepét: " + a + " " + b + " " + c
				+ " " + d + " " + e);
		System.out.println("A számtani közepük: " + szamtani);

	}

}
