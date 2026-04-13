package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
     /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
	static int score; 
	public static boolean intArraySorted(int[] arr) {
        for(int i = 0; i<arr.length; i++)
        	
        	for(int k = 0; k <arr.length-1; k++) {
        		
        		if(arr[k] < arr[k+1]) {
        		 score = 0;
        		
        		}
        		else {
        	       score = 1;
        		
        		}
        	}
        	
        	if (score == 0) {
        		return true;
        	} else if (score == 1) {
        		return false; 
        	} else {
        		return false; 
        	}

    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
	static int score2; 
	public static boolean doubleArraySorted(double[] arr) {
        for(int i = 0; i<arr.length; i++)
        	
        	for(int k = 0; k <arr.length-1; k++) {
        		
        		if(arr[k] < arr[k+1]) {
        		 score2 = 0;
        		
        		}
        		else {
        	       score2 = 1;
        		
        		}
        	}
        	
        	if (score2 == 0) {
        		return true;
        	} else if (score2 == 1) {
        		return false; 
        	} else {
        		return false; 
        	}

    }


    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
	static int score3; 
	public static boolean charArraySorted(char[] arr) {
        for(int i = 0; i<arr.length; i++)
        	
        	for(int k = 0; k <arr.length-1; k++) {
        		
        		if(arr[k] < arr[k+1]) {
        		 score3 = 0;
        		
        		}
        		else {
        	       score3 = 1;
        		
        		}
        	}
        	
        	if (score3 == 0) {
        		return true;
        	} else if (score3 == 1) {
        		return false; 
        	} else {
        		return false; 
        	}

    }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
	static int score4; 
	public static boolean charArraySorted(String[] arr) {
        for(int i = 0; i<arr.length; i++)
        	
        	for(int k = 0; k <arr.length-1; k++) {
        		
        		if(arr[k].compareTo(arr[ k+1 ]) > 0) {
        		 score4 = 0;
        		
        		}
        		else {
        	       score4 = 1;
        		
        		}
        	}
        	
        	if (score4 == 0) {
        		return true;
        	} else if (score4 == 1) {
        		return false; 
        	} else {
        		return false; 
        	}

    }
}
