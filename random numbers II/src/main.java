import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pozice = 0;
		int a = 0;
		System.out.println("Zadej t�i ��sla ");

		Scanner s = new Scanner(System.in);
		System.out.println("Zadej min ��slo");
		Double min = s.nextDouble();
		System.out.println("Zadej max ��slo");
		Double max = s.nextDouble();
		System.out.println("Zadej ��slo pro velikost pole");
		int velarr = s.nextInt();

		Double[] arr = new Double[velarr];

		Random rand = new Random();

		for (int i = 0; i < velarr; i++) {
			arr[i] = rand.nextDouble() * (max - min) + min;

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Co chce� vypsat?");
		System.out.println("1. ��slo ze zvolen� pozice");
		System.out.println("2. nejmen�� ��slo z pole a jeho pozice v poli");
		System.out.println("3. nejv�t�� ��slo z pole a jeho pozice v poli");
		System.out.println("4. kolik ��sel je men��ch, ne� tvoje zadan� ��slo");
		System.out.println("5. ukon�it program");

		int volba = s.nextInt();
		switch (volba) {

		case 1:
			System.out.println("Zadej ��slo mezi" + " " + velarr);
			int pozcislo = s.nextInt();
			int poz = pozcislo;
			System.out.println(arr[poz - 1]);
			break;
		case 2:
			double[] arr1 = new double[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr1[i] = arr[i];
			}
			Arrays.sort(arr1);

			for (int i = 0; i < arr.length; i++) {
				if (arr1[arr.length - 1] == arr[i]) {
					pozice = i;
				}
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
			System.out.println(arr1[0] + " " + "A je na pozici : " + pozice);

			break;
		case 3:
			double[] arr2 = new double[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			Arrays.sort(arr2);

			for (int i = 0; i < arr.length; i++) {
				if (arr2[arr.length - 1] == arr[i]) {
					pozice = i;
				}
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
			System.out.println(arr2[arr.length - 1] + " " + "A je na pozici : " + pozice);

			break;

		case 4:
			System.out.println("Zadej ��slo");

			int cislo = s.nextInt();

			double[] arr3 = new double[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr3[i] = arr[i];
			}
			Arrays.sort(arr3);

			for (int i = 0; i < arr.length; i++) {

				if (cislo > arr3[i]) {
					a++;
				}
			}
			System.out.println("Po�et ��sel men��ch ne� zadan� ��slo: " + a);
			break;

		case 5:
			System.exit(0);
			break;

		}

	}

}
