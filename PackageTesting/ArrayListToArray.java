package PackageTesting;

import java.util.ArrayList;
import java.util.Arrays;
import AkPackage.InputOutput;


public class ArrayListToArray {
    public static void main(String[] args) {

        // method1();
        // method2();
        method3();
    }

    public static void method3() {
        ArrayListToArray ara = new ArrayListToArray();
        String fileName = ara.getClass().getSimpleName() + "testcases.txt";
        System.out.println(fileName);
    }

    public static void method2() {
        for (String string : InputOutput.takeCompleteInput()) {
            System.out.println("String is: " + string);
        }
    }

    public static void method1() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(Integer.parseInt("1"));
        list.add(Integer.parseInt("2"));
        list.add(Integer.parseInt("3"));
        list.add(Integer.parseInt("4"));

        Integer[] wrapperArr = list.toArray(new Integer[list.size()]);

        // If you want a `primitive` type array
        int[] arr = list.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(wrapperArr));    
        System.out.println(Arrays.toString(arr));
    }
}