package assignmentFour;

import java.util.Scanner;

public class TestClass {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean exit = false;
		
		System.out.println("Hello, welcome to class testing for Assignment 4!");
		System.out.println(" ");
		System.out.println("Here are the different functionalities you can pick from:");
		System.out.println("1. Stack Reversal");
		System.out.println("2. Character Stack using ArrayLists");
		System.out.println("3. Character Stack using LinkedLists");
		System.out.println("4. CharStack Palindrome Check");
		System.out.println("5. IntQueue Operations");
		System.out.println("6. Queue Reverser");
		System.out.println("7. Integer to LinkedList Conversion");
		System.out.println("8. Exit");
		while(!exit) {
		System.out.println(" ");
		System.out.print("Please enter what functionality you would like to test:");
		
		int number = s.nextInt();
		
		switch(number) {
		case 1:
			TaskOne.main(args);
			break;
			
		case 2:
			CharStack.main(args);
			break;
			
		case 3:
			CharStackUpdated.main(args);
			break;
			
		case 4:
			TaskFive.main(args);
			break;
			
		case 5:
			IntQueue.main(args);
			break;
			
		case 6:
			QueueReverse.main(args);
			break;
			
		case 7:
			IntLinkedList.main(args);
			break;
		
		case 8:
			exit = true;
			System.out.println(" ");
			System.out.print("The program is now exiting. Goodbye!");
			break;
			
		default:
			System.out.println(" ");
			System.out.println("Invalid input. Please try again.");
		}
		}
		s.close();
		
	}

}
