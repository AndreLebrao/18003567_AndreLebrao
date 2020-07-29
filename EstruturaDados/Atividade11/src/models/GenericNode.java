package models;

/**
 * Node
 */
public class GenericNode extends Node{
    public Node parent;
    public GenericNode fChild;
    public GenericNode next;

    public GenericNode(int data, String path, Node parent) {
        this.data = data;
        this.path = path;
        this.parent = parent;
        this.fChild = null;
        this.next = null;
    }
    public GenericNode(int data, String path){
        this.data = data;
        this.path = path;
        this.parent = null;
        this.fChild = null;
        this.next = null;
    }

}

