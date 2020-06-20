import java.util.ArrayList;
import java.util.Scanner;

public class Dvoj {

	/*
	 * 35 radku, ted 65-35 = 30, 77 - 65 = 12, 134-113 = 21
	 */
	/*
	 * Arraylist na lepsi vypis
	 */
	ArrayList<Integer> arr = new ArrayList<Integer>();
	ArrayList<Integer> arr8 = new ArrayList<Integer>();
	int[] arrindex = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 9192 };
	int asd = 0;
	Scanner s = new Scanner(System.in);
	/*vytvorena metoda ZPRACOVANI, ktera bude vypisuje grafickou cast zpracovani. 
	 * Misto toho aby 20 radku byly nakopirovane v kazdem CASE bude pouzita metoda, ktera zkrati kod*/
	public void zpracovani(Object a) throws InterruptedException{   
		System.out.println("Zadej cislo ke zpracovani");
		System.out.println("Cislo ke zpracovani: " + a);
		System.out.print("Zpracovavam");
		for(int i=0;i<6;i++){
			Thread.sleep(400);
			System.out.print(".");
		}
		System.out.println("");
	}
	/* Vetsina kodu mainu v programu je useless a da se lehce zkratit,
	 * proto byla vytvorena metoda na start programu, ktera se bude hodit v default case switche */
	public void start() throws InterruptedException{  
		

		System.out.println("Chces z 10 --> 2 (1) nebo 2 --> 10 (0) nebo 10 --> 8 (2)");

		int vyber = s.nextInt();

		switch (vyber) {
		case 1:
			System.out.println("10 --> 2");
			System.out.println("Zadej cislo ke zpracovani");
			int cislo = s.nextInt();
			zpracovani(cislo);
			Pocitej10(cislo);

			break;

		case 0:

			System.out.println("2 --> 10");
			System.out.println("Zadej cislo ke zpracovani");

			String cislo2 = s.next();

			zpracovani(cislo2);

			int[] arr2 = new int[cislo2.length()];

			char[] chararr = cislo2.toCharArray();

			for (int i = 0; i < cislo2.length(); i++) {
				arr2[i] = chararr[i];
			}

			Pocitej2(arr2);

			break;

		case 2:

			System.out.println("Zadej 10 cislo");

			double cislo8 = s.nextDouble();

			zpracovani(cislo8);

			Pocitej8(cislo8);

			break;

		case 16:

			System.out.println("Zadej 10 cislo");

			int number = s.nextInt();
			
			zpracovani(number);

			Sestnact(number);

			break;
		/* pridany default case, provede se kdyz uzivatel zada spatne cislo volby. 
		* Po tom co se vypise sysout automaticky se restartuje program */
		default: 		
			System.out.println("Spatna volba. Zadej spravne cislo volby.");
			start();
		}

	}
	public void Pocitej10(int i) {

		if (i % 2 == 0) {

			arr.add(0);

			int dell = i / 2;

			if (dell != 0) {
				Pocitej10(dell);
			}
			if (dell == 0) {
				System.out.println("Vysledek");
			}
		}

		if (i % 2 == 1) {

			arr.add(1);

			i--;
			int del = i / 2;

			if (del != 0) {
				Pocitej10(del);
			}
			if (del == 0) {
				System.out.println("Vysledek");
			}

		}

		/*
		 * Prevod ArrayListu do pole ---> vypsani pole pozadu
		 */
		if (i == 0) {

			int[] backarr = new int[arr.size()];

			for (int i1 = 0; i1 < arr.size(); i1++) {
				backarr[i1] = arr.get(i1);
			}

			for (int j = arr.size() - 1; j >= 0; j--) {
				System.out.print(backarr[j] + " ");
			}

		}

	}

	public void Pocitej2(int arr2[]) {

		for (int i = 0; i < arr2.length; i++) {

			asd = arrindex[i] * (arr2[i] - 48) + asd;
		}

		System.out.println(asd);
	}

	public void Pocitej8(double cislo8) {

		double vydelenyCislo8 = cislo8 / 8;

		String s8 = Double.toString(vydelenyCislo8);

		s8 = "0" + s8.substring(s8.indexOf("."));

		double decimal = Double.parseDouble(s8);

		int decimal8 = (int) (decimal * 8);

		arr8.add(decimal8);

		int celc8 = (int) vydelenyCislo8;

		if (celc8 != 0) {
			Pocitej8(celc8);
		}

		if (celc8 == 0) {

			int[] backarr8 = new int[arr8.size()];

			for (int i1 = 0; i1 < arr8.size(); i1++) {
				backarr8[i1] = arr8.get(i1);
			}

			for (int j = arr8.size() - 1; j >= 0; j--) {
				System.out.print(backarr8[j] + " ");
			}
		}

	}

	public void Sestnact(int number) {

		int temp;
		
		String hexValue = "";

		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (number > 0) {
			
			temp = number % 16;
			
			hexValue = hex[temp] + hexValue;
			
			number = number / 16;
		}

		System.out.println("Hex cislo je: " + hexValue);

	}



}
