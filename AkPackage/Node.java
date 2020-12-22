package AkPackage;

import java.util.ArrayList;

/**
 * Node
 */
public class Node {

    public int data;
    public Node next, prev;

    public Node(int d) {
        data = d;
    }

    public static Node getLinkedList(ArrayList<Integer> arr) {
        Node head = null, tail = null;
        for (Integer x : arr) {
            if (head == null) {
                head = new Node(x);
                tail = head;
            } else {
                tail.next = new Node(x);
                tail = tail.next;
            }
        }
        return head;
    }
    public static Node getLinkedList(String str) {
        Node head = null, tail = null;
        for (String s : str.split(" ")) {
            int x = Integer.parseInt(s);
            if (head == null) {
                head = new Node(x);
                tail = head;
            } else {
                tail.next = new Node(x);
                tail = tail.next;
            }
        }
        return head;
    }

    public static Node getDoublyLinkedList(String line) {
        Node head = null, tail = null;
        for (String s : line.split(" ")) {
            int x = Integer.parseInt(s);
            if (head == null) {
                head = new Node(x);
                tail = head;
            } else {
                Node temp = new Node(x);
                tail.next = temp;
                temp.prev = tail;
                tail = tail.next;
            }
        }
        return head;
    }

    public static Node getDoublyLinkedList(ArrayList<Integer> arr) {
        Node head = null, tail = null;
        for (int x : arr) {
            if (head == null) {
                head = new Node(x);
                tail = head;
            } else {
                Node temp = new Node(x);
                tail.next = temp;
                temp.prev = tail;
                tail = tail.next;
            }
        }
        return head;
    }
}
