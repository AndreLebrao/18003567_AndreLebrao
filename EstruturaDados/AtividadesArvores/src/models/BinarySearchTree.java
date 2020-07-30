package models;

public class BinarySearchTree {

    public BinaryNode root;
    public int size = 0;

    public BinarySearchTree(){
        root = null;
    }

    public void insert_root(BinaryNode node){
        this.root = node;
        root.parent = null;
        this.size+=1;
    }


    public void addNode(int data) {
        BinaryNode newNode = new BinaryNode(data);
        if (root == null)
        this.insert_root(newNode);

        else {
        BinaryNode auxNode = this.root;
        auxNode = this.root;
        size+=1;
            while (true) {
                if (data < auxNode.data) {
                    if (auxNode.left == null) {
                        auxNode.left = newNode;
                        newNode.parent = auxNode;
                        return;
                    }
                     else auxNode = auxNode.left;
                }
                else{
                    if (auxNode.right == null) {
                    auxNode.right = newNode;
                    newNode.parent = auxNode;
                    return;
                    }
                else auxNode = auxNode.right;
                }
            }

        }
    }
    public boolean isIn(int data) {
        BinaryNode aux = this.root;
        int i = 0;
        while (i<this.size) {
        if (data < aux.data)
        aux = aux.left;
        else
        aux = aux.right;
        if(aux.data==data)
            return true;
        }
        return false;
        }
    
}

