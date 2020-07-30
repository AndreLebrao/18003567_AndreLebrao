package models;

public class BinaryNode extends Node{
    BinaryNode left;
    BinaryNode right;
    
    public BinaryNode(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
    
    public BinaryNode(int data,BinaryNode left, BinaryNode right){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public static void preOrder(BinaryNode node){
        System.out.printf("\t%d",node.data);

        if(node.left!=null)
        preOrder(node.left);

        if(node.right!=null)
        preOrder(node.right);

    }
    public static void posOrder(BinaryNode node){
        
        if(node.left!=null)
        posOrder(node.left);

        if(node.right!=null)
        posOrder(node.right);

        System.out.printf("\t%d",node.data);
    }

    public static void inOrder(BinaryNode node){

        if(node.left!=null)
            inOrder(node.left);
        
        System.out.printf("\t%d",node.data);
        
        if(node.right!=null)
            inOrder(node.right);
    }
    public static void isIn(BinaryNode root, int data){
        
        if (root.data==data){
            System.out.printf("\nSim, %d esta presente na arvore",data);
            return;
        }
            
        if(root.left!=null)
        isIn(root.left,data);

        if(root.right!=null)
        isIn(root.right,data);
    }
}


