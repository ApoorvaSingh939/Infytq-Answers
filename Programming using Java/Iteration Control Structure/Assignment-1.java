//Implement a program to check whether a given number is a palindrome.
class Tester {
      // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
 
	public static void main(String[] args) {
		// Implement your code here 
		
        // Input string
        String str = "1331";
 
        // passing bool function till holding true
        if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print(str+" is a palindrome");
        else
 
            // Not a palindrome
            System.out.print(str+" is not a palindrome");
	}
}

