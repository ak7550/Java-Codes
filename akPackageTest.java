// process of checking
// 1) try to make a new file
// put input inside it
// then try to read and manipulate then put more testcases

import AkPackage.*;
import java.util.*;


public class akPackageTest {
    public static void main(String args[]){
        ArrayList<String> lines= InputOutput.takeCompleteInput(new akPackageTest());
        lines.forEach(System.out::println);
    }
}