package controlador;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class acao {

	
		public void cadastrar (String txtloginA, String txtemailA, String txtfemA, String txtmascA, int txtidadeA, int txtsenhaA){
		
			bancoDadosA ba = new bancoDadosA();
			ba.setLoginA(txtloginA);
			ba.setSenhaA(txtsenhaA);
			ba.setEmailA(txtemailA);
			ba.setIdadeA(txtidadeA);
			ba.setFemA(txtfemA);
			ba.setMasc(txtmascA);
			
			
			bancoDadosA.dados.add(ba);
			
			
			
			//Método para retornar os dados do Aluno
			
			public DefaultTableModel listarAlunos() {
				
				
				//DefaultTableModel
				DefaultTableModel modelo = new DefaultTableModel();
				modelo.addColumn("Aluno");
				modelo.addColumn("Idade");
				
				
				for(int indice=0; indice<bancoDadosA.dados.size(); indice++) {
					modelo.addRow(new Object[] {
						bancoDadosA.dados.get(indice).getLoginA(),
						bancoDadosA.dados.get(indice).getSenhaA(),
					});
					
				}
			
					return modelo;
	}


			public void btnAlterar(JTextField campologinA, JPasswordField campoSenhaA) {
				// TODO Auto-generated method stub
				
			}


			public void btnAlterar(JTextField campoSenhaA, JTextField campoEmail, JTextField campoIdade,
					JTextField campoLoginA, JTextField campoNome) {
				// TODO Auto-generated method stub
				
			}


			public void excluir(Object linha) {
				// TODO Auto-generated method stub
				
			}



			
			

			
			
}
