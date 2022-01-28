package metodos;

public class Calculadora {
	public static void main(String[] args) {
	System.out.println( "A soma dos numeros sao: " + (Calculadora.soma(4, 2)) );
	}

	public static double soma(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtracao(double num1, double num2) {
		return   num1 - num2;
	
	}
	public static double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}

	public static double divisao(double num1, double num2) {
		return num1 / num2;
	}
}