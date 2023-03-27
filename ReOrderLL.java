public class ReOrderLL {
    static ListNode head =null;
    static ListNode ans =null;
    private static class ListNode{
        private int val;
        private ListNode next;
        
        public ListNode(int v, ListNode next){
            this.val=v;
            this.next=next;
        }
    }
    static int length(ListNode temp){
        int l=0;
        while(temp!=null){
            temp = temp.next;
            l++;
        }
        return l;
    } 

    static void add(int pos, int val){
      ListNode node = new ListNode(val,null);
      ListNode temp = head;
      int t=0;
      if(temp == null || pos ==0){
         node.next =head;
         head = node;
      }

      else{
        while(t<pos-1 && temp!=null){
            temp = temp.next;
            t++;
        }
        node.next = temp.next;
        temp.next=node;
      }
    }

    static void addAns(int pos, int val){
        ListNode node = new ListNode(val,null);
        ListNode temp = ans;
        int t=0;
        if(temp == null || pos ==0){
           node.next =ans;
           ans = node;
        }
  
        else{
          while(t<pos-1 && temp!=null){
              temp = temp.next;
              t++;
          }
          node.next = temp.next;
          temp.next=node;
        }
      }
    static ListNode reOrder(ListNode l){
        
        int len = length(l);
        int t =0, mid = len/2;
        while(t<len && l != null){
            if(t<=mid){
                addAns(length(ans), l.val);
            }
            else{
                addAns(len-t, l.val);
            }
            l = l.next;
            t++;
        }
        head = ans;
        return ans;
    }
    static void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
    }
    
    public static void main(String args[]){
        add(0, 6);
     add(0, 5);
     add(0, 4);
     add(0, 3);
     add(0, 2);
     add(0, 1);
     reOrder(head);
     display();
     
     System.out.println("\n"+length(head));
     
    }
    
}
