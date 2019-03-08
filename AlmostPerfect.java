package OpenKattisPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class AlmostPerfect {

	public AlmostPerfect() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(1); 
		int count = 2; 
		int test = 0; 
		int result = 0; 
		System.out.print("The number? ");
		test = readInt(scan); 
		for (int j = 0; j < test; j++) { 
			if ( (test%count) == 0 && count < test) { 
				al.add(count); 
			}
			count++; 
		} // end of inside for loop 
		
		for (Integer element : al) { 
			result += (int)element; 
		}
		options(result, test); 

		scan.close(); 
	}

	public int readInt(Scanner scan) { 
		int input = scan.nextInt(); 
		return input; 
	}
	
	public void options (int result, int test) { 
		if (result == test) { 
			System.out.println(test + " perfect");
		} else if (result == (test-2) || result == (test+2)) { 
			System.out.println(test + " almost perfect");
		} else { 
			System.out.println(test + " not perfect");
		}
	}
	
	public static void main(String[] args) {
		AlmostPerfect ap = new AlmostPerfect(); 

	}

}
