package Switch;

public class switchOsszetettElagazas {
	public static void main(String args[]) {
		int szam = 2;

		switch (szam) {
		case 0:
			System.out.println("Nulla");
			break;
		case 1:
			System.out.println("Egy");
			break;
		case 2:
			System.out.println("Kettő");
			break;
		default:
			System.out.println("Rosszat adtál meg.");
		}
	}
}
