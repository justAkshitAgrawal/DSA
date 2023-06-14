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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp = new ListNode();

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];

            while (node != null) {
                pq.add(node);
                ListNode next = node.next;
                node.next = null;
                node = next;
            }
        }

        ListNode head = temp;

        while (!pq.isEmpty()) {
            head.next = pq.poll();
            head = head.next;
        }

        return temp.next;
    }
}