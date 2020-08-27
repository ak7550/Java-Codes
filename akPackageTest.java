import java.util.ArrayList;
import java.util.Arrays;

import AkPackage.InputOutput;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = InputOutput.takeCompleteInput(new akPackageTest());
        while (!lines.isEmpty()) {
            int input[] = InputOutput.arrayFromString(lines.remove(0));
            System.out.println(Arrays.toString(input));
        }
    }
}
