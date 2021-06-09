package calculadora;

public class RPN implements PopPush {
	@Override
	public void pushPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	@Override
	public double popPila( ) {
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}
	public RPN(String commando) {
		arriba = null;
		this.cadena_operacio = commando;
	}
	@Override
	public double resultado( ) {
		double a, b;
		int j;
		for(int i = 0; i < cadena_operacio.length( ); i++) {
			// si es un digito
			if(Character.isDigit(cadena_operacio.charAt(i))) {
				double numero;
				// obtener un string a partir del numero
				String temp = "";
				for(j = 0; (j < 100) && (Character.isDigit(
						cadena_operacio.charAt(i)) || (cadena_operacio.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(cadena_operacio.
							charAt(i));
				}
				// convertir a double y añadir a la pila
				numero = Double.parseDouble(temp);
				pushPila(numero);
			} else if(cadena_operacio.charAt(i) == '+') {
				b = popPila( );
				a = popPila( );
				pushPila(a + b);
			} else if(cadena_operacio.charAt(i) == '-') {
				b = popPila( );
				a = popPila( );
				pushPila(a - b);
			} else if(cadena_operacio.charAt(i) == '*') {
				b = popPila( );
				a = popPila( );
				pushPila(a * b);
			} else if(cadena_operacio.charAt(i) == '/') {
				b = popPila( );
				a = popPila( );
				pushPila(a / b);
			}
			else if(cadena_operacio.charAt(i) == '^') {
				b = popPila( );
				a = popPila( );
				pushPila(Math.pow(a, b));}
			else if(cadena_operacio.charAt(i) == '%') {
				b = popPila( );
				a = popPila( );
				pushPila(a%b);
			} else if(cadena_operacio.charAt(i) != ' ') {
				throw new IllegalArgumentException( );
			}
		}
		double val = popPila( );
		if(arriba != null) {
			throw new IllegalArgumentException( );
		}
		return val;
	}
	private String cadena_operacio;
	private NodoPila arriba;
}