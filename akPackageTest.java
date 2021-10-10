import AkPackage.*;
import java.util.*;


public class akPackageTest {
    public static void main(String args[]){
        ArrayList<String> lines= InputOutput.takeCompleteInput(new akPackageTest());
        while (!lines.isEmpty()) {
            int arr[] = InputOutput.arrayFromString(lines.remove(0));
            FenwickTree fenwick = new FenwickTree(arr);
            System.out.println("Array: ");
            System.out.println(Arrays.toString(fenwick.getArray()));
            System.out.print("Total sum: ");
            System.out.println(fenwick.getRangeQuery(arr.length - 1));
            System.out.print("Upto 5: ");
            System.out.println(fenwick.getRangeQuery(5));
            System.out.print("From 2 to 9: ");
            System.out.println(fenwick.getRangeQuery(2, 9));
            fenwick.setArray(25, 4);
            System.out.println("After updating 25,4: \n");
            System.out.println(Arrays.toString(fenwick.getArray()));
            System.out.println(fenwick.getRangeQuery(2, 9));
        }
    }
}