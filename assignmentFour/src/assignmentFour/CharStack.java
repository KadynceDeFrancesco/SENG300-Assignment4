package assignmentFour;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class CharStack {
	
	private ArrayList<Character> data;
	
	
	
	public CharStack() {
		data = new ArrayList<>();
	}
	
	public void push(char x) {
		data.add(x);
	}
	
	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow. I cannot pop from an empty stack.");
			return '\0';
		}
		
		char removedElement = data.remove(data.size() - 1);
		return removedElement;
	}
	
	public char top() {
		if (isEmpty()) {
			System.out.println("The stack is empty.");
			return '\0';
		}
		return data.get(data.size() - 1);
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		CharStack charStack = new CharStack();
		
		charStack.push('A');
		charStack.push('B');
		charStack.push('C');
		charStack.push('D');
		
		System.out.println("The top element of the stack is: " + charStack.top());
		
		if(charStack.isEmpty() == true) {
			System.out.println("The stack is empty.");
		}
		else {
			System.out.println("The stack is not empty.");
		}
		
		System.out.print("Would you like me to delete all the items in the list? ");
		String YesOrNo = s.nextLine();
		if(YesOrNo.equalsIgnoreCase("yes")) {
			while (!charStack.isEmpty()) {
				System.out.println("Popped: " + charStack.pop());
			}	
		}
		else {
			System.out.println("See ya later than!");
		}
	}
}
