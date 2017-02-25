package P203_Remove_Linked_List_Elements;


/**
 * Created by LINGXIAOYUN on 2017/2/25.
 */
public class Solution {

  public ListNode removeElements(ListNode head, int val) {
    ListNode before = new ListNode(1);
    before.next = head;
    
    while (before.next != null) {
      if (before.next.val == val) {
        if (before.next == head) {
          head = head.next;
        }
        before.next = before.next.next;
      } else {
        before = before.next;
      }
    }
    
    return head;
  }
}
