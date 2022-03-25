/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (41.44%)
 * Likes:    7710
 * Dislikes: 0
 * Total Accepted:    1.2M
 * Total Submissions: 3M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 
 * 题目数据保证列表表示的数字不含前导零
 * 
 * 
 */

// @lc code=start
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
// public class ListNode{
//              int val;
//              ListNode next;
//              ListNode() {}
//              ListNode(int val) { this.val = val; }
//              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head =null;
        ListNode tail =null;
        while(l1 != null||l2 != null) {
            // 获得两个链表的数字
            int n1 = l1 != null ? l1.val :0;
            int n2 = l2 != null ? l2.val :0;
            // 我们是一个节点一个节点考虑
            //carry表示的是前一个节点的进位
            int sum = n1+n2+carry;
            // 进位只需要为0或1
            carry=sum/10;
            // 头节点如果为空，就新建一个头节点
            if (head == null) {
                head = new ListNode(sum%10); //一个节点中储存0-9，所以要取模
                tail = head;
            }
            // 表示有头节点了，只需要操作tail添加后续节点
            else{
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            if(l1 != null) { // 如果l1空了，就停止遍历
                l1=l1.next;
            }
            if(l2 != null) {
                l2=l2.next;
            }
        }
        // 最后一个数字是否进位，如果要进位，就加一个值为1的节点
        if (carry != 0) {
            tail.next = new ListNode(1);
        }
        return head;
    }
}
// @lc code=end

