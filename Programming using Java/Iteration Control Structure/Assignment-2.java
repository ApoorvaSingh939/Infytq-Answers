//Implement a program to find the number of rabbits and chickens in a farm. 
class Tester {
    static void Count(int heads, int legs){
        int chicken_count = 0;
        int rabbits_count = 0;
        if(legs%2==0){
            rabbits_count=(legs/2)- heads;
            chicken_count=heads-rabbits_count;
            System.out.println("Chickens="+chicken_count);
            System.out.println("Rabbits="+rabbits_count);
        }
        else{
            System.out.println("The number of chickens and rabbits cannot br found");
        }
    }
	public static void main(String[] args) {
		// Implement your code here 
		Count(150,500);
	}
}
