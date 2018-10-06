package Szamol;

public class Alapmuveletek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int szam1 = Integer.parseInt(args[0]); //első szám eltárolása
		int szam2 = Integer.parseInt(args[1]); //második szám eltárolása
		
		int osszeg = szam1 + szam2; //összeg
		int kivonas = szam1 - szam2; //különbség
		int szorzas = szam1 * szam2; //szorzat
		float osztas = (float)szam1 / szam2; //hányados //elég az első elé rakni?

		System.out.println("A két szám: " + szam1 + ", " + szam2); //kiírja a számokat
		System.out.println("A két szám összege: " + osszeg); //kiírja az összeget
		System.out.println("A két szám különbsége: " + kivonas); //kiírja a különbséget
		System.out.println("A két szám szorzata: " + szorzas); //kiírja a szorzatot
		System.out.println("A két szám hányadosa: " + osztas); //kiírja a hányadost
		System.out.println("Kész.");
	}

}
