//Implement a program to find out how many $5 notes and $1 notes will be used. If an exact change is not possible, then display -1.
class Tester {
    static void noOfNotes(int oneNote, int fiveNote , int purchaseAmount){
        int noOfFiveDollerNotes = purchaseAmount / 5;
        int noOfOneDollerNotes = purchaseAmount % 5;
        
        if(oneNote < noOfOneDollerNotes && fiveNote < noOfFiveDollerNotes){
            System.out.println("-1");
        }
        else{
            System.out.println("$1 notes needed = "+noOfOneDollerNotes);
            System.out.println("$5 notes needed = "+noOfFiveDollerNotes);
        }
    
    }  
	public static void main(String[] args) {
		// Implement your code here 
		noOfNotes(2,4,21);
		
	}
}
