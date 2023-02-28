public class RemoveNth {
    public int Length(ListNode head){

        int l=0;
        ListNode temp = head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        System.out.println(l);
        return l;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
          int len = Length(head);
          if(len == 0)
          return head;

          ListNode temp = head;

          if(len-n == 0){
              head = temp.next;
              return head;
          }
          else{
              int c = 0;
              ListNode prev =head;
              while(c<(len-n)){
                  prev = temp;
                 temp = temp.next;
                 c++;
              }
             prev.next = temp.next;
          }
          return head; 
    }
}
