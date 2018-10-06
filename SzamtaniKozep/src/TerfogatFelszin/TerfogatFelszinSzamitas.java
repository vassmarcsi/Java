package TerfogatFelszin;

public class TerfogatFelszinSzamitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int terfogat = a * b * c;
		System.out.println("A téglatest térfogata: " + terfogat);

		int felszin = 2 * (a * b + a * c + b * c);
		System.out.println("A téglatest felszíne: " + felszin);

	}

}
