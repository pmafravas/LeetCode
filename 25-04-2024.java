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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int l3_size = 0;
        ListNode l_inicial = l3;

        while(l1 != null || l2!= null){
            if(l1 != null && l2 != null){
                l3.val = l1.val+l2.val;
                l1 = l1.next;
                l2 = l2.next;
                l3_size++;
            }
            else if(l1 == null){
                l3.val = l2.val;
                l2 = l2.next;
                l3_size++;
            }
            else{
                l3.val = l1.val;
                l1 = l1.next;
                l3_size++;
            }

            if(l1 != null || l2 != null){
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }

        l3 = l_inicial;
        for(int i=0; i < l3_size; i++){
            if(l3.val >= 10){
                l3.val -= 10;
                if(i == l3_size-1){
                    l3.next = new ListNode(1);
                }
                else
                    l3.next.val += 1;
            }
            l3 = l3.next;
        }
        
        l3 = l_inicial;
        return l3;
    }
}