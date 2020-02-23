package algorithm.list;

public class ListOps {

    public static void findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            } else {
                slow = slow.next;
            }

        }
        System.out.println(slow.val);
    }

    public static ListNode reverse(ListNode head) {
      if(head == null || head.next == null){
          return head;
      }
      ListNode newHead = null;
      ListNode p = head;
      while (p != null){
          ListNode temp = p.next;
          p.next = newHead;
          newHead = p;
          p = temp;
      }
      return newHead;


    }
    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode res = reverse(n1);
        while (res != null){
            System.out.print(res.val);
            res = res.next;
        }
    }


}
