package AkPackage;

import java.util.Arrays;

public class FenwickTree {
    private int arr[], fTree[];

    public FenwickTree(int a[]) {
        arr = a;
        createTree();
    }

    private void createTree() {
        fTree = new int[arr.length + 1];

        for (int i = 1; i <= arr.length; i++)
            updateTree(arr[i - 1], i);

        System.out.println("Complete the fenwick tree: " + Arrays.toString(fTree));
        System.out.println("Sum of the whole array: " + Arrays.stream(arr).sum());
    }

    public void setArray(int val, int in) {
        arr[in] = val;
        updateTree(val, in+1);
    }

    private void updateTree(int val, int index) {
        while (index < fTree.length) {
            fTree[index] += val;
            index = getNext(index);
        }
    }

    /*
     * To get parent 1) 2's complement to get minus of index 2) AND this with index
     * 3) Subtract that from index
     */
    private int getParent(int a) {
        return a - (a & -a);
    }

    /**
     * To get next 1) 2's complement of get minus of index 2) AND this with index 3)
     * Add it to index
    */

    private int getNext(int a) {
        return a + (a & -a);
    }


    //-> sum in the range of [start, end]
    public int getRangeQuery(int start, int end) {
        return start <= end ?
                start == 0 ? getRangeQuery(end) : getRangeQuery(end) - getRangeQuery(start - 1) : -1;
    }

    public int getRangeQuery(int index) {
        index += 1;
        int sum = 0;
        while (index > 0) {
            sum += fTree[index];
            index = getParent(index);
        }
        return sum;
    }

    public int[] getArray() {
        return arr;
    }
}
