package com.hack;

import java.util.*;

/**
 * You are given pointer to the root of the binary search tree and two values v1  and v2.
 * You need to return the lowest common ancestor (LCA) of  and  in the binary search tree.
 *
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfNodes = scanner.nextInt();
        Node root = null;
        LowestCommonAncestor lca = new LowestCommonAncestor();
        while(noOfNodes-- > 0){
            int data = scanner.nextInt();
            root  = lca.insert(root,data);
        }

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        scanner.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);

    }

    private  Node insert(Node root, int data) {

        if (root == null){
            return new Node(data);
        }
        else{
            if (data < root.data) {
                Node current = insert(root.left,data);
                root.left = current;
            }
            else{
                Node current = insert(root.right,data);
                root.right = current;
            }
        }
        return root;
    }

    private static Node lca(Node root, int v1, int v2) {
        if(v1 < root.data && v2 > root.data){
            return  root;
        }
        else if(v1 < root.data && v2 < root.data){
            //use this if previous node is considered lca
            /*if (v1 == root.left.data || v2 == root.left.data) {
                return root;
            }*/
           return lca(root.left,v1,v2);
        }
        else if(v1 > root.data && v2 > root.data){
            //use this if previous node is considered lca
            /*if (v1 == root.right.data || v2 == root.right.data) {
                return root;
            }*/
            return lca(root.right,v1,v2);
        }

        return root;

    }

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
