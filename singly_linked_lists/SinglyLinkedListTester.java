public class SinglyLinkedListTester {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("This is the newly created and empty list: " + sll);
		sll.printValues();
		// Node testNode = new Node();
		// sll.setHead(testNode);
		// System.out.println("List with a new Node added as the head: " + sll);
		// System.out.println("The head which is now a node: " + sll.getHead());
		System.out.println(sll.removeValue(9)); // => null
		System.out.println(sll.back()); // => null
		sll.addFront(8);
		sll.printValues(); // => 8
		System.out.println(sll.back()); // => 8
		sll.addBack(4);
		sll.printValues(false); // => 8 \n 4
		sll.addBack(6);
		sll.printValues(true); // => 8->4->6
		sll.addFront(5);
		sll.printValues(true); // => 5->8->4->6
		sll.appendValue(9, 8);
		sll.printValues(true); // => 5->8->9->4->6
		sll.appendValue(2, 1);
		sll.printValues(true); // => 5->8->9->4->6->2
		sll.prependValue(7,5);
		sll.printValues(true); // => 7->5->8->9->4->6->2
		sll.prependValue(1, 9);
		sll.printValues(true); // => 7->5->8->1->9->4->6->2
		sll.prependValue(3,55);
		sll.printValues(true); // => 7->5->8->1->9->4->6->2->3
		System.out.println(sll.removeValue(1)); // => Node object 
		sll.printValues(true); // => 7->5->8->9->4->6->2->3
		System.out.println(sll.removeValue(22)); // => null
		System.out.println(sll.removeValue(7)); // => Node object
		sll.printValues(true); // => 5->8->9->4->6->2->3
		System.out.println(sll.back()); // => 3
	}

}