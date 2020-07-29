package models;

public class GenericRootNode extends Node{

    public int size;
    public final GenericNode parent = null;
    public GenericNode fChild;


public GenericRootNode(GenericNode fChild, int size){
    this.size = size;
    this.fChild = fChild;
}

}