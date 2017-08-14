public class SinglyLinkedListTester {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("This is the newly created and empty list: " + sll);
		System.out.println("printed values: ");
		sll.printValues();
		// Node testNode = new Node();
		// sll.setHead(testNode);
		// System.out.println("List with a new Node added as the head: " + sll);
		// System.out.println("The head which is now a node: " + sll.getHead());
		sll.addBack(4);
		System.out.println("List with one node added: " + sll);
		System.out.println("printed values: ");
		sll.printValues();
		sll.addBack(6);
		sll.printValues();

	}

}