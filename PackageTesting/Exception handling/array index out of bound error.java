import java.util.Arrays;

class Array {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Arrays.fill(arr, 0);
        System.out.println("The array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        String s=null; // s is not referencing to any where.
        try {
            // System.out.println(s.length()); // gonna give null pointer exception error
            // arr[100] = 6; // aray index out of bound error
            throw new Exception("message"); // control come at this line if there's no error at in the above lines
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured. The exception is: \n" + e.getClass());
        }
    }
}