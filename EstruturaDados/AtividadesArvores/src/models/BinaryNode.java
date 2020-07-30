package models;

public class BinaryNode extends Node{
    BinaryNode left;
    BinaryNode right;
    
    public BinaryNode(){
        this.left = null;
        this.right = null;
    }
    
    public BinaryNode(BinaryNode left, BinaryNode right){
        this.left = left;
        this.right = right;
    }
}


