package controlador;

import java.util.ArrayList;

public class BancodeDados2 {

	//Aributos 
	
			private String txtloginP;
			private String txtemailP;
			private String txtnomeP;
			private String txtfemP;
			private String txtmascP;
			private int txtidadeP;
			private int txtsenhaP;
		
			
			//ArrayList do login e senha dos alunos
			public static ArrayList<BancodeDados2> dado = new ArrayList<>();
			 
		

			//Métodos Mágicos
			public String getLoginP() {
				return txtloginP;
			}
			public void setLoginA(String txtloginP) {
				this.txtloginP = txtloginP;
			}
			
			public int getSenhaP() {
				return txtsenhaP;
			}
			public void setSenhaA(int txtsenhaP) {
				this.txtsenhaP = txtsenhaP;
			}
			
			public String getEmailP() {
				return txtloginP;
			}
			public void setEmailA(String txtemailA) {
				this.txtemailP = txtemailP;
			}
			
			public int getIdadeP() {
				return txtidadeP;
			}
			public void setIdadeP(int txtsenhaA) {
				this.txtidadeP = txtidadeP;
			}
			
			public String getFemP() {
				return txtfemP;
			}
			public void setFemP(String txtfemA) {
				this.txtfemP = txtfemP;
			}
			
			public String getMasc() {
				return txtmascP;
			}
			public void setMasc(String txtmascA) {
				this.txtmascP = this.txtmascP;
			}
			
			public String getNomeA() {
				return txtnomeP;
			}
			public void setNomeA(String txtnomeA) {
				this.txtnomeP = this.txtnomeP;
			}

}
