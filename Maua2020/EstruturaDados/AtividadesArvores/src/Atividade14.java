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
        System.out.println("PreOrder:");
        BinaryNode.preOrder(searchTree.root);
        System.out.println();
        //4
        System.out.println("PosOrder:");
        BinaryNode.posOrder(searchTree.root);
        System.out.println();
        //5
        System.out.println("InOrder:");
        BinaryNode.inOrder(searchTree.root);
        System.out.println();
        //6
        System.out.println("Valor K = 8 esta na arvore?");
        System.out.println(searchTree.isIn(8));
        System.out.println("Valor K = 32 esta na arvore?");
        System.out.println(searchTree.isIn(27));
        //7
        System.out.println("Menor valor da arvore: ");
        System.out.println(searchTree.minNode());
        //8
        System.out.println("Quantidade de nodes na arvore:");
        System.out.println(searchTree.getSize());
        //9
        System.out.println("Media aritmetica de todos os nodes: ");
        System.out.println(searchTree.getAverage());
        //10
        System.out.println("Altura da arvore: ");
        System.out.println(searchTree.getDepth());
        //11
        System.out.println("Quantidade de nodes nulos: ");
        System.out.println(BinaryNode.countNull(searchTree.root));
        //12
        System.out.println("Multiplos de 2: ");
        BinaryNode.evenNodes(searchTree.root);
        System.out.println();
        //13
        System.out.println("Soma dos valores da arvore: ");
        System.out.println(searchTree.getSum());
    }
}