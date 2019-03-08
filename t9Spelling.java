package OpenKattisPractice;

import java.util.Scanner;

public class t9Spelling {
	static String[] nums = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	static StringBuilder out;
	
	public t9Spelling() { 
		Scanner scan = new Scanner(System.in); 
		int c = readInt(scan); 
		scan.nextLine(); 
		for(int i = 1; i <= c; i++){
			char[] in = scan.nextLine().toCharArray();
			out = new StringBuilder();
			for(char temp : in) getString(temp);
			System.out.printf("Case #%d: ", i);
			System.out.println(out);
		}
	}
	
	static void getString(char in){
		for(int i = 0; i < nums.length; i++){
			int index = nums[i].indexOf(in);
			if(index == -1) continue;
			if(out.length() > 0 && out.charAt(out.length() - 1) - '0' == i) out = out.append(' ');
			for(int j = 0; j <= index; j++) out = out.append(i);
			return;
		}
	}
	
	public int readInt(Scanner in) { 
		int c = in.nextInt();
		return c; 
	}
	public static void main(String[] args) {
		t9Spelling t = new t9Spelling(); 
	}
	
}