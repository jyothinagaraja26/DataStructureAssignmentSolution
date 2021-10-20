package com.greatlearning.DSAssisment.solution.question2;

public class Driver {

	public static Node node;

	// Class of the node
	static class Node {
		int val;
		Node left, right;

		Node(int item) {
			val = item;
			left = right = null;
		}

		// Driver Code
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			node = new Node(50);
			node.left = new Node(30);
			node.right = new Node(60);
			node.left.left = new Node(10);
			node.right.left = new Node(55);
			int val = 0;
			Main main = new Main();
			Node headNode = main.skewedTree(node, val);
			main.traverseRightSkewed(headNode);
		}
	}
}
