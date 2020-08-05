package tree;

public class NodeDemo {

	public static void main(String[] args) {

		Node root = buildTree();
		traverse(root);

	}

	// https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
	// https://stackoverflow.com/questions/5987867/traversing-a-n-ary-tree-without-using-recurrsion
	public static void traverse(Node node) {
		System.out.print(node.getValue());

		for (Node child : node.getChilds()) {
			traverse(child);
		}
	}

	public static Node buildTree() {
		Node root = new Node("H");

		Node e = root.addChild("E");
		e.addChild("L");
		e.addChild("L");
		e.addChild("O");

		Node w = root.addChild("W");
		w.addChild("O");
		w.addChild("R").addChild("L");

		root.addChild("D");

		return root;
	}

}
