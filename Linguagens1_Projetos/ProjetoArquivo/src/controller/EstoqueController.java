package controller;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

public class EstoqueController {
    private List<Produto> estoque = new ArrayList<>();

    public EstoqueController(){}

    public void adicionarProduto(Produto produto){
        this.estoque.add(produto);
    }
    public void deleteProduto(){
        this.getListEstoque();

    }

    public void getListEstoque(){
        for (Produto produto : this.estoque){
            System.out.println(produto);
        }
    }
}