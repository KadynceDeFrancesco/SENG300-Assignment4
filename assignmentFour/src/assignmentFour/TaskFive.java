package assignmentFour;

public class TaskFive {
	
	public static boolean isPalindrome(String s) {
		
		CharStack charStack = new CharStack();
		
		String cleanString = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		for(char c : cleanString.toCharArray()) {
			charStack.push(c);
		}
		
		for(char c : cleanString.toCharArray()) {
			if (Character.isLetter(c) && charStack.pop() != c) {
				return false;
			}
		}
		
		return true;
	}
	
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("dad")); 
        System.out.println(isPalindrome("Madam, I'm Adam"));
        System.out.println(isPalindrome("Never odd or even"));
        System.out.println(isPalindrome("Hello")); 
    }

}
