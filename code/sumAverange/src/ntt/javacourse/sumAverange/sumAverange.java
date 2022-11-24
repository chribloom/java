package ntt.javacourse.sumAverange;

public class sumAverange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 2;
		int carica = 16;
		int risultato;

		risultato = calcola(numero, carica);
		System.out.println(risultato);

	}

	public static int calcola(int numero, int carica) {

		int n = numero;
		for (int i = 1; i < carica; i++) {
			n = numero * n;

		}
		return n;

	}

}
