public class MergeSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
		int ini = 0;
		int fin = elements.length - 1;
		T[] temp = elements;
		
		mergeSort(elements, temp, ini, fin);
		
	}

	private void mergeSort(T [] a, T [] tmp, int left, int right) {
		
		if( left < right ) {
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private void merge(T[] a, T[] tmp, int left, int right, int rightEnd ) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    
            tmp[k++] = a[left++];

        while(right <= rightEnd)  
            tmp[k++] = a[right++];

        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 
}
