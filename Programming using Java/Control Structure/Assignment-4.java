//Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
class Tester {
 		public static int billAmount(char type, int quantity, int distance){ // billAmount method(return bill_amount)
 		   int bill_amount = 0;
 		    if((type == 'N' || type == 'V') && quantity >= 1 && distance > 0){ // if order type is vegetarian or non-veg and quantity should be greater than 1 and distance should be greater than 0
 		        if(type == 'N'){ // if order type is vegetarian
 		            if(distance<=3){ 
                         bill_amount = 12*quantity+0;
 		            }
                   else if(distance>3 && distance<=6){
                         bill_amount = 12*quantity+1;
                   }
                   else{
                         bill_amount = 12*quantity+2;
                        }
 		        }
                else{
                    if(distance<=3){
                        bill_amount = 15*quantity+0;
                    }
                    else if(distance>3 && distance <=6){
                        bill_amount = 15*quantity+1;
                    }
                    else{
                        bill_amount = 15*quantity+2;
                    }
                }
 		    }
        else{
            bill_amount = (-1);
        }
        return bill_amount;
        }
		
	public static void main(String[] args) {
		int total = billAmount('V',2,3);
		System.out.println(total);
	}
}
