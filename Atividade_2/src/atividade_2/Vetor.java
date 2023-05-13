package atividade_2;

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
	public boolean Contem (Aluno aluno) {
		for(int i = 0; i < alunos.length; i++){
			if(aluno.getNome() == alunos[i].getNome()){
				return true;
			}
			return false;
		}
		return false;	
	}
}
