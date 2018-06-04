package formulario;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class loginDiretoria extends JFrame {

	private JPanel senhaD;
	private JTextField campoUsuarioD;
	private JPasswordField campoSenhaD;

	public loginDiretoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		senhaD = new JPanel();
		senhaD.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(senhaD);
		senhaD.setLayout(null);
		
		JLabel titulo3 = new JLabel("Bem-Vindo! Fa\u00E7a seu login");
		titulo3.setBounds(71, 11, 277, 24);
		titulo3.setFont(new Font("Arial", Font.PLAIN, 20));
		senhaD.add(titulo3);
		
		campoUsuarioD = new JTextField();
		campoUsuarioD.setBounds(168, 80, 206, 30);
		campoUsuarioD.setFont(new Font("Arial", Font.PLAIN, 16));
		senhaD.add(campoUsuarioD);
		campoUsuarioD.setColumns(10);
		
		JLabel usuarioD = new JLabel("Usu\u00E1rio");
		usuarioD.setBounds(52, 89, 85, 21);
		usuarioD.setFont(new Font("Arial", Font.PLAIN, 20));
		senhaD.add(usuarioD);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(52, 151, 85, 24);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		senhaD.add(lblNewLabel_2);
		
		JButton botaoLoginD = new JButton("Entrar");
		botaoLoginD.setBounds(156, 226, 100, 24);
		botaoLoginD.setFont(new Font("Arial", Font.PLAIN, 20));
		senhaD.add(botaoLoginD);
		
		campoSenhaD = new JPasswordField();
		campoSenhaD.setBounds(168, 151, 206, 25);
		senhaD.add(campoSenhaD);
		
		botaoLoginD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(campoUsuarioD.getText().equals("adiministrador") && campoSenhaD.getText().equals("030618oi")) {
				
				LocalDateTime tempo = LocalDateTime.now();
				
				int hora = tempo.getHour();
				int minuto = tempo.getMinute();
					
				
				if((hora >=0 ) || (hora <= 12)) {
					JOptionPane.showMessageDialog(null, "Bom Dia! "+campoUsuarioD.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 13) || (hora <= 18)) {
					JOptionPane.showInternalMessageDialog(null, "Boa Tarde! "+campoUsuarioD.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 19) || (hora <= 24)) {
					JOptionPane.showMessageDialog(null, "Boa Noite! "+campoUsuarioD.getText()+" Agora são: "+hora+":"+minuto);
				}
				
				formularioDiretoria fd = new formularioDiretoria();
				fd.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário está errada");
				}
			}
		});
	}

	public static void DISPOSE_ON_CLOSE() {
		// TODO Auto-generated method stub
		
	}

		
	}

