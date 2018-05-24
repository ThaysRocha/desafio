package controladores;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Acao {

	public static void main(String[] args) {
		

	}

	public DefaultTableModel listarProdutos() {

		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Preço");
		modelo.addColumn("Quantidade");
		
		for(int indice = 0; indice < Produto.dados.size(); indice++){
			modelo.addRow(new Object []{
			Produto.dados.get(indice).produto(),
			Produto.dados.get(indice).preco(),
			Produto.dados.get(indice).quantidade()	
	});
		}
		
		return modelo;
		
	}

	public void cadastrar(String produto, double preco, int quantidade) {
	
		//Criar objeto
				Produto p = new Produto();
				p.setproduto(produto);
				p.setpreco(preco);
				p.setquantidade(quantidade);
				
				//Adicionar ao ArrayList
				Produto.dados.add(p);
	}

	public void alterar(JLabel produto, double preco, int quantidade) {
		
		Produto p = new Produto();
		
		
		p.setproduto(produto);
		p.setpreco(preco);
		p.setquantidade(quantidade);
		
		
	}

	public void excluir(Object linha) {
		Produto.dados.remove(linha);
		
	}

}
