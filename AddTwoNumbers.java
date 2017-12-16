/*

LeetCode

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int num = l1.val + l2.val;
        int carry = 0;
        if(num > 9){
            carry = num / 10;
            num %= 10;
        }else{
            carry = 0;
        }
        ListNode head = new ListNode(num);
        ListNode cur = head;
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            num = l1.val + l2.val + carry;
            if(num > 9){
                carry = num / 10;
                num %= 10;
            }else{
                carry = 0;
            }
            ListNode next = new ListNode(num);
            cur.next = next;
            cur = cur.next;
        }
        
        while(l1.next != null){
            l1 = l1.next;
            num = l1.val + carry;
            if(num > 9){
                carry = num / 10;
                num %= 10;
            }else{
                carry = 0;
            }
            ListNode next = new ListNode(num);
            cur.next = next;
            cur = cur.next;
        }
        
        while(l2.next != null){
            l2 = l2.next;
            num = l2.val + carry;
            if(num > 9){
                carry = num / 10;
                num %= 10;
            }else{
                carry = 0;
            }
            ListNode next = new ListNode(num);
            cur.next = next;
            cur = cur.next;
        }
        
        if(carry != 0){
            ListNode next = new ListNode(carry);
            cur.next = next;
            cur = cur.next;
        }
        return head;
        
    }
}