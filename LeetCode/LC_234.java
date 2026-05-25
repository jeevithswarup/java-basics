import java.util.*;

public class LC_234 {

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode second = prev;
        ListNode temp = head;

        while (second != null) {
            if (temp.val != second.val) {
                return false;
            }
            second = second.next;
            temp = temp.next;
        }

        return true;
    }

}

