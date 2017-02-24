package P019_Remove_Nth_Node_From_End_of_List;

/**
 * Created by LINGXIAOYUN on 2017/2/24.
 * 
 * @author LINGXIAOYUN 
 */
public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = head;
    int length = 1;
    while (temp.next != null) {
      length++;
      temp = temp.next;
    }

    temp = head;

    if (n == length) {
      return head.next;
    }

    for (int i = 0; i < length - n - 1; i++) {
      temp = temp.next;
    }

    if (n == 0) {
      temp.next = null;
      return head;
    }

    temp.next = temp.next.next;
    return head;
  }
}
