package HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println();
		
		System.out.println(args[0] + " " + args[1]);
		System.out.println();

		int i = 10;
		double j = 2.5;
		char a = 'a'; // karakternél sima pöcök
		char A = 65; //ASCII kódja
		String szoveg = "valami szöveg"; // szövegnél viszont dupla pöcök
		boolean igaze = true;

		System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg + " " + igaze);
		//System.out.print(); nincs sortörés ekkor ~ Console.Write <-> Console.Writeline
		
		final double PI = 3.14; //konstans változó, értéke a futás során sosem változik
		System.out.println(PI);
		
		//operátorok 
		System.out.println(!igaze); //! negál
		
		
		String szo = igaze ? "igaz" : "hamis"; //feltételes operátor
		System.out.println(szo);
		
		//Prefix és postfix operátorok
		//++i --> először növeli az értékét, utána végzi el a műveletet
		//i++ --> először a műveletet végzi el, a végén növeli az értékét
		//int i = 2, j = 10;
		//int pre = ++i + j; // pre: 13
		//pre = i; // pre : 3
		//pre = j; // pre : 10
		//int post = i++ + j ++; // post : 13; i: 4; j: 11
		//int post = i + j; // post : 15
		//int post = --i + j --; // post : 14
		//int post = i; // post : 3
		//int post = j; // post : 10
		
		
	}

}
