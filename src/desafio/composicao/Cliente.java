package desafio.composicao;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obeterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obeterValorTortal();
		}
		
		return total;
	}
	
}
