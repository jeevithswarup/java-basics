
public class LC_19 {   
    
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;
        int count=0;
        while(temp!=null){
        count++;
         temp = temp.next;
        }
        if(count==n){
            return head.next;
        }
        if(head.next==null){
            head=null;
        }
        int dum=0;
         temp = head;

        while(temp!=null ){

            if(dum==count-n-1){
                temp.next=temp.next.next;
                return head;
            }
                
               dum++;
                 temp=temp.next;

        }
        return head;
    }
}
}
