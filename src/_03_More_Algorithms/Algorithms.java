package _03_More_Algorithms;

import java.util.List;

import javax.swing.JOptionPane;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        String word1 = Integer.toString(num1);
        String word2 = Integer.toString(num2);
        String word3 = Integer.toString(num1*num2);
        String word4 = word1+ " x " + word2 + " = " + word3;
       
    	return word4;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for(int i = 0; i<eggs.size(); i++) {
        	if(eggs.get(i).equals("cracked")) {
        		return i;
        		
        	}
        }
    	
    	
    	return -1;
    }

    public static boolean isPrime(int prime) {
    	for(int i = 2; i<prime;i++) {
    		if(prime%i == 0) {
    			return false;
    		}
    	}
    	
    	return true;
    	
    }
    
    public static boolean isSquare(int square) {
		for(int i = 1; i<=square; i++) {
			if (square/i == i) {
				return true;
			}
		}
    	return false;
    	
    }
    
    public static boolean isCube(int cube) {
    	for(int i = 1; i<=cube; i++) {
			if (cube/i == i*i) {
				return true;
			}
		}
    	return false;
    	
    }

    public static int countPearls(List<Boolean> oysters) {
    	int total = 0;
    	for(int i = 0; i<oysters.size(); i++) {
        	if(oysters.get(i) == true) {
        		total++;
        		
        	}
        }
    	return total;
    }
 
    public static Double findTallest(List<Double> peeps) {
    	Double tallest = 0.0;
    	for(int i = 0; i<peeps.size(); i++) {
    		if(peeps.get(i)>tallest);
    		tallest = peeps.get(i);
    	}
    	return tallest;
}

    public static String findLongestWord(List<String> words) {
    	int chars = 0;
    	String longest = "";
    	for(int i = 0; i<words.size(); i++) {
    		if(words.get(i).length() > chars) {
    			chars = words.get(i).length();
    			longest = words.get(i);
    		}
    	}

    return longest;
    }
    
    public static boolean containsSOS(List<String> message) {
    	for(int i = 0; i<message.size(); i++) {
    		if (message.get(i).equals(" ... --- ... ")) {
        		return true;
        	}	
    	}
    	
    	return false;

    }    
    
    
    
}    