#Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
class Tester {
	public static void main(String[] args) {
		int num1 = 6, num2 = 5;  //input numbers
    if(num1 != num2){   //if num1 and num2 are different, print the double of the sum
      System.out.println((num1+num2)*2);
	}
    else{      //else both the numbers are same, print their dum
      System.out.println(num1+num2);
    }
  }
}
  
  
