package models;
import java.util.ArrayList;
public class BinaryTree {
    private int size;
    private ArrayList<BinaryNode> tree;

    public BinaryTree(BinaryNode root){
        this.size = 1;
        this.tree = new ArrayList<>();
        this.tree.add(root);
    }

    public void addNode(BinaryNode node){
        this.tree.add(node);
        size+=1;
    }
    public int getSize(){
        return this.size;
    }
    
}