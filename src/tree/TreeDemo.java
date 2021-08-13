package tree;

import java.util.Iterator;
import java.util.Stack;

public class TreeDemo {

	public static void main(String[] args) {
		Node root = TestData.createHello();
		recursion(root);
		System.out.println();
		traverse(root);
	}

	public static void recursion(Node node) {
		System.out.print(node.getValue());

		for (Node child : node.getChilds()) {
			recursion(child);
		}
	}

	public static void traverse(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.add(root);
		
		while (! stack.isEmpty() ) {
			Node node = stack.pop();
			System.out.print(node.getValue());
			
			int len = node.getChilds().size();
			for (int i = len-1; i >= 0; i--) {
				stack.add(node.getChilds().get(i));				
			}
		}
		
	}
	
}
