import java.util.Scanner;

public class AddTwoNumbers {
     
    static int l1=0,l2=0;
    static ListNode rootSum = null;
    static ListNode root1 =null;
    static ListNode root2 =null;

   private static class ListNode{

       private int data;
       private ListNode next;

       ListNode(int d)
       {
           this.data = d;
           this.next = null;
       }

       static void add(int d,int i){
        
        ListNode newNode = new ListNode(d);
        if(i==1){
            l1++;
            ListNode temp = root1;
            if(root1==null){
                root1 = newNode;
              }
      
              else
              {
                  while(temp.next!=null)
                  {
                     temp=temp.next;
                  }
      
                  temp.next= newNode;
              }
        }

        else{
            l2++;
            ListNode temp = root2;
            if(root2==null){
                root2 = newNode;
            }

              else
              {
                  while(temp.next!=null)
                  {
                     temp=temp.next;
                  }
      
                  temp.next= newNode;                  
              }
        }
        
       }

       static void addStart(int d,int i)
       {
           if(i==1){
            ListNode newNode = new ListNode(d);
            newNode.next = root1;
            root1 = newNode;
            l1++;
           }

           else{
            ListNode newNode = new ListNode(d);
            newNode.next = root2;
            root2 = newNode;
            l2++;
           }
           

       }
       
      static void display(int i){
          if(i==1){
            ListNode temp=root1;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
          }        
        }

        else{
            ListNode temp=root2;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
         }
        }
    }

    // static sumLinked(){}


      static void sum()
      {
           int b[] = new int[l2+2];
           int sum=0,t=0;
           System.out.print("\n[");
           while(root1!=null){
            if(t==0) {
                sum = sum + root1.data + root2.data;                
            }           

            else 
            sum = sum + root1.data + root2.data + b[t-1];


            if(sum >= 10){
                if(root1.next!=null){
                sum = sum%10;
                b[t]=1;
                t++;
                }

                else if(root1.next == null && sum >=10){
                    System.out.print((sum%10)+","+1);
                    break;
                }
               
            }               

            else{
                b[t]=0;
                t++;
            }
              
            
            root2=root2.next;
            root1 = root1.next;  
            System.out.print(sum);
            if(root1!=null)
            System.out.print(",");
            sum=0;          
        }
        System.out.print("]");
                
       }

   
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,i;
        for(i=1;i<=2;i++){

            a=sc.nextInt();
            while(a!=0)
            {
                add(a%10,i);
                a=a/10;
            }

            display(i);
        }

        int len1=l1,len2=l2;

        if(len1>len2){
            for(int x = 1;x <= (len1-len2) ; x++){
                 add(0,2);
            }
            // System.out.println();
            // display(2);
        }

        else if(len2>len1){
            for(int x = 1;x <= (len2-len1) ; x++){
                add(0,1);
           }
        }

        // ListNode temp = (l1>l2) ? root1:root2;
        // System.out.println("\nlen "+l1+" "+l2);
        // System.out.println("diff "+(l1-l2));
        sum();
        
      }
   }
}
