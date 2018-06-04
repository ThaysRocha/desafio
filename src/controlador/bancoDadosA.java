package controlador;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class bancoDadosA {

	
		
		
		//Aributos 
		
		private String txtloginA;
		private String txtemailA;
		private String txtnomeA;
		private String txtfemA;
		private String txtmascA;
		private int txtidadeA;
		private int txtsenhaA;
	
		
		//ArrayList do login e senha dos alunos
		public static ArrayList<bancoDadosA> dados = new ArrayList<>();
		 
	

		//Métodos Mágicos
		public String getLoginA() {
			return txtloginA;
		}
		public void setLoginA(String txtloginA) {
			this.txtloginA = txtloginA;
		}
		
		public int getSenhaA() {
			return txtsenhaA;
		}
		public void setSenhaA(int txtsenhaA) {
			this.txtsenhaA = txtsenhaA;
		}
		
		public String getEmailA() {
			return txtloginA;
		}
		public void setEmailA(String txtemailA) {
			this.txtemailA = txtemailA;
		}
		
		public int getIdadeA() {
			return txtidadeA;
		}
		public void setIdadeA(int txtsenhaA) {
			this.txtidadeA = txtidadeA;
		}
		
		public String getFemA() {
			return txtfemA;
		}
		public void setFemA(String txtfemA) {
			this.txtfemA = txtfemA;
		}
		
		public String getMasc() {
			return txtmascA;
		}
		public void setMasc(String txtmascA) {
			this.txtmascA = this.txtmascA;
		}
		
		public String getNomeA() {
			return txtnomeA;
		}
		public void setNomeA(String txtnomeA) {
			this.txtnomeA = this.txtnomeA;
		}

		
}
