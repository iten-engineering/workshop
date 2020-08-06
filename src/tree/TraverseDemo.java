package tree;

import java.util.Stack;

public class TraverseDemo {

	public static void main(String[] args) {
		Node root = Testdata.buildHelloWorld();
		traverse(root);

	}

	public static void traverse(Node root) {

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.getValue());

			int len = node.getChilds().size();
			for (int i = len - 1; i >= 0; i--) {
				stack.push(node.getChilds().get(i));
			}
		}
	}

}
