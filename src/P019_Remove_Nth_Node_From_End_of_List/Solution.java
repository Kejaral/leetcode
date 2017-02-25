package P019_Remove_Nth_Node_From_End_of_List;

/**
 * Created by LINGXIAOYUN on 2017/2/24.
 *
 * @author LINGXIAOYUN
 */
public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    first.next = second.next = head;

    for (int i = 0; i < n; i++) {
      second = second.next;
    }

    if (second.next == null) {
      return head.next;
    }

    while (second.next != null) {
      first = first.next;
      second = second.next;
    }

    first.next = first.next.next;

    return head;
  }
}
