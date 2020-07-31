package models;

public class BinarySearchTree {

    public BinaryNode root;
    public int size = 0;
    private int aux = 0;

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
    public int minNode(){
        return BinaryNode.minNodeData(this.root);
    }
    
    public boolean isIn(int data) {

        if(this.root==null)
        return false;
        else{
            BinaryNode aux = this.root;
            while(aux!=null){
                if(aux.data==data)
                    return true;
                else{
                    if(data>aux.data)
                        aux = aux.right;
                    else
                        aux=aux.left;
                }
            }
            return false;
        }
    }
    
    public int getSize(){
        return this.size;
    }

    public int getDepth(){
        return BinaryNode.depth(this.root);
    }

    public double getAverage(){
        return BinaryNode.treeSum(this.root)/this.size;
    }
    public int getSum(){
        return BinaryNode.treeSum(this.root);
    }
    
}

