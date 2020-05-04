import java.util.Scanner;
import java.lang.Math;

class Factorial {

    long fact(int n) {
        long f = 1;

        while (n > 0) {
            f = f * n;
            n = n - 1;
        }

        return f;
    }

    int noofdigit(long n) {
        System.out.println((Math.log(n)));
        return (int) Math.floor(Math.log10(n)) + 1;
    }

}

class NoOfDigitCountInFact {
    public static void main(String args[]) {
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number=" + n);
        Factorial f1 = new Factorial();
        long facto = f1.fact(n);
        System.out.println("Factorial=" + facto);
        System.out.println("No of Digit of Factorial= " + f1.noofdigit(facto));
    }
}