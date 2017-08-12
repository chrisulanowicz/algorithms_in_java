public class Node {

	private Integer val;
	private Node next;

	public Node() {

	}

	public Node(Integer val) {
		this.val = val;
		this.next = null;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
		return this.val;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public Node getNext() {
		return this.next;
	}

	public boolean hasNext() {
		return this.next==null ? false : true;
	}

}