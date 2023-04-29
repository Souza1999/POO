import java.util.ArrayList;

public class Calculadora {
	
	// Construtor privado para que seja proibido instanciar objetos.
	private Calculadora () {}
	
	// Criação de um histórico da calculadora
	public static ArrayList<String> historico = new ArrayList<>();	
	
	public static double somar(double a, double b) {
		double resultado = a + b;
		historico.add( a + "+" + b + "=" + resultado );
		return resultado;
	}
	
	public static double subtrair(double a, double b) {
		double resultado = a - b;
		historico.add( a + "-" + b + "=" + resultado );
		return resultado;
	}
	
	public static double multiplicar (double a, double b) {
		double resultado = a * b;
		historico.add( a + "*" + b + "=" + resultado );
		return resultado;
	}
	
	public static double dividir (double a, double b) {
		double resultado = a / b;
		historico.add( a + "/" + b + "=" + resultado );
		return resultado;
	}
	
	// Método para exibir o histórico
	public static String exibirHistorico() {
		return historico.toString();
	}

}
