// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-15-linked-list

import java.io.*;
import java.util.*;

class Node {
	int data; // data
	Node next;// reference
	Node(int d) {
        data = d; 
        next = null; 
    }
}

class Solution {
	/* Insert method */
	public static Node insert(Node head,int data) {
        
        Node node = new Node(data); /* insert data */
        Node nextNode = head;
        
        if (head == null){
            head = node;
            return head;
        }
        while(nextNode.next !=null){ /* insert next reference */
            nextNode = nextNode.next;
        }
        nextNode.next = node;
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
