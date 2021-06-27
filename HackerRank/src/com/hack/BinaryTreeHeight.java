package com.hack;

import java.util.*;

/**
 * The height of a binary tree is the number of edges between the tree's root and its furthest leaf. For example, the following binary tree is of height :
 *
 * image
 * Function Description
 *
 * Complete the getHeight or height function in the editor. It must return the height of a binary tree as an integer.
 *
 * getHeight or height has the following parameter(s):
 *
 * root: a reference to the root of a binary tree.
 * Note -The Height of binary tree with single node is taken as zero.
 *
 * Input Format
 *
 * The first line contains an integer , the number of nodes in the tree.
 * Next line contains  space separated integer where th integer denotes node[i].data.
 *
 * Note: Node values are inserted into a binary search tree before a reference to the tree's root node is passed to your function. In a binary search tree, all nodes on the left branch of a node are less than the node value. All values on the right branch are greater than the node value.
 *
 *
 */
public class BinaryTreeHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Node root = null;
        BinaryTreeHeight instance = new BinaryTreeHeight();
        while(size-- > 0){
            int data = scanner.nextInt();
            root = instance.insert(root,data);
        }
        scanner.close();
        int height = getHeight(root);
        System.out.println(height);
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            if(leftHeight>rightHeight){
                return (leftHeight+1);
            }
            else{
                return (rightHeight+1);
            }
        }
    }


    private  Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }
        else{
            if(data <= root.value){
                Node current = insert(root.left, data);
                root.left = current;
            }
            else{
                Node current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }

    class Node{
        int value;
        Node left;
        Node right;


        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(int value) {
            this.value = value;
        }


    }

}


