package assignmentFour;

import java.util.Scanner;
import java.util.*;

public class TaskOne {
	
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 Stack<Integer> stack = new Stack<Integer>();
		 Queue<Integer> queue = new LinkedList<Integer>();
		 
		 System.out.print("Please input how many numbers you would like to enter: ");
		 int numberInput = s.nextInt();
		 int i = 0;
		 int takeNumber;
		 
		 for(i = 0; i < numberInput; i++) {
			 takeNumber = s.nextInt();
			 stack.push(takeNumber);
			 queue.offer(takeNumber);
		 }
		 System.out.print("Here are your numbers in reserve order:");
		 while (!stack.isEmpty()) {
			 System.out.print(stack.pop() + " ");
	        }
		 System.out.println(" ");
		 System.out.print("Here are your numbers in regular order:");
		 while(!queue.isEmpty()){
			 System.out.print(queue.poll() + " ");
		 }
		 
	        s.close();
	 }

}
