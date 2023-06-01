public class Main {
    public static void main(String[] args) {
        FilaAlunos fila = new FilaAlunos();
        PilhaVet pilha = new PilhaVet(10);

        // Adicione alguns alunos à fila
        fila.enfileirar(new Aluno("João", 20, 80));
        fila.enfileirar(new Aluno("Maria", 19, 90));
        fila.enfileirar(new Aluno("Pedro", 21, 85));

        // Inverta a ordem dos alunos usando a pilha
        while (!fila.isEmpty()) {
            Aluno aluno = fila.desenfileirar();
            pilha.push(aluno);
        }

        // Agora, a pilha contém os alunos invertidos
        while (!pilha.isEmpty()) {
            Aluno aluno = (Aluno) pilha.pop();
            System.out.println(aluno.getNome());
        }
    }
}
