package houdek.cz.spsejecna;

import java.util.ArrayList;

public class MinHeap {

	private ArrayList<Integer> arr;
	private int size;

	public MinHeap(int vel) {
		arr = new ArrayList();
		this.size = vel;

	}

	public int getSize() {
		return size;
	}

	public int getMin() {

		return (int) arr.get(0);

	}

	public void Insert(int insertvalue) {
		arr.add(insertvalue);
		sortInsert(arr.size(), arr.size() - 1);
	}

	public Integer ExtractMin() {
		int nejmensi = arr.get(0);
		int posledniPrvekVArr = arr.size() - 1;
		arr.set(0, arr.get(posledniPrvekVArr));
		arr.remove(posledniPrvekVArr);
		smazaniPrvku(0);
		return nejmensi;
	}

	private void sortInsert(int n, int i) {
		int sudyrodic = (i - 1) / 2;
		if (arr.get(sudyrodic) > 0) {
			if (arr.get(i) < arr.get(sudyrodic)) {
				int temp = arr.get(i);
				arr.set(i, arr.get(sudyrodic));
				arr.set(sudyrodic, temp);
				sortInsert(n, sudyrodic);
			}
		}
	}

	private void smazaniPrvku(int i) {
		int nejmIndex = i;
		int pravyIndex = 2 * i + 2;
		int levyIndex = 2 * i + 1;

		if (levyIndex < arr.size() && arr.get(levyIndex) < arr.get(nejmIndex)) {
			nejmIndex = levyIndex;
		}

		if (pravyIndex < arr.size() && arr.get(pravyIndex) < arr.get(nejmIndex)) {
			nejmIndex = pravyIndex;
		}

		if (nejmIndex != i) {
			int temp = arr.get(i);
			arr.set(i, arr.get(nejmIndex));
			arr.set(nejmIndex, temp);
			smazaniPrvku(nejmIndex);
		}
	}

	@Override
	public String toString() {
		return "MinHeap [arr=" + arr + "]";
	}

}
