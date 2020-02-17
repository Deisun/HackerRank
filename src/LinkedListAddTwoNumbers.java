public class AddTwoNumbersLinkedList {

    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;


        int carry = 0;

        while (l1 != null || l2 != null) {

            int l1Value = (l1 != null) ? l1.val : 0;
            int l2Value = (l2 != null) ? l2.val : 0;

            int sum = l1Value + l2Value + carry;
            carry = sum / 10;
            int lastDigit = sum % 10;

            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            l3 = l3.next;

        }

        return l3;
    }




}
