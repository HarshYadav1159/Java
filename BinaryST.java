import java.util.Scanner;
public class BinaryST {
    static Scanner sc = new Scanner(System.in);
       static Node root = null;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }       
    }
    
    //creation of binary tree
    Node create(int data){
        Node newNode = new Node(data);

        if(root==null)
        root  = newNode;
        System.out.println();
        if(data==-1)
        return null;

            System.out.println("Left");
            int a =sc.nextInt();
            newNode.left= create(a);

            System.out.println("Right");
            a =sc.nextInt();
            newNode.right = create(a);
    
       return newNode;
    }
    
    //pre order traversal
    void printPreOrder(Node temp){
             if(temp==null)
             return;
              System.out.print(temp.data +" ");
              printPreOrder(temp.left);
              printPreOrder(temp.right);
        
        
    }

    //post oreder traversal
    void printPostOrder(Node temp){
        if(temp==null)
        return;
         
         printPostOrder(temp.left);
         printPostOrder(temp.right);
         System.out.print(temp.data +" ");
   
   
    }
    
    //in order traversal
    void printInOrder(Node temp){
        if(temp==null)
        return;
         
         printInOrder(temp.left);
         System.out.print(temp.data +" ");
         printInOrder(temp.right);       
   
   
    }

    

    public static void main(String[] args){        
        BinaryST tree = new BinaryST();
        System.out.println("Value of root: 1");
        System.out.println();
        tree.create(1);
        tree.printPreOrder(root);
        System.out.println();
        tree.printInOrder(root);
        System.out.println();
        tree.printPostOrder(root);

    }
    
}
