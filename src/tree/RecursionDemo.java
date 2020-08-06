package tree;

public class RecursionDemo {

	public static void main(String[] args) {

		Node root = Testdata.buildHelloWorld();
		recursion(root);

	}

	public static void recursion(Node node) {
		System.out.print(node.getValue());

		for (Node child : node.getChilds()) {
			recursion(child);
		}
	}

}
