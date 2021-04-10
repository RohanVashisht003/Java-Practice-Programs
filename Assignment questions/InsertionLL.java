package Medium;

import java.util.Scanner;

public class InsertionLL {

	public class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public class LinkedList {
		Node head;
		Node tail;

		LinkedList() {
			head = null;
			tail = null;
		}

		public void addLast(int x) {
			Node n = new Node(x);
			if (head == null) {
				addFirst(x);
			} else {
				tail.next = n;
				tail = n;
			}
		}

		public void addFirst(int x) {
			Node n = new Node(x);
			if (head == null) {
				head = n;
				tail = head;
			} else {
				n.next = head;
				head = n;
			}
		}

		public int length() {
			Node temp = head;
			int len = 0;
			while (temp != null) {
				temp = temp.next;
				len++;
			}
			return len;
		}

		public void addPos(int x, int pos) {
			if (pos == 0) {
				addFirst(x);
			} else if (pos >= length()) {
				addLast(x);
			} else {
				int count = 0;
				Node temp = head;
				Node n = new Node(x);
				while (count < pos - 1) {
					temp = temp.next;
					count++;
				}
				n.next = temp.next;
				temp.next = n;
			}
		}

		public void deleteFirst() {
			Node temp = head;
			if (head != null) {
				head = head.next;
			}
		}

		public void deleteLast() {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		}

		public void deletePos(int pos) {
			if (pos == 0) {
				deleteFirst();
			} else if (pos >= length()) {
				deleteLast();
			} else {
				Node temp = head;
				int count = 0;
				while (count < pos - 1) {
					temp = temp.next;
					count++;
				}
				temp.next = temp.next.next;
			}
		}

		public Node findMid() {
			Node fastptr = head.next;
			Node slowptr = head;
			while (fastptr != null && fastptr.next != null) {
				slowptr = slowptr.next;
				fastptr = fastptr.next.next;
			}
			return slowptr;
		}

		

		public Node mergeSort(Node head) {
			if (head == null || head.next == null) {
				return head;
			}
			Node mid = findMid();

			Node a = head;
			Node b = mid.next;

			// break bond
			mid.next = null;

			a = mergeSort(a);
			b = mergeSort(b);

			// merge
			Node newNode = mergeLL(a, b);
			return newNode;
			
		}

		public void print() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		public Node mergeLL(Node a, Node b) {
			if (a == null) {
				return b;
			}
			if (b == null) {
				return a;
			}

			Node c;
			if (a.data < b.data) {
				c = a;
				c.next = mergeLL(a.next, b);
			} else {
				c = b;
				c.next = mergeLL(a, b.next);
			}
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		InsertionLL l = new InsertionLL();
		InsertionLL.LinkedList l1 = l.new LinkedList();
		InsertionLL.LinkedList l2 = l.new LinkedList();
		
	}

}
