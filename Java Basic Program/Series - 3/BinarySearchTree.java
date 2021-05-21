import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchTree {
    static Node root=null;
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        int o=1;
        while(o!=-1){
            System.out.print("Enter 1 for add node \n");
            System.out.print("Enter 2 for Display node and exit :- ");
            o=sc.nextInt();
            switch(o){
                case 1:{
                    add_Node(root);  
                    break;
                }
                case 2:{
                    System.out.print("\n Inorder : ");
                    display_Tree_Inorder(root);
                    System.out.print("\n Pre-Order : ");
                    display_Tree_Preorder(root);
                    System.out.print("\n Post-Order : ");
                    display_Tree_Postorder(root);
                    o=-1;
                    break;
                }
            }
        }
    }
    
    static void add_Node(Node r){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data :- ");
        int data=sc.nextInt();
        Node n=new Node(data); 
        if(root==null){
            root=n;
        }
        else{
              Node save=r;
            while(save.left!=null && save.right!=null){
                if(save.data > data){
                    save=save.left;
                }
                else{
                    save=save.right;
                }
            }
            if(save.data < data && save.right==null){
                save.right=n;
            }
            if(save.data > data && save.left==null){
                save.left=n;
            }
            
        }
    }
    
    static void display_Tree_Inorder(Node root){
        Node save=root;
        if(save!=null){
            display_Tree_Inorder(save.left);
            System.out.print(save.data+" , ");
            display_Tree_Inorder(save.right);
        }
    }
    
    static void display_Tree_Preorder(Node root){
        Node save=root;
        if(save!=null){
            System.out.print(save.data+" , ");
            display_Tree_Preorder(save.left);
            display_Tree_Preorder(save.right);
        }
    }
     
    static void display_Tree_Postorder(Node root){
        Node save=root;
        if(save!=null){
            display_Tree_Postorder(save.left);
            display_Tree_Postorder(save.right);
             System.out.print(save.data+" , ");
        }
    }
}
