package P237_Delete_Node_in_a_Linked_List;

/**
 * Created by LINGXIAOYUN on 2017/2/28.
 *
 * @author LINGXIAOYUN
 *
 *         Write a function to delete a node (except the tail) in a singly linked list, given only
 *         access to that node.
 *
 *         Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value
 *         3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class Solution {

  public void deleteNode(ListNode node) {
    ListNode prior = new ListNode(1);
    prior.next = node;
    if (node.next == null) {
      return;
    }
    while (node.next != null) {
      node.val = node.next.val;
      node = node.next;
      prior = prior.next;
    }
    prior.next = null;
  }
}
