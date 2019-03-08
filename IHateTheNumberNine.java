package OpenKattisPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class IHateTheNumberNine {

	public IHateTheNumberNine() {
		start(); 
	}
	
	public void countNines(BigInteger b) { 
//		int UB = (int) Math.pow(10, testCase); 
//		int LB = (int) Math.pow(10, testCase-1); 
		
		b = b.subtract(BigInteger.valueOf(1));
        BigInteger total=(BigInteger.valueOf(8).multiply(BigInteger.valueOf(9).modPow(b, BigInteger.valueOf(1000000007)))).mod(BigInteger.valueOf(1000000007));

//		int count = LB;
//		int howManyNines = 0; 
//		while (count >= LB && count < UB) { 
//			String doesItContainNine = Integer.toString(count); 
//			if (doesItContainNine.contains("9")) { 
//				howManyNines++; 
//			}
//			count++; 
//		} // end of while 
//	
//		BigInteger A, B, C, total; 
//		A = BigInteger.valueOf(count); 
//		B = BigInteger.valueOf(LB); 
//		C = BigInteger.valueOf(howManyNines); 
//		total = A.subtract(B).subtract(C).mod(BigInteger.valueOf(1000000007));  
		
		//long total = count - LB - howManyNines; 
		
		System.out.println(total.toString());
	}
	
	public void start() { 
		System.out.println("Input the number of test cases please");
		int inputs = ReadingInput(); 
		for (int i = 1; i <= inputs; i++) {
			int testCase = ReadingInput(); 
			countNines(BigInteger.valueOf(testCase)); 
		}
	}
	
	public int ReadingInput() { 
		Scanner in = new Scanner(System.in); 
		int inputs = in.nextInt(); 
		return inputs; 	 
	}

	public static void main(String[] args) {
		IHateTheNumberNine nine = new IHateTheNumberNine(); 
	}

}
