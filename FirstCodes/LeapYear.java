// Question : Input a year and find whether it is a leap year or not.

package FirstCodes;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {
            System.out.print("Enter a Year: ");
            int year = in.nextInt();

            if((year % 4 == 0 &&  year % 400 == 0) || year % 100 != 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap year");
            }

            System.out.println("To exit type 'X'");
            char exit = in.next().charAt(0);
            if(exit == 'X' || exit == 'x'){
                break;
            }
        }

    }
}
