package kostky;

import java.util.Random;

public class hrac {

	public void hazeni() {
		int vyhra1 = 1;
		int vyhra2 = 1;
		int vyhra3 = 1;

		for (int i = 0; i != 10; i++) {

			Random rand = new Random();
			int kostky = 0;
			int max = 6;
			int min = 1;
			int pocethodu1 = 0;
			int pocethodu2 = 0;
			int pocethodu3 = 0;

			System.out.println("H�z� prvn�");
			while (kostky != 6) {
				int a = rand.nextInt(max) + min;
				System.out.print(a + ", ");
				pocethodu1++;

				if (a == 6) {
					System.out.println("Po�et hod� " + pocethodu1);
					System.out.println("\n " + "H�z� druh�");

					kostky = 6;
				}

			}
			if (kostky == 6) {

				Random rand1 = new Random();
				int kostky1 = 0;
				int max1 = 6;
				int min1 = 1;

				while (kostky1 != 6) {
					int a = rand1.nextInt(max1) + min1;
					System.out.print(a + ", ");
					pocethodu2++;
					if (a == 6) {
						System.out.println("Po�et hod� " + pocethodu2);
						System.out.println("\n " + "H�z� t�et�");

						kostky1 = 6;
					}
				}

				if (kostky1 == 6) {

					Random rand2 = new Random();
					int kostky2 = 0;
					int max2 = 6;
					int min2 = 1;

					while (kostky2 != 6) {
						int a = rand2.nextInt(max2) + min2;
						System.out.print(a + ", ");
						pocethodu3++;
						if (a == 6) {
							System.out.println("Po�et hod�: " + pocethodu3);
							kostky2 = 6;
						}
					}

				}

			}
			if (pocethodu1 < pocethodu2 && pocethodu1 < pocethodu3) {
				System.out.println("Vyhr�l hr��1    " + "Po�et v�t�zstv� " + vyhra1);
				vyhra1++;
			}
			if (pocethodu2 < pocethodu1 && pocethodu2 < pocethodu3) {
				System.out.println("Vyhr�l hr��2    " + "Po�et v�t�zstv� " + vyhra2);
				vyhra2++;
			}
			if (pocethodu3 < pocethodu1 && pocethodu3 < pocethodu2) {
				System.out.println("Vyhr�l hr��3    " + "Po�et v�t�zstv� " + vyhra3);
				vyhra3++;
			}
			if (pocethodu1 == pocethodu2 || pocethodu1 == pocethodu3 || pocethodu2 == pocethodu3) {
				System.out.println("Rem�za");
			}
			System.out.println("------------------------------------");

		}

		System.out.println("Po�ad�: ");
		System.out.println("Hr��1 " + vyhra1 + " v�her");
		System.out.println("Hr��2 " + vyhra2 + " v�her");
		System.out.println("Hr��3 " + vyhra3 + " v�her");

		if (vyhra1 > vyhra2 && vyhra1 > vyhra3)
			System.out.println("Hr��1 vyhr�l celou hru.");
		if (vyhra2 > vyhra1 && vyhra2 > vyhra3)
			System.out.println("Hr��2 vyhr�l celou hru.");
		if (vyhra3 > vyhra2 && vyhra3 > vyhra1)
			System.out.println("Hr��3 vyhr�l celou hru.");
		else {
			System.out.println("rem�za");
		}
	}
}
