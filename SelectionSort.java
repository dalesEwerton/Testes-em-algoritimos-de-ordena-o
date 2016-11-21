public class SelectionSort<T extends Comparable<T>> implements Sorting<T> {
	
	public void sort(T[] elements) {

		for (int i = 0; i < elements.length; i++) {

			int index = i;

			for (int j = i + 1; j < elements.length; j++) {
				if (elements[index].compareTo(elements[j]) == 1) {
					index = j;
				}
			}

			T aux = elements[i];
			elements[i] = elements[index];
			elements[index] = aux;

		}
	}
}
