package com.hack;

public class BinaryTreeArithmeticSolution {

    public static void main(String[] args) throws Exception {
        System.out.println("BinaryTreeArithmeticSolution.main");
        Node root = createBinaryTree();

        System.out.println(solve(root));

    }

    private static int solve(Node node) throws Exception {
        Integer value = null;
        if(node.getLeft() != null && node.getRight() != null) {
            switch (node.getNodeValue()){
                case("+"):
                    return solve(node.getLeft()) + solve(node.getRight());
                case("-"):
                    return solve(node.getLeft()) - solve(node.getRight());
                case("*"):
                    return solve(node.getLeft()) * solve(node.getRight());
                case("/"):
                    return solve(node.getLeft()) / solve(node.getRight());
                default:
                    throw new Exception("Arithmetic binary tree is not correct");
            }
        }
         else{
             return Integer.valueOf(node.getNodeValue());
        }
    }

    private static Node createBinaryTree() {
        Node n1 = new Node("5",null,null);
        Node n2 = new Node("3",null,null);

        Node n4 = new Node("6",null,null);
        Node n5 = new Node("7",null,null);

        Node n7 =  new Node("-",n1,n4);
        Node n8 = new Node("+",n2,n7);
        Node n9 = new Node("+",n4,n5);
        Node n11 = new Node("-",n8,n1);
        Node n12 = new Node("*",n11,n9);
        return n12;
    }
}

class Node{
    String nodeValue;
    Node left;
    Node right;

    public Node(String nodeValue, Node left, Node right) {
        this.nodeValue = nodeValue;
        this.left = left;
        this.right = right;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
