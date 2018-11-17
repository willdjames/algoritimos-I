package al.menorPreco;

public class MaiorEMenorSalarioMain {

	public static void main(String[] args) {

		Empregado[] empregados = new Empregado[4];
		empregados[0] = new Empregado("Fernando", 3200); 
		empregados[1] = new Empregado("Alfredo", 6000);
		empregados[2] = new Empregado("Flavio", 5000);
		empregados[3] = new Empregado("Marcela", 2200);
		
		int maiorSalario = 0;
		int menorSalario = 0;
		for(int atual=0; atual < empregados.length; atual++) {
			
			if(empregados[atual].getSalario() > empregados[maiorSalario].getSalario()) {
				maiorSalario = atual;
			}else if(empregados[atual].getSalario() < empregados[menorSalario].getSalario()) {
				menorSalario = atual;
			}
		}
		
		System.out.println(empregados[menorSalario]); // 3
		System.out.println(empregados[maiorSalario]); // 1
		
	}

}
