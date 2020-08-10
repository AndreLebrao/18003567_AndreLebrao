package test;

import controller.EstoqueController;
import models.Produto;

public class EstoqueTest {
    public static void main(String[] args) {
        EstoqueController estoque = new EstoqueController();
        
        
        estoque.adicionarProduto(new Produto(10, "Turma da monica", 20));
        estoque.adicionarProduto(new Produto(1.50, "Halls", 15));
        estoque.adicionarProduto(new Produto(4, "Carta de Pokemon", 50));

        
    }
}