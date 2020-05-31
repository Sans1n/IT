import java.util.ArrayList;

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

	public void Pocitej10(int i) {

		if (i % 2 == 0) {

			arr.add(0);

			int dell = i / 2;

			if (dell != 0) {
				Pocitej10(dell);
			}
			if (dell == 0) {
				System.out.println("Výsledek");
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
				System.out.println("Výsledek");
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
