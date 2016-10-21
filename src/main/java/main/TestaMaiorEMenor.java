package main;

import model.CarrinhoDeCompras;
import model.MaiorEMenor;
import model.Produto;

public class TestaMaiorEMenor {
	
	private TestaMaiorEMenor(){
		
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		
	}

}
