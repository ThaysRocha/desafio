package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.acao;
import controlador.bancoDadosA;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoIdade;
	private JTextField campoEmail;
	private JTextField campoLoginA;
	private JTextField textField;

	
	public cadastroAlunos() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastreOAluno = new JLabel("Cadastre o Aluno");
		lblCadastreOAluno.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCadastreOAluno.setBounds(115, 16, 166, 22);
		contentPane.add(lblCadastreOAluno);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(18, 58, 53, 22);
		contentPane.add(lblNome);
		
		campoNome = new JTextField();
		campoNome.setFont(new Font("Arial", Font.PLAIN, 15));
		campoNome.setBounds(76, 58, 221, 22);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JRadioButton fem = new JRadioButton("Fem");
		fem.setFont(new Font("Arial", Font.PLAIN, 14));
		fem.setBounds(315, 58, 53, 23);
		contentPane.add(fem);
		
		JRadioButton masc = new JRadioButton("masc");
		masc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		masc.setBounds(370, 57, 65, 23);
		contentPane.add(masc);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(18, 91, 46, 24);
		contentPane.add(lblIdade);
		
		campoIdade = new JTextField();
		campoIdade.setBounds(76, 95, 35, 20);
		contentPane.add(campoIdade);
		campoIdade.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(121, 91, 53, 21);
		contentPane.add(lblEmail);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(164, 95, 251, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		campoLoginA = new JTextField();
		campoLoginA.setBounds(76, 140, 244, 22);
		contentPane.add(campoLoginA);
		campoLoginA.setColumns(10);
		
		JLabel lblLoginA = new JLabel("Login:");
		lblLoginA.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLoginA.setBounds(18, 144, 46, 22);
		contentPane.add(lblLoginA);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(18, 177, 53, 25);
		contentPane.add(lblSenha);
		
		JTextField campoSenhaA = new JTextField();
		campoSenhaA.setBounds(76, 180, 116, 20);
		contentPane.add(campoSenhaA);
		campoSenhaA.setColumns(10);
		
				acao ba = new acao();
				
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Cadastrar
			String txtemailA = campoEmail.getText();
			String txtnomeA = campoNome.getText();
			String txtloginA = campoLoginA.getText();
			String txtfemA = fem.getText();
			String txtmascA = masc.getText();
			int txtidadeA = Integer.parseInt(campoIdade.getText());
			int txtsenhaA = Integer.parseInt(campoSenhaA.getText());
			
			if(fem.isSelected()){
			}else if(masc.isSelected()){
			}
				ba.cadastrar(txtloginA, txtemailA, txtfemA, txtmascA, txtidadeA, txtsenhaA);
				
				alunosCadastrados ac = new alunosCadastrados();
				ac.setVisible(true);
				
				//Limpar campos
				campoSenhaA.setText("");
				campoEmail.setText("");
				campoIdade.setText("");
				campoLoginA.setText("");
				campoNome.setText("");
				
				//Cursor no campo
				campoSenhaA.requestFocus();
				campoEmail.requestFocus();
				campoIdade.requestFocus();
				campoLoginA.requestFocus();
				campoNome.requestFocus();
				
				
			}
		});
		btnCadastrar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnCadastrar.setBounds(49, 256, 104, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAlterar.setBounds(208, 257, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(327, 257, 89, 23);
		contentPane.add(btnCancelar);
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Alterar tabela de Alunos
				acao ba = new acao();
				
				ba.btnAlterar(campoSenhaA, campoEmail, campoIdade, campoLoginA, campoNome);
			
				
				
			}
		});
	}




}
