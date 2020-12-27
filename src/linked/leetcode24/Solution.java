package linked.leetcode24;

// https://leetcode-cn.com/problems/swap-nodes-in-pairs/
public class Solution {
    /**
     * 使用递归将相邻的两个个节点交换
     *
     * @param head 头节点
     * @return 返回新的头节点
     */
    public ListNode swapPairs(ListNode head) {
        // 判空,若当前的节点为空,或下个节点为空,则不处理此节点,将头节点返回
        if (head == null || head.next == null) {
            return head;
        }
        // 获取新的头节点,指向头节点的下一个节点
        ListNode newHead = head.next;
        // 头节点的下一个节点,指向当前俩个节点的下一个节点
        head.next = swapPairs(newHead.next);
        // 新的头节点,指向下一个节点
        newHead.next = head;
        return newHead;
    }

    /**
     * 使用循环将相邻的两个个节点交换
     *
     * @param head 头节点
     * @return 返回新的头节点
     */
    public ListNode swapPairs1(ListNode head) {

        // 新建头节点
        ListNode newHead = new ListNode();
        // 使头节点指向第一个节点
        newHead.next = head;
        ListNode temp = newHead;
        while (temp.next != null && temp.next.next != null) {
            // 提取出第一个节点和第二个节点
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            // 将节点指向调换位置
            node1.next = node2.next;
            temp.next = node2;
            node2.next = node1;
            // 将头节点指向当前循环的第二个节点
            temp = node1;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode temp = listNode4;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }

        System.out.println("\n");

        ListNode listNode = solution.swapPairs(listNode4);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }
}

