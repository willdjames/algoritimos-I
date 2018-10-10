package al.menorPreco;

public class Empregado {

	private String nome;
	private double salario;

	public Empregado(String string, double i) {
		this.nome = string;
		this.salario = i;
		
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return this.nome+"|"+this.salario;
	}

}
