package OpenKattisPractice;

import java.math.BigInteger;
import java.util.Scanner; 


public class AnagramCounting {

	public AnagramCounting() { 
		Calculation(); 
	}
	
	private void Calculation() { 
		String word = input(); 
		BigInteger recursionSolution = factorial(word.length()); 
		
		// for the lower case repetitions 
		for (char i = 97; i <= 122; i++) { 
			int repetitions = repetition(word, i);
			if (repetitions != 0 && repetitions != 1) { 
				recursionSolution = recursionSolution.divide(factorial(repetitions)); 
			}
		}
		
		// for the upper case repetitions
		for (char i = 65; i <= 90; i++) { 
			int repetitions = repetition(word, i);
			if (repetitions != 0 && repetitions != 1) {
				recursionSolution = recursionSolution.divide(factorial(repetitions)); 
			}
		}

		System.out.println("The number of anagrams = " + recursionSolution);	
	}
	
	private String input() { 
		Scanner in = new Scanner(System.in); 
		System.out.println("Please enter in a word : "); 
		String word = in.next(); 
		return word; 
	}

	private BigInteger factorial(int length) {
		BigInteger bg = new BigInteger("1"); 
		
		for (int i = 1; i <= length; i++) { 
			bg = bg.multiply(BigInteger.valueOf(i)); 
		}
		return bg; 
	}

	private int repetition(String temp, char x) { 
		int count = 0; 
		for (int i = 0; i < temp.length(); i++) { 
			if (temp.charAt(i) == x) { 
				count++; 
			}
		}
		return count; 
	}
	
	public static void main(String[] args) {
		AnagramCounting ag = new AnagramCounting(); 

	}
}
