import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 138 radku;
		 */

		Dvoj dvoj = new Dvoj();

		Scanner s = new Scanner(System.in);

		System.out.println("Chces z 10 --> 2 (1) nebo 2 --> 10 (0) nebo 10 --> 8 (2)");

		int vyber = s.nextInt();

		switch (vyber) {
		case 1:
			System.out.println("10 --> 2");
			System.out.println("Zadej cislo ke zpracovani");

			int cislo = s.nextInt();

			System.out.println("èíslo ke zpracování: " + cislo);
			System.out.print("Zpracovávám");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.println(".");
			Thread.sleep(500);

			dvoj.Pocitej10(cislo);

			break;

		case 0:

			System.out.println("2 --> 10");
			System.out.println("Zadej cislo ke zpracovani");

			String cislo2 = s.next();

			System.out.println("èíslo ke zpracování: " + cislo2);
			System.out.print("Zpracovávám");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.println(".");
			Thread.sleep(500);

			int[] arr2 = new int[cislo2.length()];

			char[] chararr = cislo2.toCharArray();

			for (int i = 0; i < cislo2.length(); i++) {
				arr2[i] = chararr[i];
			}

			dvoj.Pocitej2(arr2);

			break;

		case 2:

			System.out.println("zadej 10 cislo");

			double cislo8 = s.nextDouble();

			System.out.println("èíslo ke zpracování: " + cislo8);
			System.out.print("Zpracovávám");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.println(".");
			Thread.sleep(500);

			dvoj.Pocitej8(cislo8);

			break;

		case 16:

			System.out.println("zadej 10 cislo");

			int number = s.nextInt();

			System.out.println("èíslo ke zpracování: " + number);
			
			System.out.print("Zpracovávám");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.println(".");
			Thread.sleep(500);

			dvoj.Sestnact(number);

			break;
		}

	}

}
