package atividade_3;

public class Vetor {
	
	private double vetNotas [] = new double[5];
	private Aluno vetAlunos[] = new Aluno[5];
	
	
	public void addNota(double nota) {
		if (vetNotas.length == 5) {
	        for (int i = 0; i < vetNotas.length; i++) {
	            if (vetNotas[i] == 0.0) {
	            	vetNotas[i] = nota;
	                break;
	            }
	        }
	    } else {
	        throw new RuntimeException("Vetor não tem tamanho suficiente para adicionar uma nova nota.");
	    }
	}
	
	public void addAluno(Aluno aluno, Aluno[] vetAlunos) {
		for (int i = 0; i < vetAlunos.length; i++) {
			if(vetAlunos[i] == null) {
				vetAlunos[i] = aluno;
				break;
			}
		}
	}
	
}
