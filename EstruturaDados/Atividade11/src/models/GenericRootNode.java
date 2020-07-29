package models;

public class GenericRootNode extends Node{

    public int size;
    public final GenericNode parent = null;
    public GenericNode fChild;


public GenericRootNode(int data, String path,GenericNode fChild, int size){
    this.path = path;
    this.data = data;
    this.size = size;
    this.fChild = fChild;
}

}