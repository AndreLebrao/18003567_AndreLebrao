import models.BinaryNode;
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
        //fim da arvore
        //Exercicios
        //2
        // BinaryNode.preOrder(root);
        // BinaryNode.posOrder(root);
        // BinaryNode.inOrder(root);
        //3
        BinaryNode.isIn(root, 5);
    }
}