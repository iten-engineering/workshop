package tree;

public class TreeDemo {

	public static void main(String[] args) {
		Node root = TestData.createHello();
		recursion(root);
	}

	public static void recursion(Node node) {
		System.out.print(node.getValue());

		for (Node child : node.getChilds()) {
			recursion(child);
		}
	}

}
