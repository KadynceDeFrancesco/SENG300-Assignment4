package assignmentFour;

import java.util.LinkedList;

public class IntLinkedList {
	
	public static LinkedList<Integer> convertToLinkedList(int n){
		LinkedList<Integer> digitList = new LinkedList<>();
		
		while(n>0) {
			int digit = n % 10;
			digitList.addFirst(digit);
			n /= 10;
		}
		return digitList;
	}
	public static void main(String[] args) {
		int inputNumber = 2349;
		LinkedList<Integer> result = convertToLinkedList(inputNumber);
		
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
	}

}
