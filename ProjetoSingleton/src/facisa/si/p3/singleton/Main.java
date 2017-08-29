package facisa.si.p3.singleton;

public class Main {
	
	public static void main(String[] args) {
		
		Janela j = Janela.getInstance();
		System.out.println(j.Abrir());
		System.out.println(j.Fechar());
		System.out.println(j.OutrosMetodos());
		
		
		
		
		
	}
}
