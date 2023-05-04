/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode rev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        while (rev != null) {
            if (head.val != rev.val) return false;
            head = head.next;
            rev = rev.next;
        }

        return true;
    }
}