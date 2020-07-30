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
}


