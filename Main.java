package com.greatlearning.DSAssisment.solution.question2;

import com.greatlearning.DSAssisment.solution.question2.Driver.Node;

public class Main {
	
	static Node prevNode = null;
	static Node headNode = null;
	// Function to convert the binary
	// search tree into a skewed tree in
	// Ascending order

	public Node skewedTree(Node root, int val) {
		// Base Case
		if (root == null) {
			return null;
		}
		// Condition to check the order
		// in which the skewed tree to
		// maintained
		if (val > 0) {
			skewedTree(root.right, val);
		} else {
			skewedTree(root.left, val);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		// Similarly recurse for the right
		// subtree on the basis of the order required
		if (val > 0) {
			skewedTree(leftNode, val);
		} else {
			skewedTree(rightNode, val);
		}
		return headNode;
	}

	// Function to traverse the right
	// skewed tree using recursion
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
