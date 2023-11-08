//FatemehKarami
public class LinkedListt {
	Node head;
	
	public void addFirst(int k) {
		Node newNode = new Node(k);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void add(int k) {
		Node newNode = new Node(k);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp .next;
		}
		temp.next = newNode;
	}
	
	public void print() {
		if (head == null) {
			System.out.println();
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp .next;
		}
	}
	
	public void findMiddle() {
		if (head == null) {
			System.out.println(-1);
		}
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter ++;
		}
		temp = head;
		int mid = Math.round((counter)/2);
		if (counter%2 == 0) {
			mid--;
		}
		for (int i = 1; i <= mid ; i++) {
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void removeMiddle() {
		if (head == null) {
			System.out.println("list is empty");
		}
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter ++;
		}
		temp = head;
		int mid = Math.round(counter/2);
		if (counter%2 == 0) {
			mid--;
		}
		for (int i = 1; i < mid ; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
	}
	
	public void contains(int k) {
		if (head == null) {
			System.out.println("list is empty");
		}
		Node temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.data == k) {
				System.out.println(index);
			}
			temp = temp.next;
			index++;
		}
		
	}
	
	public void removeIndex(int i) {
		Node temp = head;
		int counter = -1;
		while (temp != null) {
			temp = temp.next;
			counter ++;
		}
		temp = head;
		if (i == 0 && temp.next == null) {
			head = null;
		}
		else if (i == 1 && temp.next != null && temp.next.next == null) {
			temp.next = null;
		}
		else if (i>0 && i < counter) {
			for (int index = 0; index < counter ; index++) {
				if((i-1) == index) {
					break;
				}
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		else if (i == counter) {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
		else if(i == 0) {
			head = temp.next;
			temp = null;
		}
	}
	
}


