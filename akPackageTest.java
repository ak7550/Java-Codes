import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import AkPackage.Array;
import AkPackage.CompetetiveCoding;
import AkPackage.InputOutput;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) {
        // int T = Array.takeUserInputAsIntegerArray()[0];
        int noOfTestCases = CompetetiveCoding.takeIntegerInput();
        while (noOfTestCases-- > 0) {
            int noOfStudentsC1 = CompetetiveCoding.takeIntegerInput();
            int noOfStudentsC2 = CompetetiveCoding.takeIntegerInput();
            int[] marksOfC1 = CompetetiveCoding.takeIntegerArrayInput(noOfStudentsC1);
            int[] marksOfC2 = CompetetiveCoding.takeIntegerArrayInput(noOfStudentsC2);
            System.out.println(
                    (CompetetiveCoding.sumOfArrayElements(marksOfC1) > CompetetiveCoding.sumOfArrayElements(marksOfC2))
                            ? "C1"
                            : "C2");
        }
    }

}