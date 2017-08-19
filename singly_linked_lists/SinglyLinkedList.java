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
	// 	addFront
	//	appendValue
	//	back
	//	front
	//	frontTernary
	//	prependValue
	// 	printValues
	//	removeValue


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

	// function that inserts a new node immediately after an existing node with a given value
	// if that value doesn't exist inside the list then just insert the new node at the end of the list
	public void appendValue(int val, int after) {
		Node node = new Node(val);
		if(this.head == null) {
			this.setHead(node);
			return;
		}
		Node current = this.head;
		while(current.hasNext() && current.getVal() != after) {
			current = current.getNext();
		}
		node.setNext(current.getNext());
		current.setNext(node);
	}

	public Integer back() {
		Node current = this.head;
		if(current == null) {
			return null;
		}
		while(current.hasNext()) {
			current = current.getNext();
		}
		return current.getVal();
	}

	public Integer front() {
		if(this.head == null) {
			return null;
		}
		return this.head.getVal();
	}

	public Integer frontTernary() {
		return this.head == null ? null : this.head.getVal();
	}

	public void prependValue(int val, int before) {
		Node node = new Node(val);
		if(this.head == null) {
			this.setHead(node);
		}
		else if(this.head.getVal() == before) {
			node.setNext(this.head);
			this.setHead(node);
		}
		else {
			Node current = this.head;
			while(current.hasNext() && current.getNext().getVal() != before) {
				current = current.getNext();
			}
			node.setNext(current.getNext());
			current.setNext(node);
		}
	}

	public void printValues() {
		System.out.println("printing values: ");
		Node current = this.head;
		while(current != null) {
			System.out.println(current.getVal());
			current = current.getNext();
		}
	}

	public void printValues(boolean asString) {
		if( asString == false) {
			this.printValues();
		}
		else {
			String listValues = "";
			Node current = this.head;
			while(current != null) {
				listValues += current.getVal() + "->";
				current = current.getNext();
			}
			listValues += "null";
			System.out.println(listValues);
		}
	}

	public Node removeValue(int val) {
		Node current = this.head;
		Node previous = null;
		while(current != null && current.getVal() != val) {
			previous = current;
			current = current.getNext();
		}
		if(previous != null && current != null) {
			previous.setNext(current.getNext());
			current.setNext(null);
		}
		else if(current != null) {
			this.setHead(current.getNext());
			current.setNext(null);
		}
		return current;
	}

}









