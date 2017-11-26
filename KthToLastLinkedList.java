
public class KthToLastLinkedList {
	
	static ListNode reverseLinkedList(ListNode head){
		ListNode current = head;
		ListNode next = current.next;
		current.next = null;
		while(current!=null) {
			
			if(next  != null) {
				ListNode after = next.next;
				next.next = current;
				current = next;
				next = after;
			}
			else {
				break;
			}
		}
		return current;
	}
	
	static ListNode nthToLast(int n, ListNode head) {
		int i = 1;
		ListNode walker = head;
		while(i < n && walker.next!=null) {
			walker = walker.next;
			i++;
		}
		return walker;
	}
	

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = a.next = new ListNode(2);
		ListNode c = b.next = new ListNode(3);
		ListNode d = c.next = new ListNode(4);
		ListNode e = d.next = new ListNode(5);
		e.next = new ListNode(6);
		
		ListNode w = a;
		while (w != null) {
			System.out.println(w.val);
			w = w.next;
		}

		ListNode reversed = reverseLinkedList(a);
		ListNode ntl = nthToLast(4,reversed);
		System.out.println("_______");
		System.out.println(ntl.val);

	}

}
