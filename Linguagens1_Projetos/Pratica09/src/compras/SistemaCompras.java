package compras;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

public class SistemaCompras {
    
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;

    public void run() {
     exibirListaProdutos();   
    }
	public SistemaCompras() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Final Fantasy 7", 100.00));
        produtos.add(new Produto(2, "Starsector", 100.00));
        produtos.add(new Produto(3, "Neo Scavenger", 100.00));
        produtos.add(new Produto(4, "Valorant", 100.00));

        listaCompras = new ListaCompras();
    }
    public void exibirListaProdutos() {
        produtos.forEach(produto -> System.out.println(produto));
    }
}