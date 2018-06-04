
package formulario;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class loginAluno extends JFrame {

	private JPanel contentPane;
	private JTextField campoUsuarioA;
	private JTextField campoSenhaA;

	
	public loginAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo2 = new JLabel("Bem-Vindo, fa\u00E7a seu login.");
		titulo2.setBounds(62, 11, 257, 24);
		titulo2.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(titulo2);
		
		campoUsuarioA = new JTextField();
		campoUsuarioA.setBounds(149, 76, 217, 29);
		contentPane.add(campoUsuarioA);
		campoUsuarioA.setColumns(10);
		
		campoSenhaA = new JTextField();
		campoSenhaA.setBounds(149, 137, 217, 29);
		contentPane.add(campoSenhaA);
		campoSenhaA.setColumns(10);
		
		JLabel usuarioA = new JLabel("Usu\u00E1rio");
		usuarioA.setFont(new Font("Arial", Font.PLAIN, 20));
		usuarioA.setBounds(45, 76, 77, 29);
		contentPane.add(usuarioA);
		
		JLabel senhaA = new JLabel("Senha");
		senhaA.setFont(new Font("Arial", Font.PLAIN, 20));
		senhaA.setBounds(45, 137, 77, 21);
		contentPane.add(senhaA);
		
		JButton botaoLoginA = new JButton("Entrar");
		botaoLoginA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
LocalDateTime tempo = LocalDateTime.now();
				
				int hora = tempo.getHour();
				int minuto = tempo.getMinute();
					
				
				if((hora >=0 ) || (hora <= 12)) {
					JOptionPane.showMessageDialog(null, "Bom Dia! "+campoUsuarioA.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 13) || (hora <= 18)) {
					JOptionPane.showInternalMessageDialog(null, "Boa Tarde! "+campoUsuarioA.getText()+" Agora são: "+hora+":"+minuto);
				}else if((hora >= 19) || (hora <= 24)) {
					JOptionPane.showMessageDialog(null, "Boa Noite! "+campoUsuarioA.getText()+" Agora são: "+hora+":"+minuto);
				}
				
				formularioAluno fla = new formularioAluno();
				fla.setVisible(true);
				
			}
		});
		botaoLoginA.setFont(new Font("Arial", Font.PLAIN, 20));
		botaoLoginA.setBounds(163, 221, 112, 29);
		contentPane.add(botaoLoginA);
		
	}

}