

// Divisible by 4: Most years divisible by 4 are leap years (e.g., 2024, 2028).
// Century Rule: If the year is also divisible by 100, it is not a leap year (e.g., 1900, 2100)...
// The Exception: ...unless it is also divisible by
//  400, in which case it is a leap year (e.g., 2000, 2400).

public class LeapYear {
    public static void main(String[] args) {
        
        int year=1900;
        if(year%4==0 && year %100!=0 || year%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
