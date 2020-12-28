package linked.leetcode141;

//https://leetcode-cn.com/problems/linked-list-cycle/submissions/
public class Solution {
    /**
     * 环形链表
     * @param head 表的头节点
     * @return 判断是否是环
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}