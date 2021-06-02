package contador;

public class Contador implements interfaz {

	public static Contador createContador() {
		return new Contador();
	}

	private int resultado = 0;
	public boolean siono = true;
	
	
	@Override
	public int getResult() {
		return resultado;
	}
	
	@Override
	public void setResult (int dato) {
		this.resultado = dato;
	}
	
	@Override
	public void conta () {
		for (int i = 0;i<100;i++) {
			resultado = i+1;
			siono = false;
		}
	}
	
}
