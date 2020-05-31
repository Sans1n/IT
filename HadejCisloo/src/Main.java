import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hádej èíslo????? ");
		System.out.println("Chces hadat ty(1) nebo AI(2) ?");

		Scanner s = new Scanner(System.in);

		int who = s.nextInt();

		switch (who) {
		case 1:

			System.out.println("Zadej èíslo, které urèí rozsah pole od 0 do tvého vybraného (-1)");

			int max = s.nextInt();

			int[] arr = new int[max];

			Random rand = new Random();

			for (int i = 0; i < max; i++) {
				arr[i] = i;

				System.out.print(arr[i] + " ");

			}

			System.out.println();

			int vyber = rand.nextInt(max);

			int hadcislo = arr[vyber];

			System.out.println("hadej jake cislo to je. Ja ti budu rikat jestli je mensi nebo vetsi");

			int pocetpokusu = 8;

			do {
				System.out.println("Pocet pokusu: " + pocetpokusu);
				int cislo = s.nextInt();

				if (cislo < hadcislo) {
					System.out.println("cislo je vetsi");
					pocetpokusu--;
				}
				if (cislo > hadcislo) {
					System.out.println("cislo je mensi");
					pocetpokusu--;
				}
				if (cislo == hadcislo) {
					System.out.println("Vyhrál jsi. Cislo je " + hadcislo);
				}
			} while (pocetpokusu != 0);

			System.out.println("Pocet pokusu: " + pocetpokusu);
			System.out.println("Prohrál jsi");

			break;

		case 2:

			System.out.println("Zadej èíslo, které urèí rozsah pole od 0 do tvého vybraného (-1)");

			int maxAI = s.nextInt();

			int[] arrAI = new int[maxAI];

			Random randAI = new Random();

			for (int i = 0; i < maxAI; i++) {
				arrAI[i] = i + 1;

				System.out.print(arrAI[i] + " ");

			}

			System.out.println();

			System.out.println("hadej jake cislo to je. Ja ti budu rikat jestli je mensi nebo vetsi");

			int pocetpokusuAI = 8;

			int cislo = randAI.nextInt(maxAI);
			int min = cislo;
			System.out.println(cislo);

			do {
				/* System.out.println("Pocet pokusu: " + pocetpokusuAI); */

				System.out.println("tvoje cislo je vetsi(1) , mensi(0) nebo mas ho(2) ?");
				int whatIsIt = s.nextInt();

				if (whatIsIt == 1) {

					cislo = randAI.nextInt((maxAI - min) + 1) + min;
					min = cislo + 1;
					System.out.print("Pøemýšlím");
					Thread.sleep(200);
					System.out.print(".");
					Thread.sleep(200);
					System.out.print(".");
					Thread.sleep(200);
					System.out.print(".");
					Thread.sleep(200);
					System.out.println(".");
					Thread.sleep(500);
					System.out.println(cislo);

				}

				if (whatIsIt == 0) {
					cislo = randAI.nextInt((min - 0) + 1);
					min = cislo;
					System.out.print("Pøemýšlím");
					Thread.sleep(200);
					System.out.print(".");
					Thread.sleep(200);
					System.out.print(".");
					Thread.sleep(200);
					System.out.println(".");
					Thread.sleep(200);

					System.out.println(cislo);
				}

				if (whatIsIt == 2) {
					System.out.println("Mám ho. EZ");
				}

			} while (pocetpokusuAI != 0);

			System.out.println("Pocet pokusu: " + pocetpokusuAI);
			System.out.println("Prohrál jsi");

			break;

		}

	}

}
