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
		
		System.out.println("H�z� prvn�");
		while (kostky != 6) {
			int a = rand.nextInt(max) + min;
			System.out.print(a+", ");
			pocethodu1++;
		
			if (a == 6) {
				System.out.println("Po�et hod� "+pocethodu1);
				System.out.println("\n "+"H�z� druh�");
				
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
					System.out.println("Po�et hod� "+pocethodu2);
					System.out.println("\n "+"H�z� t�et�");
					
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
						System.out.println("Po�et hod�: "+pocethodu3);
						kostky2 = 6;
					}
				}

			}
		}
		if(pocethodu1<pocethodu2&&pocethodu1<pocethodu3) {
			System.out.println("Vyhr�l hr��1"); 
		}
		if(pocethodu2<pocethodu1&&pocethodu2<pocethodu3) {
			System.out.println("Vyhr�l hr��2"); 
		}
		if(pocethodu3<pocethodu1&&pocethodu3<pocethodu2) {
			System.out.println("Vyhr�l hr��3"); 
		}
		}  
		
			

	
	
	}
	}

