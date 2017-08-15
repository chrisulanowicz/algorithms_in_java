public class SinglyLinkedList {

	// main class constructors, getters, and setters

	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void setHead(Node node) {
		this.head = node;
	}

	public Node getHead() {
		return this.head;
	}

	// other methods
	// 	addBack
	//  addFront
	// 	printValues


	public void addBack(int val) {
		Node node = new Node(val);
		if(this.head == null) {
			this.setHead(node);
		}
		else {
			Node current = this.head;
			while(current.hasNext()) {
				current = current.getNext();
			}
			current.setNext(node);
		}
	}

	public void addFront(int val) {
		Node node = new Node(val);
		if(this.head != null) {
			node.setNext(this.head);
		}
		this.setHead(node);
	}

	public void printValues() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getVal());
			current = current.getNext();
		}
	}

}