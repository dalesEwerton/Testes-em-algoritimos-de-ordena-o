public class InsertionSort<T extends Comparable<T>> implements Sorting<T> {

	public void sort(T[] elements){
		
		for(int i = 1; i < elements.length ; i++) {
			
			int j = i;
			
			while (j > 0 && elements[j].compareTo(elements[j-1]) == -1) {
				T aux = elements[j];
				elements[j] = elements[j-1];
				elements[j-1] = aux;
				
				j--;
			}
		}
	}

}
