package formularios;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controladores.Acao;


public class formularioAlteracao {

	protected Object linha;

	public formularioAlteracao(){
		
		//Construtor
		
		//Usando o JFrame
				JFrame desafio = new JFrame();
				desafio.setVisible(true);
				desafio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				desafio.setSize(900, 500);
				desafio.setTitle("Alterando o produto");
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
						
				//JLabel pre�o
				JLabel preco = new JLabel();
				preco.setText("Escreva qual o pre�o do produto");
				preco.setBounds(20, 50, 190, 30);
						
				//JTestField campo3
				JTextField campo3 = new JTextField();
				campo3.setBounds(210, 50, 120, 30);
			
				//Bot�o de Alterar
				JButton btAlterar = new JButton();
				btAlterar.setText("Alterar");
				btAlterar.setBounds(20, 130, 150, 30);
				
				//A��o Alterar
				btAlterar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Cadastrar dados
						String Produto = campo1.getText();
						int quantidade = Integer.parseInt(campo2.getText());
						double preco = Double.parseDouble(campo3.getText());
						
						//A��o para alterar
						Acao a = new Acao();
						a.alterar(produto, preco, quantidade);
						
						//Fechar formul�rio
						desafio.dispose();
						
						//Chamar formul�rio principal
						formularioPrincipal fp = new formularioPrincipal();
						
					}
				});
				
				//Bot�o de Excluir
				JButton btExcluir = new JButton();
				btExcluir.setText("Excluir");
				btExcluir.setBounds(20, 170, 150, 30);
				
				//A��o para excluir
				btExcluir.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//A��o para excluir
						Acao a = new Acao();
						
						a.excluir(linha);
						
						//Fechar formul�rio
						desafio.dispose();
						
						//Chamar formul�rio principal
						formularioPrincipal fp = new formularioPrincipal();
						
					}
				});
				
				//Bot�o de Cancelar
				JButton btCancelar = new JButton();
				btCancelar.setText("Cancelar");
				btCancelar.setBounds(20, 210, 150, 30);
			
				//A��o para Cancelar
				btCancelar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						//Fechar formul�rio
						desafio.dispose();
						
						//Chamar formul�rio principal
						formularioPrincipal fp = new formularioPrincipal();
						
					}
				});
			
			
		

		//Adicionar elementos para o JFrame
			desafio.add(produto);
			desafio.add(campo1);
			desafio.add(quantidade);
			desafio.add(campo2);
			desafio.add(preco);
			desafio.add(campo3);
			desafio.add(btAlterar);
			desafio.add(btExcluir);
			desafio.add(btCancelar);
			
		//Exibindo mensagem
			desafio.setVisible(true);
			desafio.repaint();

	}

}
