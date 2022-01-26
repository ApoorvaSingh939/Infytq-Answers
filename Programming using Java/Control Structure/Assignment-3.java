//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. 
//If 7 is the last integer, then display -1.
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num1 = 1, num2 = 5, num3 = 3;
		if(num1 == 7){ // if first number is 7, print product of remaining numbers
		    System.out.println(num2*num3);
		}
		else if(num2 == 7){ // if sdecond number is 7, print last number 
		    System.out.println(num3);
		}
		else if(num3 == 7){
		    System.out.println("-1"); // if third number is 7, print -1
		}
		else{
		    System.out.println(num1*num2*num3);
		}
	}
}

