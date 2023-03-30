package atividade_3;

import java.util.Scanner;

public class T {
	
	Aluno aluno;
	Scanner scan = new Scanner (System.in);
	
	public void test () {
		System.out.print("Informe o nome do aluno: ");
		 aluno.setNome(scan.nextLine());
		
		System.out.print("A idade: ");
		aluno.setIdade(scan.nextInt());
		
		System.out.print("Sua nota: ");
		aluno.setNota(scan.nextDouble());
		
		
		
	}
}
