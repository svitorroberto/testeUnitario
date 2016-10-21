package model.test;

import org.junit.Assert;
import org.junit.Test;

import model.CarrinhoDeCompras;
import model.MaiorEMenor;
import model.Produto;


public class MaiorEMenorTest {
	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

}
