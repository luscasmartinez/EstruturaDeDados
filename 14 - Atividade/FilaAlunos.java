public class FilaAlunos {
    private Noh inicio;
    private Noh fim;

    public FilaAlunos() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(Aluno aluno) {
        Noh novoNoh = new Noh(aluno);
        if (isEmpty()) {
            inicio = novoNoh;
            fim = novoNoh;
        } else {
            fim.setProximo(novoNoh);
            fim = novoNoh;
        }
    }

    public Aluno desenfileirar() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }
        Aluno alunoRemovido = (Aluno) inicio.getInfo();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return alunoRemovido;
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}
