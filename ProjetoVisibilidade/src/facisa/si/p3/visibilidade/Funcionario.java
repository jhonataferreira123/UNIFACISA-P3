package facisa.si.p3.visibilidade;

public class Funcionario {

	/**
	 * @param args
	 */
		private static Funcionario INSTANCIA = new Funcionario();
		protected String nome;
		protected String cpf;
		protected double salario;
		
		
		//Método público estático realizando o primeiro e único acesso necessário nesse tipo de aplicação
		public static Funcionario getInstancia(){
			return INSTANCIA;
		}
		
		
		public double getBonificacao(){
			return this.salario * 0.10;
		}


		public static Funcionario getINSTANCIA() {
			return INSTANCIA;
		}


		public static void setINSTANCIA(Funcionario iNSTANCIA) {
			INSTANCIA = iNSTANCIA;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}

	    

}
