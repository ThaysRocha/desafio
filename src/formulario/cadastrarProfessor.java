package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import controlador.Acao2;
import controlador.acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.SpinnerListModel;
import java.awt.Color;
public class cadastrarProfessor extends JFrame {

	

	private JPanel contentPane;
	private JTextField campoNomeP;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField campoIdadeP;
	private JTextField textField;
	private JTextField campoEmailP;
	private JTextField campoLoginP;
	private JTextField materiaP;
	protected JTextField campoSenhaP;

	
	public cadastrarProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastreOProfessor = new JLabel("Cadastre o Professor");
		lblCadastreOProfessor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCadastreOProfessor.setBounds(115, 16, 195, 22);
		contentPane.add(lblCadastreOProfessor);
		
		JLabel lblNomeP = new JLabel("Nome:");
		lblNomeP.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNomeP.setBounds(18, 58, 53, 22);
		contentPane.add(lblNomeP);
		
		campoNomeP = new JTextField();
		campoNomeP.setFont(new Font("Arial", Font.PLAIN, 15));
		campoNomeP.setBounds(76, 58, 221, 22);
		contentPane.add(campoNomeP);
		campoNomeP.setColumns(10);
		
		JRadioButton femP = new JRadioButton("Fem");
		femP.setFont(new Font("Arial", Font.PLAIN, 14));
		femP.setBounds(315, 58, 53, 23);
		contentPane.add(femP);
		
		JRadioButton mascP = new JRadioButton("masc");
		mascP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mascP.setBounds(370, 57, 65, 23);
		contentPane.add(mascP);
		
		JLabel lblIdadeP = new JLabel("Idade:");
		lblIdadeP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdadeP.setBounds(18, 91, 46, 24);
		contentPane.add(lblIdadeP);
		
		JTextField campoIdade = new JTextField();
		campoIdade.setBounds(76, 95, 35, 20);
		contentPane.add(campoIdade);
		campoIdade.setColumns(10);
		
		JLabel lblEmailP = new JLabel("E-mail:");
		lblEmailP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmailP.setBounds(139, 93, 53, 21);
		contentPane.add(lblEmailP);
		
		JTextField campoEmail = new JTextField();
		campoEmail.setBounds(164, 95, 251, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		JTextField campoLoginA = new JTextField();
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
		
				Acao2 bp = new Acao2();
				
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Cadastrar
			String txtemailP = campoEmail.getText();
			String txtnomeP = campoNome.getText();
			String txtloginP = campoLoginP.getText();
			String txtfemP = femP.getText();
			String txtmascP = mascP.getText();
			String txtdisciplinaP = lblDisciplina.getText();
			int txtidadeP = Integer.parseInt(campoIdadeP.getText());
			int txtsenhaP = Integer.parseInt(campoSenhaP.getText());
			
			if(femP.isSelected()){
			}else if(mascP.isSelected()){
			}
				bp.cadastrar(txtloginP, txtemailP, txtfemP, txtmascP, txtidadeP, txtsenhaP);
				
				professoresCadastrados p = new professoresCadastrados();
				p.setVisible(true);
				
				//Limpar campos
				campoSenhaP.setText("");
				campoEmailP.setText("");
				campoIdadeP.setText("");
				campoLoginP.setText("");
				campoNomeP.setText("");
				
				//Cursor no campo
				campoSenhaP.requestFocus();
				campoEmailP.requestFocus();
				campoIdadeP.requestFocus();
				campoLoginP.requestFocus();
				campoNomeP.requestFocus();
				
				
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
		
		textField = new JTextField();
		textField.setBounds(63, 95, 53, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		campoEmailP = new JTextField();
		campoEmailP.setBounds(202, 91, 214, 24);
		contentPane.add(campoEmailP);
		campoEmailP.setColumns(10);
		
		campoLoginP = new JTextField();
		campoLoginP.setBounds(76, 146, 221, 20);
		contentPane.add(campoLoginP);
		campoLoginP.setColumns(10);
		
		materiaP = new JTextField();
		materiaP.setBounds(330, 196, 86, 20);
		contentPane.add(materiaP);
		materiaP.setColumns(10);
		
		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDisciplina.setBounds(251, 197, 77, 14);
		contentPane.add(lblDisciplina);
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Alterar tabela de Alunos
				Acao2 bp = new Acao2();
				
				bp.btnAlterar(campoSenhaP, campoEmailP, campoIdadeP, campoLoginP, campoNomeP);
			
				
				
			}
		});
	}





}