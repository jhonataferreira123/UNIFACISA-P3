package facisa.si.p3.visibilidade;

public class Semaforo {
	
	public static final int VERMELHO = 0;
	public static final int AMARELO = 1;
	public static final int VERDE = 2;
	
	private int corAtual;
	
	public Semaforo(int cor) {
		this.corAtual = cor;
	}
	
	public void muda(){
		switch (corAtual) {
		case VERMELHO:
			corAtual = VERDE;
			break;
		case AMARELO:
			corAtual = VERMELHO;
			break;
		case VERDE:
			corAtual = AMARELO;
			break;

		}
	}
	
	private int getCorAtual(){
		return corAtual;
	}
	
	private static String[] nomeCor = {"VERMELHO", "AMARELO", "VERDE"};
	public String getNomeCorAtual(){
		return nomeCor[getCorAtual()];
	}
	
	public String toString(){
		return "semaforo está " + getNomeCorAtual();
	}

}
