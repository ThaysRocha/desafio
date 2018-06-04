package controlador;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Acao2 {

	public void cadastrar (String txtloginP, String txtemailP, String txtfemP, String txtmascP, int txtidadeP, int txtsenhaP){
		
		BancodeDados2 bp = new BancodeDados2();
		bp.setLogin(txtloginP);
		bp.setSenhaP(txtsenhaP);
		bp.setEmailP(txtemailP);
		bp.setIdadeP(txtidadeP);
		bp.setFemP(txtfemP);
		bp.setMasc(txtmascP);
		
		
		BancodeDados2.dado.add(bp);
		
		
		
		//Método para retornar os dados do Aluno
		
		public DefaultTableModel listarAlunos() {
			
			
			//DefaultTableModel
			DefaultTableModel modelo2 = new DefaultTableModel();
			modelo2.addColumn("Professor");
			modelo2.addColumn("Idade");
			
			
			for(int indice=0; indice<BancodeDados2.dado.size(); indice++) {
				modelo2.addRow(new Object[] {
					BancodeDados2.dado.get(indice).getLoginP(),
					BancodeDados2.dado.get(indice).getSenhaP(),
				});
				
			}
		
				return modelo2;
}


		public void btnAlterar(JTextField campologinP, JPasswordField campoSenhaP) {
			// TODO Auto-generated method stub
			
		}


		public void btnAlterar(JTextField campoSenhaP, JTextField campoEmail, JTextField campoIdade,
				JTextField campoLoginP, JTextField campoNome) {
			// TODO Auto-generated method stub
			
		}


		public void excluir(Object linha) {
			// TODO Auto-generated method stub
			
		}
	
}
