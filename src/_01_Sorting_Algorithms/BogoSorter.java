package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    
	void sort(int[] array, SortingVisualizer display) {
		int score = 0;
		boolean sorted = false;
		while (!sorted) {
			score = 0;
			Random ran = new Random();
			Random ranny = new Random();
			int s = ran.nextInt(array.length);
			int r = ranny.nextInt(array.length);

			int t = array[r];
			array[r] = array[s];
			array[s] = t;
			
			display.updateDisplay();

			for (int i = 0; i < array.length-1; i++) {
					

					if (array[i + 1] > array[i]) {
						score++;
					}

					

			}
			if (score == array.length + 1) {
				sorted = true;
			}
		}
	}

//    	for (int i = 0; i < array.length; i++){
//          	
//          	for(int j = 0; j < array.length-1; j++) {
//          		
//	          	if (array[j+1] > array[j]) {
//	          		break;
//	          		
//	          	}
//	          	
//          		Random ran = new Random();
//          		Random ranny = new Random();
//          		int s = ran.nextInt(i+1);
//          		int r = ranny.nextInt(i+1);
//          		
//          		int t = array[r];
//          		array[r] = array[s];
//          		array[s] = t;
//          		
//          		display.updateDisplay();
//          	}
//
//    	
//    	}
//}
}