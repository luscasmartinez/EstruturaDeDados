package atividade_3;

public class Vetor {

	private Aluno[] alunos;
	private int indice;

	public Vetor(int tamanhoMaximo) {
		alunos = new Aluno[tamanhoMaximo];
		indice = 0;
	}

	public void adicionarAluno(Aluno aluno) {
		if (indice < alunos.length) {
			alunos[indice] = aluno;
			indice++;
		} else {
			System.out.println("Turma cheia!");
		}
	}
}
