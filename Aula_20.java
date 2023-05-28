public class Animal {
	
	private String nome;
	private double peso;
	
	public Animal (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public String emitirSom() {
		return "Nenhum som";
	}
	
	public String toString() {
		String mensagem = 	"\nNome: " + nome + 
							"\nPeso: " + peso +
							"\nSom: " + emitirSom();
		return mensagem;
	}
}
