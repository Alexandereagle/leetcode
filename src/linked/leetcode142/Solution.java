package linked.leetcode142;
//https://leetcode-cn.com/problems/linked-list-cycle-ii/
public class Solution {
    /**
     * 环形链表Ⅱ
     * @param head 头节点
     * @return 交叉节点
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode crossNode = getCrossNode(head);
        if (crossNode == null)
            return null;
        ListNode slow = head;
        while (crossNode != slow) {
            crossNode = crossNode.next;
            slow = slow.next;
        }
        return crossNode;
    }

    public ListNode getCrossNode(ListNode head) {
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow)
                return fast;
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }
}
