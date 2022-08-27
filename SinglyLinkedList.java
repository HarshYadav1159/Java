import java.util.Scanner;

public class SinglyLinkedList {
    ListNode head=null;
    
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int d){
            this.data = d;
            this.next=null;
        }
    }

    void add(int d){
        ListNode last=head;
        if(head!=null){
            ListNode newNode= new ListNode(d);            
          while(last.next!=null){
            last = last.next;
 
           }
           last.next=newNode;          
        }
        else{
            ListNode newNode= new ListNode(d);
            head = newNode;
        }      
    }

    void Insert(int p , int d){
        int t =1;
        ListNode newNode = new ListNode(d);
        ListNode prevNode;
        prevNode = head;
        while(t!=p-1){
          prevNode = prevNode.next;
          t++;
        }
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }
       
    void Delete(int d){
       
        ListNode prevnode,Node;
        prevnode = head;
        Node=head.next;
        while(Node.data!=d){
            prevnode=prevnode.next;
            Node=Node.next;
        }
       prevnode.next = Node.next;

         
    }
    
     void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    
     public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.add(12);
        list.add(78);
        list.add(1);
        list.add(0);
        list.add(12);
        list.Delete(78);
        list.Insert(4, 69);
        list.display(); 
    }
}
