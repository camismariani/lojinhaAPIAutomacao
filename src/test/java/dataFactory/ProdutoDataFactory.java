package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComoOValorIgualAI(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PS5");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Preto");
        produto.setProdutoCores(cores);

        produto.setProdutoURLMock("");

        List<ComponentePojo> primeiroComponente = new ArrayList<>();
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(2);

        primeiroComponente.add(componente);

        produto.setComponentes(primeiroComponente);

        return produto;

    }
}
