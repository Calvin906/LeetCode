package Algorithms;

/**
 * Created by Wags on 3/21/17.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode x1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);

        x1.next = x2;
        x2.next = x3;
        x3.next = null;

        ListNode y1 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4);

        y1.next = y2;
        y2.next = y3;
        y3.next = null;


        printList(addTwoNumbers(x1, y1));

    }

    public static void printList(ListNode l) {
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p/>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode copy1 = l1;
        ListNode copy2 = l2;
        ListNode result = new ListNode(0);
        ListNode d = result;
        int sum = 0;
        while (copy1 != null || copy2 != null) {
            sum /= 10;
            if (copy1 != null) {
                sum += copy1.val;
                copy1 = copy1.next;
            }
            if (copy2 != null) {
                sum += copy2.val;
                copy2 = copy2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1) {
            d.next = new ListNode(1);
        }
        return result.next;
    }

    /**
     * Class for ListNode
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}