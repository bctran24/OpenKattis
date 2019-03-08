package OpenKattisPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ForestsOpenKattis {
	
	public static boolean equalsList(List<Integer> l1, List<Integer> l2) { 
		boolean valid = true;
		if (l1 == null || l2 == null || l1.size() != l2.size()) { 
			valid = false;
		} else 	{
			Collections.sort(l1);
			Collections.sort(l2);
			valid = l1.equals(l2);
			if (!l1.equals(l2)) { 
				valid = false; 
			} 
		}
		return valid; 
	}
	
	@SuppressWarnings("null")
	public ForestsOpenKattis() {
		
	}
	
	@SuppressWarnings("null")
	public static void main(String[] args) { 
		ArrayList<String> array = new ArrayList<String>(); 
		File file = new File("D:\\eclipse_workspace\\Practice\\src\\NextedClassesPractice\\Test1.txt");
		try {
			Scanner in = new Scanner(file);
			String firstLine = in.nextLine(); 
			String[] split = firstLine.split("\\s+"); 
			int p = Integer.parseInt(split[0]); 
			while (in.hasNextLine()) { 
				String line = in.nextLine(); 
				array.add(line); 
			}
			Collections.sort(array); 
			
			List<Integer> myArray[] = new ArrayList[p];
			for (int i = 0; i < p; i++) { 
				myArray[i] = new ArrayList<Integer>(); 
			}
			
			for (String element: array) { 
				String[] sliced = element.split("\\s+"); 
				int index1 = Integer.parseInt(sliced[0]); 
				int opinion = Integer.parseInt(sliced[1]); 
				myArray[index1-1].add(opinion); 
			}
	
			int sameList = 0; 
			for (int i = 0; i < myArray.length; i++) { 
				for (int j = i+1; j < myArray.length; j++) { 
					
					if (equalsList(myArray[i], myArray[j])) { 
						sameList++;  
					}
				}
			}

			System.out.println(p - sameList); 
			in.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) { 
			e.printStackTrace();
		}

		
	}

}
