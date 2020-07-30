import models.BinaryNode;
import models.BinarySearchTree;

public class Atividade14 {
    public static void main(String[] args) {
        int[] nodes = {3,7,8,9,10,5};
        BinarySearchTree searchTree = new BinarySearchTree();
        //1 e 2
        //implementando arvore a partir do array
        searchTree.addNode(nodes[1]);//7
        searchTree.addNode(nodes[5]);//5
        searchTree.addNode(nodes[0]);//3
        searchTree.addNode(nodes[3]);//9
        searchTree.addNode(nodes[2]);//8
        searchTree.addNode(nodes[4]);//10
        //3
        // BinaryNode.preOrder(searchTree.root);
        // //4
        // BinaryNode.posOrder(searchTree.root);
        // //5
        // BinaryNode.inOrder(searchTree.root);
        //6
        System.out.println(searchTree.isIn(8));
    }
}