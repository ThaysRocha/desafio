package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class formularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel imagemFundo;

	public formularioPrincipal() {
		setType(Type.POPUP);
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 487);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JLabel "Escola de Linguas Estrangeiras"- Titulo
		JLabel titulo1 = new JLabel("Escola de L\u00EDnguas Estrangeiras");
		titulo1.setBackground(new Color(240, 240, 240));
		titulo1.setBounds(39, 0, 389, 106);
		titulo1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		contentPane.add(titulo1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(395, 142, -277, 197);
		contentPane.add(horizontalGlue);
		
		//JLabel "Entrar como:"-Subtitulo
		JLabel subtitulo1 = new JLabel("Entrar como:");
		subtitulo1.setFont(new Font("Arial", Font.PLAIN, 20));
		subtitulo1.setBounds(128, 127, 128, 32);
		contentPane.add(subtitulo1);
		
		//JRadio Aluno
		JRadioButton aluno = new JRadioButton("Aluno");
		aluno.setBackground(new Color(240, 240, 240));
		aluno.setFont(new Font("Arial", Font.PLAIN, 20));
		aluno.setBounds(52, 180, 109, 23);
		contentPane.add(aluno);
		
		//JRadio Docente
		JRadioButton docente = new JRadioButton("Docente");
		docente.setFont(new Font("Arial", Font.PLAIN, 20));
		docente.setBounds(224, 180, 109, 23);
		contentPane.add(docente);
		
		//JRadio Diretoria
		JRadioButton diretoria = new JRadioButton("Diretoria");
		diretoria.setFont(new Font("Arial", Font.PLAIN, 20));
		diretoria.setBounds(108, 233, 148, 23);
		contentPane.add(diretoria);
		
		//ButtonGrounp- logins
		ButtonGroup logins1 = new ButtonGroup();
		logins1.add(aluno);
		logins1.add(docente);
		logins1.add(diretoria);
		
		//Botão de login1
		JButton botaoEntrada = new JButton("Login");
		botaoEntrada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			if(docente.isSelected()){
				loginProfessor f = new loginProfessor();
				f.setVisible(true);
			
			}else if(aluno.isSelected()){
				loginAluno fa = new loginAluno();
				fa.setVisible(true);
			
			}else if(diretoria.isSelected()){
				loginDiretoria fd = new loginDiretoria();
				fd.setVisible(true);
	
			}
				
				
				//Verificar se apenas um ButtonGrounp foi selecionado e se não mandar mensagem
				try{
				 logins1.getSelection().getActionCommand();
				}catch (Exception error) {
					JOptionPane.showMessageDialog(null, "Escolha apenas um login");
				}
				
				
			}
		});
		botaoEntrada.setFont(new Font("Arial", Font.PLAIN, 20));
		botaoEntrada.setBounds(39, 294, 87, 23);
		contentPane.add(botaoEntrada);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSair.setBounds(154, 294, 89, 23);
		contentPane.add(btnSair);
		
		imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon(formularioPrincipal.class.getResource("/imagem/plano de fundo66.png")));
		imagemFundo.setBounds(0, -57, 598, 520);
		contentPane.add(imagemFundo);
		
		
		
	}	
	}
