package com.greatlearning;

import java.util.ArrayList;

import com.greatlearning.services.BinarySeachTreeTraversal;
import com.greatlearning.services.Node;

public class Driver {
	public static void main(String[] args) {

		ArrayList<Integer> input = new ArrayList<Integer>();
		Node root = new Node(50);
		input.add(root.data);
		root.leftNode = new Node(30);
		input.add(root.leftNode.data);
		root.leftNode.leftNode = new Node(10);
		input.add(root.leftNode.leftNode.data);
		root.rightNode = new Node(60);
		input.add(root.rightNode.data);
		root.rightNode.leftNode = new Node(55);
		input.add(root.rightNode.leftNode.data);

		
// Displaying the Input 
		System.out.print("Input Tree => ");
		for (int i = 0; i < input.size(); i++) {
			if (i == input.size() - 1) {
				System.out.print(input.get(i));
			} else {
				System.out.print(input.get(i) + "->");
			}
		}

		System.out.println();
		System.out.println();


				ArrayList<Integer> output = BinarySeachTreeTraversal.traversal(root);
// Displaying the Output
				System.out.print("Output Tree => ");
				for (int i = 0; i < output.size(); i++) {
					if (i == input.size() - 1) {
						System.out.print(output.get(i));
					} else {
						System.out.print(output.get(i) + "->");
					}
				}
			}

}
