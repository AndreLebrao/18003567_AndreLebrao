package models;

public class BinaryNode extends Node{
    public BinaryNode parent;
    public BinaryNode left;
    public BinaryNode right;
    
    public BinaryNode(int data){
        this.parent = null;
        this.left = null;
        this.right = null;
        this.data = data;
    }
    
    public BinaryNode(int data,BinaryNode left, BinaryNode right){
        this.data = data;
        this.left = left;
        this.right = right;
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
    public static int depth(BinaryNode node){
        if(node.left==null)
            return 0;
        else{
            int leftDepth = depth(node.left);
            int rightDepth = depth(node.right);

            if(leftDepth>rightDepth)
                return leftDepth+1;
            return rightDepth+1;
        }
    }
}


