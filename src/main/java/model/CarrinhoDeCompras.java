package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public void adiciona(Produto produto) {
		produtos.add(produto);	
	}

	public List<Produto> getProdutos() {
		
		return produtos;
	}

}
