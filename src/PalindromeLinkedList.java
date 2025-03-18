public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public boolean isPalindrome(ListNode head) {

        ListNode mid = null;
        ListNode slow = head;
        ListNode fast = head;
//       найти середину
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        mid = slow;
//       развернуть с середины
        ListNode curr = mid;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
//       сравнить с середины
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

}
