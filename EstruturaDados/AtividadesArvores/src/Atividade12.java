import models.*;
public class Atividade12 {
    public static void main(String[] args) {
        //criando arvore
        BinaryNode node6 = new BinaryNode(6);
        BinaryNode node5 = new BinaryNode(5);
        BinaryNode node3 = new BinaryNode(3,node5,node6);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node2 = new BinaryNode(2,node3,node4);
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode root = new BinaryNode(0,node1,node2);
        node1.parent = root;
        node2.parent = root;
        node3.parent = node2;
        node4.parent = node2;
        node5.parent = node3;
        node6.parent = node3;

        BinaryTree tree = new BinaryTree(root);
        tree.addNode(node1);
        tree.addNode(node2);
        tree.addNode(node3);
        tree.addNode(node4);
        tree.addNode(node5);
        tree.addNode(node6);
        //fim da arvore
        //Exercicios
        //2
        // BinaryNode.preOrder(root);
        // BinaryNode.posOrder(root);
        // BinaryNode.inOrder(root);
        //3
        tree.isIn(5);
        //4
        System.out.printf("\nMaior valor da arvore: %d",tree.maxData());
        //5
        System.out.printf("\nMenor valor da arvore: %d",tree.minData());
        //6
        System.out.printf("\nMedia valor da arvore: %.2f",tree.mediaValores());
        //7
        System.out.printf("\nQuantidade de nodes nulos: %d",tree.countNull());
    }
}