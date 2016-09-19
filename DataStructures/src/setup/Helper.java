package setup;

import datastruct.Node;

public class Helper {
	public static Node createLinkedList(int[] num) {
		Node head = null;
		for (int i = 0; i < num.length; i++) {
			Node temp = head;
			head = new Node(num[i]);
			head.next = temp;
		}
		printList(head);
		return head;
	}
	
	public static void printList(Node head) {
		System.out.print("\nList = [ ");
		while(head != null) {
			System.out.print(head.val + ", ");
			head = head.next;
		}
		System.out.print("]");
	}
}
