
public class RemoveLinkedListDuplicates {
	
	public static void removeDupes(ListNode head) {
		ListNode current = head;
		ListNode runner = current;
		while(current != null) {
			runner = current;
			while(runner!= null) {
				if(runner.next!=null && current.val == runner.next.val) {
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = a.next = new ListNode(5);
		ListNode c = b.next = new ListNode(9);
		ListNode d = c.next = new ListNode(5);
		ListNode e = d.next = new ListNode(3);
		e.next = new ListNode(3);
		
		ListNode w = a;
		while (w != null) {
			System.out.println(w.val);
			w = w.next;
		}
		removeDupes(a);
		System.out.println("_______");
		w = a;
		while (w != null) {
			System.out.println(w.val);
			w = w.next;
		}
		
	}
}
