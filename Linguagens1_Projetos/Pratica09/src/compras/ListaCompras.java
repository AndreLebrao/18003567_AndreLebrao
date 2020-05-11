package compras;

import models.Item;
import models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    public ListaCompras() {
        this.listaDeCompras = new ArrayList<>();
    }
    private final List<Item> listaDeCompras;

    public void adicionarItem(Produto produto) {
        this.listaDeCompras.add(
            new Item(1, produto)
        );
    }
    /**
     * @return the listaDeCompras
     */
    public List<Item> getListaDeCompras() {
        return this.listaDeCompras;
    }
}