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
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

		float szamtani = ((float) a + (float) b + (float) c + (float) d + (float) e) / 5;

		System.out.println(szamtani);

	}

}
