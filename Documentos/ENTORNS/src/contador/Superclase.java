package contador;

public class Superclase {

	protected static String msg;
	private SuperclaseData data = new SuperclaseData();

	public Superclase() {
		super();
	}

	public void imp(ImpParameter parameterObject) {
		msg = "Hola buenas";
		System.out.println(msg);
		System.out.println(parameterObject.cadena);
		//Contador c2 = new Contador();
	}

}