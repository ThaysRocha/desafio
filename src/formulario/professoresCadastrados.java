package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class professoresCadastrados extends JFrame {

	private JPanel contentPane;
	private JTable tabelaProfessor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					professoresCadastrados frame = new professoresCadastrados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public professoresCadastrados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 129, 341, 83);
		contentPane.add(scrollPane);
		
		tabelaProfessor = new JTable();
		scrollPane.setViewportView(tabelaProfessor);
		tabelaProfessor.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nome", "Materia"
			}
		));
		
		textField = new JTextField();
		textField.setBounds(25, 82, 241, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 17));
		btnPesquisar.setBounds(276, 84, 117, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(25, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(147, 227, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(276, 227, 89, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblProfessoresCadastrados = new JLabel("Professores Cadastrados");
		lblProfessoresCadastrados.setBounds(129, 27, 155, 14);
		contentPane.add(lblProfessoresCadastrados);
	}
}
