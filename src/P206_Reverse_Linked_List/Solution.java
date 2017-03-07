package P206_Reverse_Linked_List;

/**
 * Created by LINGXIAOYUN on 2017/3/7.
 *
 * @author LINGXIAOYUN
 *
 *         Reverse a singly linked list.
 */
public class Solution {

  public ListNode reverseList(ListNode head) {
    ListNode first = head;
    ListNode tail = new ListNode(0);
    ListNode temp = tail.next;

    while (first != null) {
      tail.next = first;
      first = first.next;
      tail.next.next = temp;
      temp = tail.next;
    }

    return tail.next;
  }
}
