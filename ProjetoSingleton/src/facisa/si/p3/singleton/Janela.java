package facisa.si.p3.singleton;

public final class Janela {

	private static final Janela INSTANCIA = new Janela();
	
	
	public static final String Singleton = "Esse eu vejo fora";
	
	
	
	//M�todo p�blico est�tico realizando o primeiro e �nico acesso necess�rio nesse tipo de aplica��o
	public static Janela getInstance(){
		return INSTANCIA;
	}
	
	//Aqui vou poder executar esse m�todo de qualquer lugar do meu projeto
	public static void Abrir(){
		System.out.println("A Janela Abriu...");
		
	}
	
	//Aqui vou poder executar esse m�todo de qualquer lugar do meu projeto
	public static void Fechar(){
		System.out.println("A Janela Abriu...");
		
	}
	
	//Aqui eu poderia ter v�rios outros m�todos que seriam vistos em qualquer lugar de meu projeto.
	public static void OutrosMetodos(){
		System.out.println("Aqui seriam outros m�todos");
	}
	
	//Os m�todos private s� seram vistos dentro da classe
	private static void MetodoPrivado(){
		System.out.println("Eu sou um m�todo privado");
	}
	
}
