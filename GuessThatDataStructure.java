package OpenKattisPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GuessThatDataStructure {
	
	public GuessThatDataStructure() { 
		Scanner scanner = new Scanner(System.in); 
		for(String s = scanner.nextLine(); s != null && !s.equals(""); s = scanner.nextLine() ){
			int n = Integer.parseInt(s);
			Stack<Integer> stack = new Stack<Integer>();
			Queue<Integer> queue = new ArrayDeque<Integer>();
			PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
			List<String> possibilities = new LinkedList<String>();
			possibilities.add("stack");
			possibilities.add("priority queue");
			possibilities.add("queue");
			boolean done = false;
			for(int i = 0; i < n; i++){
				String[] line = scanner.nextLine().split(" ");
				int one = Integer.parseInt(line[0]);
				int two = Integer.parseInt(line[1]);
				if(done) continue;
				if(one == 1){
					stack.add(two);
					queue.add(two);
					priorityQueue.add(two);
				} else {
					if(stack.size() == 0){
						System.out.println("impossible");
						done = true;
						continue;
					}
					if(stack.pop() != two){
						possibilities.remove("stack");
					}
					if(queue.poll() != two){
						possibilities.remove("queue");
					}
					if(priorityQueue.poll() != two){
						possibilities.remove("priority queue");
					}
				}
			}
			if(!done){
				//System.out.println(possibilities);
				if(possibilities.size() == 0){
					System.out.println("impossible"); 
				} else if(possibilities.size() != 1){
					System.out.println("not sure");
				} else {
					System.out.println(possibilities.get(0));
				}
			}
		}
	}

	
	public static void main(String[] args) throws IOException {
		GuessThatDataStructure g = new GuessThatDataStructure(); 
	}
}