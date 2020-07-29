package models;

/**
 * Node
 */
public class GenericNode {
    public int data;
    public String path;
    public GenericNode parent;
    public GenericNode fChild;
    public GenericNode next;

    public GenericNode(int data, String path, GenericNode parent, GenericNode fChild, GenericNode next) {
        this.data = data;
        this.path = path;
        this.parent = parent;
        this.fChild = fChild;
        this.next = next;
    }
    public GenericNode(int data, String path){
        this.data = data;
        this.path = path;
        this.parent = null;
        this.fChild = null;
        this.next = null;
    }

}

