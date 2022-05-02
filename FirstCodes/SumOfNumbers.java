// Q : Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package FirstCodes;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter the Numbers : ");
            int n = in.nextInt();
            sum += n;
            System.out.println("Do you want to exit?, Press x");
            char exit = in.next().charAt(0);
            if(exit == 'x'){
                break;
            }
        }
        System.out.print("The total sum of all the numbers is : " + sum);

    }
}
