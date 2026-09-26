package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] bestcolor = {"red","orange","yellow","green","blue","purple","pink"};
    	assertEquals(4, _01_LinearSearch.linearSearch(bestcolor, "blue"));
    	
    	String[] favbreed = {"pug","hound","german shepherd","goldendoodle","sheepdog","lab"};
    	assertEquals(3, _01_LinearSearch.linearSearch(favbreed, "goldendoodle"));
    	
    	String[] bestseason = {"spring","summer","fall","winter"};
    	assertEquals(1, _01_LinearSearch.linearSearch(bestseason, "summer"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        int[] digit = {1,2,3,4,5,6,7,8,9}; 
        assertEquals(6, _02_BinarySearch.binarySearch(digit, 1, 9, 7));
    
    
    }
}
