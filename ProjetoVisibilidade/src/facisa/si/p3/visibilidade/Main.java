package facisa.si.p3.visibilidade;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Funcionario func = Funcionario.getInstancia();
		func.setNome("jhonata Candido Ferreira");
		func.setCpf("08080888812");
		func.setSalario(5000);
		System.out.println(func.getBonificacao());
		
		Funcionario ger = new Gerente();
		ger.setNome("jhonata");
		ger.setCpf("00098787670");
		ger.setSalario(10000);
		System.out.println(ger.getBonificacao());

	}

}
