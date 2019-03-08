package OpenKattisPractice;

import java.util.Scanner;

public class treasurehunt {
	public treasurehunt() { 
		Scanner scanner = new Scanner(System.in);
		int R = scanner.nextInt(), C = scanner.nextInt();
		scanner.nextLine();
		int r = 0, c = 0;
		char[][] map = new char[R][C];
		boolean[][] seen = new boolean[R][C];
		for(int i = 0; i < R; i++){
			String in = scanner.nextLine();
			for(int j = 0; j < C; j++){
				char m = in.charAt(j);
				map[i][j] = m;
			}
		}
		int numMoves = 0;
		while(true){
			seen[r][c] = true;
			char m = map[r][c];
			if(m == 'T'){
				System.out.println(numMoves);
				return;
			}
			else if(m == 'N') r--;
			else if(m == 'S') r++;
			else if(m == 'W') c--;
			else c++;
			if(r < 0 || r >= R || c < 0 || c >= C){
				System.out.println("out");
				return;
			}
			numMoves++;
			if(seen[r][c]){
				System.out.println("lost");
				return;
			}	
		}
	}
	
	public static void main(String[] args) {
		treasurehunt th = new treasurehunt(); 
	}
}