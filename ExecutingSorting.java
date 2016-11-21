import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExecutingSorting {
	
	private static void makeRandomVector(Integer[] emptyVector){
		Random rand = new Random();
		
		for(int i = 0 ; i < emptyVector.length ; i++){
			emptyVector[i] = rand.nextInt(100);
		}
	}
	
	public static void main(String[] args) {
		Sorting strategy;
		long startTime;
		long endTime;
		long runtime;
		
		for(int size = 20000 ; size < 48000 ; size+= 1000) {
			
			//InsertionSort
			for(int j = 0 ; j < 4 ; j++) {
				String tipo;
				if(j == 0) {
					strategy = new InsertionSort<Integer>();
					tipo = "instertion ";
				
				}else if(j == 1) {
					strategy = new SelectionSort<Integer>();
					tipo = "selection ";
				
				}else if (j == 2) {
					strategy = new MergeSort<Integer>();
					tipo = "merge ";
				
				}else {
					strategy = new QuickSort<Integer>();
					tipo = "quick ";
				}
				
				Integer[] vector = new Integer[size];
				makeRandomVector(vector);
				
				startTime = System.nanoTime();
				strategy.sort(vector);
				endTime = System.nanoTime();
				runtime = endTime - startTime;
				
				System.out.println(tipo + runtime + " " + size);
				
			}
			
			
		}
		
	}
}
