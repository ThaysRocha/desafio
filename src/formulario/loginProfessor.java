package formulario;

import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SingleSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class loginProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField campoUsuarioP;
	private JPasswordField campoSenhaP;

	public loginProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo4 = new JLabel("Fa\u00E7a seu Login");
		titulo4.setBounds(171, 11, 110, 14);
		contentPane.add(titulo4);
		
		campoUsuarioP = new JTextField();
		campoUsuarioP.setBounds(123, 65, 211, 26);
		contentPane.add(campoUsuarioP);
		campoUsuarioP.setColumns(10);
		
		JLabel UsuarioP = new JLabel("Usu\u00E1rio");
		UsuarioP.setBounds(31, 71, 82, 20);
		UsuarioP.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(UsuarioP);
		
		JLabel senhaP = new JLabel("Senha");
		senhaP.setBounds(31, 130, 58, 20);
		senhaP.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(senhaP);
		
		JButton botaoLoginP = new JButton("Entrar");
		botaoLoginP.setBounds(155, 227, 89, 23);
		botaoLoginP.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(botaoLoginP);
		
		campoSenhaP = new JPasswordField();
		campoSenhaP.setText("***********");
		campoSenhaP.setBounds(123, 132, 89, 20);
		contentPane.add(campoSenhaP);
		
		botaoLoginP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				LocalDateTime tempo = LocalDateTime.now();
				
				int hora = tempo.getHour();
				int minuto = tempo.getMinute();
					
				
				if((hora >=0 ) || (hora <= 12)) {
					JOptionPane.showMessageDialog(null, "Bom Dia! "+campoUsuarioP.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 13) || (hora <= 18)) {
					JOptionPane.showInternalMessageDialog(null, "Boa Tarde! "+campoUsuarioP.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 19) || (hora <= 24)) {
					JOptionPane.showMessageDialog(null, "Boa Noite! "+campoUsuarioP.getText()+" Agora são: "+hora+":"+minuto);
				}
				
				formularioProfessor fp = new formularioProfessor();
				fp.setVisible(true);
					
			}
			
					
		});
		
	
	}
}
