package Masodfoku;

public class MasodfokuMegoldo {

	/**
	 * Másodfokú egyenletet megoldó program ax^2+bx+c
	 * 
	 * @param args - Paraméterként a másodfokú egyenlet paramétereit várja (a,b,c)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 3)
			System.err.println("Nem 3 számot adott meg.");
		else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			double egyikMo = 0;
			double masikMo = 0;

			double diszkriminans = Math.pow(b, 2) - 4 * a * c;
			System.out.println("A diszkrimináns értéke: " + diszkriminans);

			if (diszkriminans > 0) {
				egyikMo = (double) (-b + Math.sqrt(diszkriminans)) / 2 * a;
				masikMo = (double) (-b - Math.sqrt(diszkriminans)) / 2 * a;
				System.out.println("D>0 esetén 2 valós gyöke van: " + egyikMo + " " + masikMo);
			} else if (diszkriminans == 0) {
				egyikMo = (double) -b / 2 * a;
				System.out.println("D=0 esetén egy valós gyöke van: " + egyikMo);
			} else
				System.out.println("2 nem valós, komplex gyöke van");
		}

	}

}
