package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRPNTest {

	@Test
	void test() {
		PopPush calc = new RPN("5 7 *");
		 double resultat = calc.resultado();
		 double esperat = 35;
		 assertEquals(esperat, resultat);
	}
	
	@Test
	void tes1() {
		PopPush calc = new RPN("6 2 - 1 / 7 + 9 * 8 -");
		 double resultat = calc.resultado();
		 double esperat = 91;
		 assertEquals(esperat, resultat);
	}
	
	@Test
	void test2() {
		PopPush calc = new RPN("4 5 * 7 2 / - 3 %");
		 double resultat = calc.resultado();
		 double esperat = 1.5;
		 assertEquals(esperat, resultat);
	}

}
