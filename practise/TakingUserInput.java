import java.util.Scanner;

/**
 * TakingUserInput
 */
public class TakingUserInput {

    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=myobj.next();
        System.out.println("The string is: "+ str);
        myobj.close();
    }
}