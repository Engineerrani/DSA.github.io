package dsa.assignment.java;

public class MiddleOfSLL {

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
public class ListNode {
	int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public ListNode middleNode(ListNode head) {
  ListNode slow = head, fast = head;
  
  while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
      fast = fast.next;
  }
  
  return slow;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}

