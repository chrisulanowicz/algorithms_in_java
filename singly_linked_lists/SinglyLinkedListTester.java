public class SinglyLinkedListTester {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("This is the newly created and empty list: " + sll);
		sll.printValues();
		// Node testNode = new Node();
		// sll.setHead(testNode);
		// System.out.println("List with a new Node added as the head: " + sll);
		// System.out.println("The head which is now a node: " + sll.getHead());
		System.out.println("removed node is: " + sll.removeValue(9)); // => null
		System.out.println("back node is: " + sll.back()); // => null
		System.out.println("front node is: " + sll.front()); // => null
		System.out.println("front node is: " + sll.frontTernary()); // => null
		System.out.println("list contains val: " + sll.contains(2)); // => false
		System.out.println("is list empty?: " + sll.isEmpty()); // => true
		System.out.println("length is: " + sll.length()); // => 0
		sll.addFront(8);
		sll.printValues(); // => 8
		System.out.println("back node is: " + sll.back()); // => 8
		System.out.println("length is: " + sll.length()); // => 1
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
		System.out.println("removed node is: " + sll.removeValue(1)); // => Node object 
		sll.printValues(true); // => 7->5->8->9->4->6->2->3
		System.out.println("removed node is: " + sll.removeValue(22)); // => null
		System.out.println("removed node is: " + sll.removeValue(7)); // => Node object
		sll.printValues(true); // => 5->8->9->4->6->2->3
		System.out.println("back node is: " + sll.back()); // => 3
		System.out.println("front node is: " + sll.front()); // => 5
		System.out.println("front node is: " + sll.frontTernary()); // => 5
		System.out.println("list contains val: " + sll.contains(34)); // => false
		System.out.println("list contains val: " + sll.contains(4)); // => true
		System.out.println("is list empty?: " + sll.isEmpty()); // => false
		System.out.println("length is: " + sll.length()); // => 7
	}

}