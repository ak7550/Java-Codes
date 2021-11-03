import AkPackage.*;
import java.util.*;


public class akPackageTest {
    public static void main(String args[]){
        ArrayList<String> lines= InputOutput.takeCompleteInput(new akPackageTest());
        while (!lines.isEmpty()) {
            int arr[] = InputOutput.arrayFromString(lines.remove(0));
            SegmentTree fenwick = new SegmentTree(arr);
            System.out.println(fenwick.getRangeQuery(8));
        }
    }
}