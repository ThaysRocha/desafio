package controladores;

import java.util.ArrayList;

public class Produto {

	

	// Atributos
		private String produto;
		private double preco;
		private int quantidade;

		// ArrayList
		public static ArrayList<Produto> dados = new ArrayList<>();
		
		//Método Mágico
		
		public String produto() {
			
			return produto;
		}
		
	public void setproduto(Object produto) {
	this.produto = produto();
		
	}


	public void setquantidade(Object quantidade) {
		this.quantidade = quantidade();
		
	}
	
	public int quantidade() {
		
		return quantidade;
	}

	public void setpreco(double preco) {
		this.preco = preco();
		
	}
	
	public double preco() {
		
		return preco;
	}
}
