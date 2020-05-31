package kostky;

import java.util.Random;

public class hrac {
	

	public void hazeni() {
		for(int i =0; i!=1;i++) {
		
		Random rand = new Random();
		int kostky = 0;
		int max = 6;
		int min = 1;
		int pocethodu1 = 0;
		int pocethodu2 = 0;
		int pocethodu3 = 0;
		
		System.out.println("Hází první");
		while (kostky != 6) {
			int a = rand.nextInt(max) + min;
			System.out.print(a+", ");
			pocethodu1++;
		
			if (a == 6) {
				System.out.println("Poèet hodù "+pocethodu1);
				System.out.println("\n "+"Hází druhý");
				
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
				System.out.print(a+", ");
				pocethodu2++;
				if (a == 6) {
					System.out.println("Poèet hodù "+pocethodu2);
					System.out.println("\n "+"Hází tøetí");
					
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
					System.out.print(a+", ");
					pocethodu3++;
					if (a == 6) {
						System.out.println("Poèet hodù: "+pocethodu3);
						kostky2 = 6;
					}
				}

			}
		}
		if(pocethodu1<pocethodu2&&pocethodu1<pocethodu3) {
			System.out.println("Vyhrál hráè1"); 
		}
		if(pocethodu2<pocethodu1&&pocethodu2<pocethodu3) {
			System.out.println("Vyhrál hráè2"); 
		}
		if(pocethodu3<pocethodu1&&pocethodu3<pocethodu2) {
			System.out.println("Vyhrál hráè3"); 
		}
		}  
		
			

	
	
	}
	}

