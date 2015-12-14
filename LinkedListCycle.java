/**
 *
 * LeetCode.com
 *
 * Given a linked list, determine if it has a cycle in it.
 * Can you solve it without using extra space? 
 *
 *Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    if(head == null) return false;
    ListNode slow = head;
    ListNode fast = head;

    while(slow.next != null && fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) return true;
    }
    return false;
  }
}
