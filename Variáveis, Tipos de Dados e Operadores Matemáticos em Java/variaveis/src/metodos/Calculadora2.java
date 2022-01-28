package metodos;

public class Calculadora2 {
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("a soma do" + numero1 + " mais " + numero2 + " e " + resultado);
	}

	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("a subtracao do" + numero1 + "menos" + numero2 + "e" + resultado);
	}

	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("a multiplicacao do " + numero1 + "x" + numero2 + "e" + resultado);
	}

	public static void divisao(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("a divisao do" + numero1 + " pelo " + numero2 + " 'e " + resultado);
	}
}
