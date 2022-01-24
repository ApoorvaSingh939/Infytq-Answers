//Find the discriminant value
class Tester {
	public static void main(String[] args) {
		// Implement your code here
		int a = 1, b = 4, c = 4;  //input numbers
		int discriminant = (b*b)- 4*a*c; // discriminant of the equstion
		if(discriminant == 0){         // if discriminant is zero, print the root of the equation
		    double x = ((-b + discriminant)/2*a);
		    System.out.println("The root is "+x);
		}
		else if(discriminant>0){  // if discriminant is greater than zero, print both the roots of the equation
		    double x1 = ((-b + discriminant)/2*a);
		    double x2 = ((-b - discriminant)/2*a);
		    System.out.println("The roots are "+x1+" "+x2);
		}
		else{  // else print the equation has no real root 
		    System.out.println("The equation has no real root");
		}
		
	}
}
