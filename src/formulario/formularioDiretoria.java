package formulario;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;

import controlador.bancoDadosA;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formularioDiretoria extends JFrame {

	protected static final bancoDadosA dados = null;
	protected static final int linha = 0;
	private JPanel contentPane;

	public formularioDiretoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 568);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-Vindo!");
		lblNewLabel.setBounds(156, 41, 184, 26);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		JButton btnAluno = new JButton("Alunos");
		btnAluno.setBounds(32, 106, 73, 25);
		contentPane.add(btnAluno);
		btnAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JButton btnProfessor = new JButton("Professor");
		btnProfessor.setBounds(31, 142, 89, 25);
		contentPane.add(btnProfessor);
		btnProfessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblCadastrar = new JLabel("Cadastrar:");
		lblCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadastrar.setBounds(26, 81, 106, 14);
		contentPane.add(lblCadastrar);
		
		JLabel lblVerSistemaDe = new JLabel("Ver Sistema de:");
		lblVerSistemaDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVerSistemaDe.setBounds(26, 185, 113, 26);
		contentPane.add(lblVerSistemaDe);
		
		JButton btnAlunos = new JButton("Alunos");
		btnAlunos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAlunos.setBounds(31, 229, 89, 23);
		contentPane.add(btnAlunos);
		btnAlunos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				//Adicionar outra pargina
				alunosCadastrados a = new alunosCadastrados();
				a.setVisible(true);
				
				//Fechar essa aba
				formularioDiretoria.DISPOSE_ON_CLOSE();
				
			}
		});
		
		JButton btnProfessores = new JButton("Professores");
		btnProfessores.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProfessores.setBounds(26, 265, 106, 23);
		contentPane.add(btnProfessores);
		btnProfessores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Adicionar outra pargina
				professoresCadastrados p = new professoresCadastrados();
				p.setVisible(true);
				
				//Fechar essa aba
				formularioDiretoria.DISPOSE_ON_CLOSE();
				
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setBounds(392, 41, 73, 35);
		contentPane.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Sair de tudo
				System.exit(0);
				
			}
		});
		
		btnProfessor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Adicionar outra pargina
				cadastrarProfessor pc = new cadastrarProfessor();
				pc.setVisible(true);
				
				//Fechar essa aba
				formularioDiretoria.DISPOSE_ON_CLOSE();
				
			}
		});
		btnAluno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Adicionar outra pargina
				cadastroAlunos ac = new cadastroAlunos();
				ac.setVisible(true);
				
				//Fechar essa aba
				formularioDiretoria.DISPOSE_ON_CLOSE();
			}
		});
		
		
	}

	protected static void DISPOSE_ON_CLOSE() {
		
		
	}
	
	
}
