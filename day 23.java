// https://www.hackerrank.com/challenges/30-binary-trees
// day 23: Breadth First Search

// Input (stdin)
// 6
// 3
// 5
// 4
// 7
// 2
// 1

// Output (stdout)
// 3 2 5 1 4 7 

import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
	static void levelOrder(Node root){
		LinkedList<Node> queue = new LinkedList<>();
		if(root==null){
		  return;
		} else {
		  	queue.add(root);
		  	while (!queue.isEmpty()){
				Node node = queue.remove();
				System.out.print(node.data+" ");
				if (node.left!=null){
				  	queue.add(node.left);
				} 
				if (node.right!=null){
				  	queue.add(node.right);
				}
		  	}
		}
	}
}

public static Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    } else {
        Node cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        } else {
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Node root=null;
    while(T-->0){
        int data=sc.nextInt();
        root=insert(root,data);
    }
    levelOrder(root);
}	
