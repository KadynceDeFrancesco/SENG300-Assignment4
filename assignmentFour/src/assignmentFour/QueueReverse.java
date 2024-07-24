package assignmentFour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
	
	public static void reverseQueue(Queue<Integer> Q) {
		Stack<Integer> stack = new Stack<>();
		
		while(!Q.isEmpty()) {
			stack.push(Q.poll());
		}
		
		while(!stack.isEmpty()) {
			Q.add(stack.pop());
		}
		
	}
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		myQueue.add(6);
		
        System.out.println("Original Queue: " + myQueue);
        
        reverseQueue(myQueue);
        
        System.out.println("Reversed Queue: " + myQueue);
	}

}
