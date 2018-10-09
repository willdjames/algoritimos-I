package al.menorPreco;

public class MenorPreco {

	public static void main(String[] args) {

		double[] precos = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 55000;
		precos[4] = 17000;

		int menorPreco = 0;

		for (int atual = 0; atual < precos.length; atual++) {
			if (precos[atual] < precos[menorPreco]) {
				menorPreco = atual;
			}
		}

		System.out.println(menorPreco);
		System.out.println(precos[menorPreco]);
	}

}
