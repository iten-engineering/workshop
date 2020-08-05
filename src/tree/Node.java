package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private Node parent;
	private List<Node> childs = new ArrayList<>();
	private String value;

	//
	// constructors
	//
	public Node() {
		super();
	}

	public Node(String value) {
		this.value = value;
	}

	//
	// methods
	//
	public boolean isRoot() {
		return (parent == null);
	}

	public boolean isLeaf() {
		return childs.isEmpty();
	}

	public Node addChild(Node node) {
		childs.add(node);
		return node;
	}

	public Node addChild(String value) {
		Node node = new Node(value);
		return addChild(node);
	}

	//
	// getters and setters
	//
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Node> getChilds() {
		return childs;
	}

	public void setChilds(List<Node> childs) {
		this.childs = childs;
	}

}
