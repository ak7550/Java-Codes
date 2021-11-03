package AkPackage;

import java.util.Arrays;

public class SegmentTree {
    private int arr[], segTree[];

    public SegmentTree(int a[]) {
        arr = a;
        createTree();
    }

    private void createTree() {
        segTree = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++)
            segTree[arr.length + i] = arr[i];

        for (int i = arr.length - 1; i > 0; --i)
            segTree[i] = segTree[i << 1] + segTree[(i << 1) | 1];

        // System.out.println(Arrays.toString(segTree));
    }

    public void setArray(int index, int val) {
        if (index < arr.length) {
            arr[index] = val;
            updateTree(index, val);
        }
    }

    private void updateTree(int index, int val) {
        segTree[index + arr.length] = val;
        index += arr.length;

        for (int i = index; i > 1; i >>= 1)
            segTree[i >> 1] = segTree[i] + segTree[i ^ 1]; // updating parent only ==> even and odd pair i, i^1
    }

    //-> get range query exclusive [start, end]
    public int getRangeQuery(int start, int end) {
        end += 1;
        int res = 0;
        for (start += arr.length, end += arr.length; start < end; start >>= 1, end >>= 1) {
            if ((start & 1) == 1)
                res += segTree[start++];
            if ((end & 1) == 1)
                res += segTree[--end];
        }
        return res;
    }

    public int getRangeQuery(int end) {
        return end < arr.length && end >= 0 ? getRangeQuery(0, end) : -1;
    }

}
