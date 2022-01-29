//Implement a program to generate and display the next date of a given date.
class Tester {
    static void Date(int day, int month, int year){
        int monthLength;
        year = 2000+year;
        char leap;
        
        if((year % 4==0) & (year % 100 == 0) || (year % 400 == 0))
        {
            leap = 'y';
        }
        else
        {
            leap = 'n';
        }

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            monthLength = 31;
        }
        else if(month == 2)
        {
            if(leap == 'y')
            {
                monthLength = 28;
            }
            else
            {
                monthLength = 29;
            }
            
        }
        else
        {
            monthLength = 30;
        }
        
        if(day < monthLength)
        {
            day++;
        }
        else if(month == 12 & day == monthLength)
        {
            day = 1;
            month=1;
            year++;
        }
        System.out.println(day+"-"+month+"-"+year);
    }

	public static void main(String[] args) {
		// Implement your code here 
		Date(1,9,15);
	}
}

