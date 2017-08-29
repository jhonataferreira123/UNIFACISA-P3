package facisa.si.p3.singleton;

public final class Janela {

	private static final Janela INSTANCIA = new Janela();
	
	
	public static final String Singleton = "Esse eu vejo fora";
	
	
	
	//Método público estático realizando o primeiro e único acesso necessário nesse tipo de aplicação
	public static Janela getInstance(){
		return INSTANCIA;
	}
	
	//Aqui vou poder executar esse método de qualquer lugar do meu projeto
	public static void Abrir(){
		System.out.println("A Janela Abriu...");
		
	}
	
	//Aqui vou poder executar esse método de qualquer lugar do meu projeto
	public static void Fechar(){
		System.out.println("A Janela Abriu...");
		
	}
	
	//Aqui eu poderia ter vários outros métodos que seriam vistos em qualquer lugar de meu projeto.
	public static void OutrosMetodos(){
		System.out.println("Aqui seriam outros métodos");
	}
	
	//Os métodos private só seram vistos dentro da classe
	private static void MetodoPrivado(){
		System.out.println("Eu sou um método privado");
	}
	
}
