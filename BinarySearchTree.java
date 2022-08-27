import java.util.Scanner;
public class BinarySearchTree {
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

   Node insert(Node node,int data){
       
        if(root==null){
            root =new Node(data);
            return null;
           }
        
        else if(data > node.data){
            if(node.right==null){
                node.right=new Node(data);
            }            
            insert(node.right, data);
        }

        else if(data < node.data){
            if(node.left==null){
                node.left=new Node(data);
            }       
            insert(node.left, data);
        }
         
        return null;
    }
    

    //pre-order traversal
    void printPreOrder(Node temp){
        if(temp==null)
        return;
         System.out.print(temp.data +" ");
         printPreOrder(temp.left);
         printPreOrder(temp.right);
   
   
}

      //post-order traversal
    void printPostOrder(Node temp){
        if(temp==null)
        return;
         
         printPostOrder(temp.left);
         printPostOrder(temp.right);
         System.out.print(temp.data +" ");  
   
    }
    
    //in-order traversal
    void printInOrder(Node temp){
        if(temp==null)
        return;
         
         printInOrder(temp.left);
         System.out.print(temp.data +" ");
         printInOrder(temp.right);        
   
    }


    public static void main(String[] args){
           BinarySearchTree obj = new BinarySearchTree();
           int i = 0;
        int a[]={11,13,10,49,79,15};
        while(i<a.length){
            obj.insert(root,a[i]);
            i++;
        }
        System.out.print("Pre-Order: ");
        obj.printPreOrder(root);
        System.out.println();
        System.out.print("In-Order: ");
        obj.printInOrder(root);
        System.out.println();
        System.out.print("Post-Order: ");
        obj.printPostOrder(root);
        
    }
}
