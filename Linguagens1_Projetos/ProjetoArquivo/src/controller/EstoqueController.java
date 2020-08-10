package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Produto;

public class EstoqueController {
    private List<Produto> estoque = new ArrayList<>();
    final static Scanner sc = new Scanner(System.in);

    public EstoqueController(){}

    public void adicionarProduto(Produto produto){
        this.estoque.add(produto);
    }
    public void deleteProduto(){
        this.getListEstoque();
        int resposta = sc.nextInt();
        sc.nextLine();
        this.estoque.remove(resposta-1);
    }

    public void getListEstoque(){
        System.out.println("Lista do estoque:");
        for (Produto produto : this.estoque){
            System.out.println(produto);
        }
    }
    public void editarQuantidade(){
        this.getListEstoque();
        int resposta = sc.nextInt();
        sc.nextLine();
        System.out.println("Nova quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        this.estoque.get(resposta-1).setQuantidade(quantidade);
    }
}