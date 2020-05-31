import java.util.Random;

import houdek.cz.spsejecna.MinHeap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		MinHeap a = new MinHeap(100);

		for (int i = 0; i < a.getSize(); i++) {
			int asd = r.nextInt(1000);
			a.Insert(asd);
		}
		for (int i = 0; i < a.getSize(); i++) {
			System.out.println(a.ExtractMin());

		}
	}

}
