package linkedlist;

public class Element {

	private String data;
	private Element prev;
	private Element next;

	public Element() {
		super();
	}

	public Element(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public Element getPrev() {
		return prev;
	}

	public void setPrev(Element prev) {
		this.prev = prev;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

}
