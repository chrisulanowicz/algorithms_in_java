import java.util.HashMap;

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
	//	contains
	//	front
	//	frontTernary
	//	isEmpty
	//	length
	//	maxToBack
	//	minMaxAverage
	//	prependValue
	// 	printValues
	//	removeBack
	//	removeFront
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

	public boolean contains(int val) {
		Node current = this.head;
		while(current != null) {
			if(current.getVal() == val) {
				return true;
			}
			current = current.getNext();
		}
		return false;
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

	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;

		//ternary version
		// return this.head == null ? true : false
	}

	public int length() {
		int count = 0;
		Node current = this.head;
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public void maxToBack() {
		Node previous = null;
		Node current = this.head == null ? new Node() : this.head;
		Node max = current;
		while(current.hasNext()) {
			if(current.getNext().getVal() > max.getVal()) {
				previous = current;
				max = current.getNext();
			}
			current = current.getNext();
		}
		if(max != current) {
			if( previous == null) {
				this.setHead(max.getNext());
			}
			else {
				previous.setNext(max.getNext());
			}
			current.setNext(max);
			max.setNext(null);
		}
	}

	public HashMap minMaxAverage() {
		HashMap<String, Double> result = new HashMap<String, Double>();
		Double min = null;
		Double max = null;
		Double sum = 0.0;
		int len = this.length(); // using length method defined above
		Node current = this.head;
		while(current != null) {
			if(min == null || current.getVal() < min) {
				min = (double) current.getVal();
			}
			if(max == null || current.getVal() > max) {
				max = (double) current.getVal();
			}
			sum += current.getVal();
			current = current.getNext();
		}
		result.put("min", min);
		result.put("max", max);
		result.put("average", sum/len);
		return result;
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

	public Node removeBack() {
		Node current = this.head;
		if(current == null) {
			return current;
		}
		else if(!current.hasNext()) {
			this.setHead(null);
			return current;
		}
		while(current.getNext().hasNext()) {
			current = current.getNext();
		}
		Node temp = current.getNext();
		current.setNext(null);
		return temp;
	}

	public Node removeFront() {
		Node temp = this.head;
		if(this.head != null) {
			this.setHead(this.head.getNext());
			temp.setNext(null);
		}
		return temp;
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









