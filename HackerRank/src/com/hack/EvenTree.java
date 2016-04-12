package com.hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author msaniar
 *https://www.hackerrank.com/challenges/even-tree
 *
 *Problem Statement

You are given a tree (a simple connected graph with no cycles). You have to remove as many edges from the tree as possible to obtain a forest with the condition that : Each connected component of the forest should contain an even number of vertices.

To accomplish this, you will remove some edges from the tree. Find out the number of removed edges.

Input Format 
The first line of input contains two integers N and M. N is the number of vertices and M is the number of edges. 
The next M lines contain two integers ui and vi which specifies an edge of the tree. (1-based index)

Output Format 
Print the answer, a single integer.

Constraints 
2 <= N <= 100.

Note: The tree in the input will be such that it can always be decomposed into components containing even number of nodes.

Sample Input

10 9
2 1
3 1
4 3
5 2
6 1
7 2
8 6
9 8
10 8
Sample Output

2
Explanation  
On removing edges (1, 3) and (1, 6), we can get the desired result.



 */
public class EvenTree {

	private static int x=0;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] N = scanner.nextLine().split(" ");
		//String M = scanner.nextLine();
		EvenTree evenTree = new EvenTree();
		Map<String, Node<String>> map = new HashMap<String, EvenTree.Node<String>>();
		for(int i = 0;i<Integer.valueOf(N[0].trim())-1;i++){
			String[] edges = scanner.nextLine().split(" ");
			Node<String> node1;
			if(map.get(edges[1])==null){
				node1 = evenTree.new Node<>(edges[1]);
				map.put(edges[1], node1);
			}
			else{
				node1 = map.get(edges[1]);
			}
			Node<String> node0 = evenTree.new Node<>(edges[0]);
			map.put(edges[0], node0);
			node1.addChild(node0);
		}
		/*Iterator<Node<String>> m = map.values().iterator();
		while(m.hasNext()){
			Node<String> node = m.next();
			getCount(node);
		}*/
		Integer count = 0;
		int c = getCount(map.get("1").getChildren(),count);
		System.out.println(c);
	}
	
	 private static int getCount(List<Node<String>> children, Integer count) {
		
		for( Node<String> n: children){
			if(n.getChildren().isEmpty()){
				if(count>0 && count%2==0){
					count = 0;
					x= x+1;
				}
				else{
					return count= count+1;
				}
			}
			else{
				count= getCount(n.getChildren(),count);
			}
		}
		return x+1;
	}

	class Node<T> {
	    private List<Node<T>> children = new ArrayList<Node<T>>();
	    private Node<T> parent = null;
	    private T data = null;

	    public Node(T data) {
	        this.data = data;
	    }

	    public Node(T data, Node<T> parent) {
	        this.data = data;
	        this.parent = parent;
	    }

	    public List<Node<T>> getChildren() {
	        return children;
	    }

	    public void setParent(Node<T> parent) {
	        //parent.addChild(this);
	        this.parent = parent;
	    }

	    public void addChild(T data) {
	        Node<T> child = new Node<T>(data);
	        child.setParent(this);
	        this.children.add(child);
	    }

	    public void addChild(Node<T> child) {
	        child.setParent(this);
	        this.children.add(child);
	    }

	    public T getData() {
	        return this.data;
	    }

	    public void setData(T data) {
	        this.data = data;
	    }

	    public boolean isRoot() {
	        return (this.parent == null);
	    }

	    public boolean isLeaf() {
	        if(this.children.size() == 0) 
	            return true;
	        else 
	            return false;
	    }

	    public void removeParent() {
	        this.parent = null;
	    }
	}
}
