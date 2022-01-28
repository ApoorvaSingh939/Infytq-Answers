class Tester {
    
    static void validation(String accountNumber, int salary, int accountBalance, String loneType, int loneAmountExpected, int emisExpexted){
        if(accountNumber.length() == 4 && accountNumber.charAt(0) == 1 && accountBalance >= 1000){
            if(salary > 25000 && loneType.equals("Car")){
                System.out.println("eligibleLoneAmount=500000");
                System.out.println("eligibleEmis=36");
            }
            else if(salary>50000 && loneType.equals("House")){
                System.out.println("eligibleLoneAmount=6000000");
                System.out.println("eligibleEmis=60");
            }
             else if(salary>75000 && loneType.equals("Business")){
                System.out.println("eligibleLoneAmount=7500000");
                System.out.println("eligibleEmis=84");
            }
        }
        else{
            System.out.println("Wrong input");
        }
        
    } 
    
	public static void main(String[] args) {
		// Implement your code here 
		validation( "1001", 40000, 250000, "Car", 300000, 30);
	}
}

