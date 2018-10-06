package HanyJegyu;

public class HanySzamjegyTanba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] teszt = args[0].toCharArray();
		
		if (teszt[0] == '-')
			System.out.println("Ennyi számjegyű: " + (teszt.length-1));
		else
			System.out.println("Ennyi számjegyű: " + teszt.length);
	}

}
