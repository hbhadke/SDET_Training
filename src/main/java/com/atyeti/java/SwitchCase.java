package com.atyeti.java;

import java.util.Scanner;
/*When Java reaches a break keyword, it breaks out of the switch block.
This will stop the execution of more code and case testing inside the block.
 When a match is found, and the job is done, it's time for a break. There is no need for more testing.
A break can save a lot of execution time because it "ignores" the execution of all the
rest of the code in the switch block.
 */
public class SwitchCase {
    public static  void switchCase(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter no. of day in week: ");
        int day = sc1.nextInt();

        switch (day) {
            case 1:
                System.out.println("WFH");
                break;
            case 2:
                System.out.println("WFO");
                break;
            case 3:
                System.out.println("WFO1");
                break;
            case 4:
                System.out.println("WFO2");
                break;
            case 5:
                System.out.println("WFH1");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend1");
                break;
            default:
                System.out.println("Invalid");
        }
    }

}
