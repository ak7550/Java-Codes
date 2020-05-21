import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import AkPackage.Array;
import AkPackage.InputOutput;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) {
        // int T = Array.takeUserInputAsIntegerArray()[0];
        for (String string : InputOutput.takeCompleteFileInput("fileName2.txt")) {
            System.out.println(string);
        }

        
       
        ArrayList<String> lines = InputOutput.takeCompleteFileInput(new akPackageTest());
        System.out.println("Read from the file.");
        for (String string : lines) {
            System.out.println(string);
        }     
    }

}