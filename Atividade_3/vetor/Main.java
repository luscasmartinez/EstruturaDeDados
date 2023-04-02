package vetor;

public class Main {

	public static void main(String[] args) {
		VetorNotasNaoOtimizado vetNotas = new VetorNotasNaoOtimizado();
		vetNotas.adiciona(9.0);
		vetNotas.adiciona(5.2);

		Vetor<Object> vetor = new Vetor<>(5);
		vetor.adiciona("abc");
		vetor.adiciona(123);
		vetor.adiciona(new Aluno("João", 18, 8.5));

	}

}
