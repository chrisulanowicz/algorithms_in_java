public class SinglyLinkedListTester {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("This is the newly created and empty list: " + sll);
		System.out.println("Here's the head of the newly created and empty list: " + sll.getHead());
		Node testNode = new Node();
		sll.setHead(testNode);
		System.out.println("List with a new Node added as the head: " + sll);
		System.out.println("The head which is now a node: " + sll.getHead());

	}

}