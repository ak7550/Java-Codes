package practise;

import java.util.Scanner;

/**
 * TakingUserInput
 */
public class TakingUserInput {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = myobj.next();
        System.out.println("The string is: " + str);
        myobj.close();
        str = "1 2 3 4 5 6";
        System.out.println();
    }
}