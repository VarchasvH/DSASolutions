//Q : Take 2 numbers as inputs and find their HCF and LCM.
package FirstCodes;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
    int a, b, hcf = 0, lcm = 0;
    Scanner in = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        a = in.nextInt();
        System.out.println("Enter the Second Number : ");
        b = in.nextInt();

        lcm = Math.max(a, b);
        for (int i = 1; i <= a || i <= b; i++) {
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF : " + hcf);


        while(true) {
            if(lcm % a == 0 && lcm % b == 0 ){
                System.out.print("The LCM is : " + lcm) ;
                break;
            }
            ++lcm;
        }
    }
}
