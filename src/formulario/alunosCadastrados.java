package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.acao;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class alunosCadastrados extends JFrame {

	protected static final Object linha = null;
	private JPanel contentPane;
	private JTable tabelaA;
	private JTextField textField;

	public alunosCadastrados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adicionar ao ArrayList
		acao a = new acao();
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 170, 404, 83);
		contentPane.add(scrollPane);
		
		tabelaA = new JTable(a.listarAlunos());
		scrollPane.setViewportView(tabelaA);
		tabelaA.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nomes", "Idade", "Email"
			}
		));
		
		tabelaA.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
		
				//Obter a linha 
				int linha = tabelaA.getSelectedRow();
				
				// Obter os dados
				String txtnomeA = tabelaA.getValueAt(linha, 0).toString();
				String txtemailA = tabelaA.getValueAt(linha, 3).toString();
				int txtidadeA = Integer.parseInt(tabelaA.getValueAt(linha, 2).toString());
				
								
				
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
		
		textField = new JTextField();
		textField.setBounds(34, 104, 207, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPesquisar.setBounds(266, 105, 134, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(58, 300, 114, 23);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Abrir pagina de cadastro de aluno
				cadastroAlunos ac = new cadastroAlunos();
				ac.setVisible(true);
				
			}
		});
		
		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(209, 299, 89, 25);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Excluir linha Produto
				// Método para executar a exclusão
				
				acao ba = new acao();
				ba.excluir(linha);
				
			}
		});
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlterar.setBounds(344, 302, 89, 23);
		contentPane.add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


			//Chamar outra pagina
				cadastroAlunos ac = new cadastroAlunos();
				
			
			}
		});
		
		JLabel lblAlunosCadastrados = new JLabel("Alunos Cadastrados");
		lblAlunosCadastrados.setBounds(126, 26, 158, 14);
		contentPane.add(lblAlunosCadastrados);
	}

}
