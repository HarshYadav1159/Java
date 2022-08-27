public class BalancedTree 
{
    static int balanceFactor=0;
    static int height = 0;
    static Node root=null;
 public class Node{
     Node left;
     Node right;
     int data;
     Node(int d){
        this.data=d;
        this.left = null;
        this.right=null;
     }
 }

   Node insert(Node node,int d){

     if(root==null){
          root = new Node(d);
          return null;
     }

     else if(d > node.data){

        if(node.right==null){
          node.right = new Node(d);          
        }
        insert(node.right,d);        
     }


     else if(d < node.data){
      if(node.left==null){
        node.left = new Node(d);        
      }
      insert(node.left,d);      
   }    
   return null;

   }

   int getSize(Node node){
    
      if(node==null)
      return 0;

      return 1 + getSize(node.left) + getSize(node.right);
   }
  

   void inOrder(Node node){

    if(node==null)
    return;

    inOrder(node.left);
    System.out.print(node.data+" ");
    inOrder(node.right);
   }


 public static void main(String[] args)
 {
  BalancedTree obj = new BalancedTree();
  int i = 0;
int a[]={11,13,10,49,79,15};

while(i<a.length){
   obj.insert(root,a[i]);
   i++;
}

obj.inOrder(root);    
System.out.print("\n  Number of Nodes:" + obj.getSize(root));
     
 }
}
