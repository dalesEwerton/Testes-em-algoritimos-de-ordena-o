public class QuickSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
		int ini = 0;
		int fin = elements.length;
		quickSort(elements, ini, fin);
	}
	
	private void quickSort(T[] elements, int ini, int fin) {
		if(ini < fin) {
			int pivot = particiona(elements, ini, fin);
			quickSort(elements, ini, pivot - 1);
			quickSort(elements, pivot + 1, fin);
		}
	}

	private int particiona(T[] elements, int ini, int fin) {
		
		T pivot = elements[ini];
		int i = ini;
		
		for (int j = i + 1 ; j < fin ; j++){
			if(elements[j].compareTo(pivot) == -1) {
				i += 1;
				T aux = elements[i];
				elements[i] = elements[j];
				elements[j] = aux;
			}
		}
		
		
		return i;
	}

}
