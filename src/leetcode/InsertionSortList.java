package leetcode;

/**
 * @ClassName InsertionSortList
 * @Description
 * 使用插入排序对链表进行排序。
 * Sort a linked list using insertion sort.
 * @Author Wlison
 * @Date 2019/8/26 22:13
 * @Version 1.0
 **/
public class InsertionSortList {
    //test
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(7);
        ListNode n7 = new ListNode(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        ListNode listNode = new InsertionSortList().insertionSortList(n1);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            ListNode p = res;
            while(p.next!=null&& p.next.val<temp.val){
                p=p.next;
            }
            temp.next=p.next;
            p.next=temp;
            temp= next;
        }
        return res.next;
    }
}
