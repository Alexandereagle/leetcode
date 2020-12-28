package linked.leetcode206;
// https://leetcode-cn.com/problems/reverse-linked-list/

public class Solution {
    /**
     * 反转链表
     * @param head 头节点
     * @return 新的头节点
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode();
        while(head != null) {
            ListNode temp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = temp;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode listNode5 = new ListNode(5, listNode4);
        ListNode temp = listNode5;
        while (temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println("\n\n");
        temp = solution.reverseList(listNode5);

        while (temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
