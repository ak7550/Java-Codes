import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import AkPackage.Array;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) {
        // int T = Array.takeUserInputAsIntegerArray()[0];
        System.out.println("Enter the String: ");
        int T = takeUserInputAsIntegerArray()[0];
        int arr[] = takeUserInputAsIntegerArray();
        System.out.println(T + "\n" + Arrays.toString(arr));
    }

    
}