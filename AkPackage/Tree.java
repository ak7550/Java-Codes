package AkPackage;

import java.util.*;

public class Tree {
    public int data;
    public Tree left, right;

    public Tree(int d) {
        data = d;
        left = right = null;
    }

    public static void preorderTraversal(Tree root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void levelorderTraversal(Tree root) {
        ArrayDeque<Tree> ad = new ArrayDeque<>();
        if (root == null)
            return;
        ad.add(root);
        while (!ad.isEmpty()) {
            Tree temp = ad.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                ad.add(temp.left);
            if (temp.right != null)
                ad.add(temp.right);
        }
    }

    public static void inorderTraversal(Tree root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static Tree createBinaryTree(ArrayList<Integer> arr) {
        return createBinaryTree(arr, null);
    }

    public static Tree createBinaryTree(ArrayList<Integer> arr, Tree root) {
        ArrayDeque<Tree> deq = new ArrayDeque<>();
        deq.add(new Tree(arr.remove(0)));
        root = deq.peekFirst();
        while (!deq.isEmpty()) {
            Tree temp = deq.poll();
            if (!arr.isEmpty() && arr.get(0).equals(-1)) {
                temp.left = null;
                arr.remove(0);
            } else if (!arr.isEmpty()) {
                temp.left = new Tree(arr.remove(0));
                deq.add(temp.left);
            }
            if (!arr.isEmpty() && arr.get(0).equals(-1)) {
                temp.right = null;
                arr.remove(0);
            } else if (!arr.isEmpty()) {
                temp.right = new Tree(arr.remove(0));
                deq.add(temp.right);
            }
        }
        return root;
    }

    public static Tree createBST(ArrayList<Integer> arr) {
        return createBST(arr, null);
    }

    public static Tree createBST(ArrayList<Integer> arr, Tree root) {
        for (int x : arr)
            root = insertInToBST(root, x);
        return root;
    }

    public static Tree insertInToBST(Tree root, int x) {
        Tree parent = searchInToBST(root, x);
        // when root is null
        if (parent == null)
            return new Tree(x);
        else if (parent.data < x)
            parent.right = new Tree(x);
        else
            parent.left = new Tree(x);
        return root;
    }

    public static Tree searchInToBST(Tree root, int x) {
        if (root == null)
            return null;
        Tree parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.data == x)
                return curr;
            else if (curr.data < x)
                curr = curr.right;
            else
                curr = curr.left;
        }
        return parent;
    }

}
