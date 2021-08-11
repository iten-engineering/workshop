package tree;

public class TestData {

	public static Node createHello() {
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
