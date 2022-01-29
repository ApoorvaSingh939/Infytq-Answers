//Implement a program that displays a message for a given number based on the below conditions.

//If the number is a multiple of 3, display "Zip".

//If the number is a multiple of 5, display "Zap".

//If the number is a multiple of both 3 and 5, display "Zoom",

For all other cases, display "Invalid".
class Tester {
	public static void main(String[] args) {
		// Implement your code here
		int num = 10;
		if(num%3 ==0 && num%5 == 0){
		    System.out.println("Zoom");
		}
		else if(num%3 == 0){
		    System.out.println("Zip");
		}
		else if(num%5 == 0){
		    System.out.println("Zap");
		}
		
		else{
		    System.out.println("Invalid");
		}
	}
}

