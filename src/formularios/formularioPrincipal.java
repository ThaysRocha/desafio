package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;

public class formularioPrincipal {

	public static void main(String[] args) {
	
		//Usando o JFrame
		JFrame desafio = new JFrame();
		desafio.setVisible(true);
		desafio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desafio.setSize(900, 500);
		desafio.setTitle("Comprindo o desafio");
		desafio.setLocationRelativeTo(null);
		desafio.setLayout(null);
		
		
		//JLabel Produto
		JLabel produto = new JLabel();
		produto.setText("Escreva qual o nome do produto");
		produto.setBounds(20, 20, 190, 30);
		
		//JTestField campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(210, 20, 120, 30);
		
		//JLabel quantidade
		JLabel quantidade = new JLabel();
		quantidade.setText("Indique a quantidade do produto");
		quantidade.setBounds(20, 80, 190, 30);
				
		//JTestField campo2
		JTextField campo2 = new JTextField();
		campo2.setBounds(210, 80, 120, 30);
				
		//JLabel preço
		JLabel preco = new JLabel();
		preco.setText("Escreva qual o preço do produto");
		preco.setBounds(20, 50, 190, 30);
				
		//JTestField campo3
		JTextField campo3 = new JTextField();
		campo3.setBounds(210, 50, 120, 30);
		
		//ArrayList
		
		Acao a = new Acao();
		
		//Criar colunas com JTable
		DefaultTableModel exibirDados = new DefaultTableModel();
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Preço");
		exibirDados.addColumn("Quantidade");
		

		//JTable para exibir o Default
		JTable coluna = new JTable(exibirDados);
		
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(coluna);
		barraRolagem.setBounds(350, 250, 250, 150);
		
		
		//JButton botão
		JButton botao = new JButton();
		botao.setText("Cadastrar");
		botao.setBounds(350, 150, 100, 30);
		
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Cadastrar
				String Produto = campo1.getText();
				int quantidade = Integer.parseInt(campo2.getText());
				double preco = Double.parseDouble(campo3.getText());
				
				
				
				//Criar objeto e chamar método
				a.cadastrar(Produto, preco, quantidade);
				
				//Atualizar tabela
				coluna.setModel(a.listarProdutos());
				
				//Limpar e selecionar o campo contendo o nome 
				campo1.setText("");
				campo1.requestFocus();
				
				//Limpar e selecionar o campo contendo a quantidade
				campo2.setText("");
				campo2.requestFocus();
				
				//Limpar e selecionar o campo contendo o preço
				campo3.setText("");
				campo3.requestFocus();
				
				
			}
		});
		
		//Ação na tabela
		coluna.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				int linha = coluna.getSelectedRow();
				
				// Obter os dados
				String produto = coluna.getValueAt(linha, 0).toString();
				double preco = Double.parseDouble(coluna.getValueAt(linha, 1).toString());
				int quantidade = Integer.parseInt(coluna.getValueAt(linha, 2).toString());
				
				// Criar o novo formulário
				formularioAlteracao f = new formularioAlteracao();
				
				// Fechar o FormulárioPrincipal
				desafio.dispose();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		//Adicionando elementos ao JFrame
		desafio.add(produto);
		desafio.add(campo1);
		desafio.add(quantidade);
		desafio.add(campo2);
		desafio.add(preco);
		desafio.add(campo3);
		desafio.add(botao);
		desafio.add(barraRolagem);
		
		
		
		//Exibir dados
		desafio.setVisible(true);
		desafio.repaint();
	}

	


		
		

}
