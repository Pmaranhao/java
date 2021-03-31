package desafio.composicao;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	double obeterValorTortal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
