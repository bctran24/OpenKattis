package OpenKattisPractice;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {
	
	public Everywhere() { 
		int num = readInt(); 
		Scanner in  = new Scanner(System.in); 
		for (int i = 0; i < num; i++) { 
			int j = readInt(); 
			Set<String> s = new HashSet<String>();
			for(int k = 0; k < j;k++) {
				s.add(in.nextLine());
			}
			System.out.println(s.size());
		}
		in.close(); 
	}
	
	public int readInt() { 
		Scanner in = new Scanner(System.in); 
		int num = in.nextInt(); 
		return num; 
	}
	
	public static void main(String[] args) throws IOException {
		Everywhere e = new Everywhere(); 
	}
}
