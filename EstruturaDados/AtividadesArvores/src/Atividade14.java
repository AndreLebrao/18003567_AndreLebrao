import models.BinaryNode;
import models.BinarySearchTree;

public class Atividade14 {
    public static void main(String[] args) {
        int[] nodes = {3,7,8,9,10,5};
        BinarySearchTree searchTree = new BinarySearchTree();
        //1 e 2
        //implementando arvore a partir do array
        searchTree.addNode(7);
        searchTree.addNode(5);
        searchTree.addNode(3);
        searchTree.addNode(9);
        searchTree.addNode(8);
        searchTree.addNode(10);
        //3
        BinaryNode.preOrder(searchTree.root);
        //4
        BinaryNode.posOrder(searchTree.root);
        //5
        BinaryNode.inOrder(searchTree.root);
        
    }
}