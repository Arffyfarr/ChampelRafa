package contador;

public class ContaMain {
	
	public static void Salu2(String msg_desp) {
		System.out.println("Hola, bon dia!");
		
		System.out.println(msg_desp);
	
	}
	
	

	public static void main(String[] args) {
		
		Contador c1 = Contador.createContador();
				
		System.out.println(ContaMain.getResult(c1));
		
		c1.conta();
		
		System.out.println(ContaMain.getResult(c1));
		
		c1.setResult(2);
		
		System.out.println(ContaMain.getResult(c1));
		
		System.out.println(c1.siono);
		
		Salu2("Bye!");
		
		String localVariable = "Dime algo";
		System.out.println(localVariable);
		
		
		System.out.println(0);
	}
	
	
	public static int getResult(Contador contador) {
		return contador.getResult();
	}


	class conta2{
		
		private int S;
		
		public void mostra() {
			System.out.println("1,2,3,4");
		}
	}
}
/*
		private int getAltura() {
			return altura;
		}

		private void setAltura(int altura) {
			this.altura = altura;
		}
	}

}

class Extern extends Superclase{
}
*/
