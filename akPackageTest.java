import java.util.ArrayList;
import AkPackage.Array;
import AkPackage.InputOutput;

/**
 * akPackageTest
 */
public class akPackageTest {

    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = InputOutput.takeCompleteInput(new akPackageTest());
        while (!arr.isEmpty()) {
            int length = Integer.parseInt(arr.remove(0));
            int[] a = InputOutput.arrayFromString(arr.remove(0));
            System.out.println(a);
            int val = Array.kadane(a);
            System.out.println(val);
            
        }
    }
}