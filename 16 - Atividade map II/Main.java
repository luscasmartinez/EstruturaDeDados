public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapa = new MapaHashVetor();

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(1);
        aluno1.setNome("João");

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(2);
        aluno2.setNome("Maria");

        // Inserindo alunos no mapa
        mapa.put(aluno1.getMatricula(), aluno1);
        mapa.put(aluno2.getMatricula(), aluno2);

        // Obtendo alunos pelo número de matrícula
        Aluno alunoObtido1 = mapa.get(1);
        Aluno alunoObtido2 = mapa.get(2);

        System.out.println("Aluno 1: " + alunoObtido1.getNome());
        System.out.println("Aluno 2: " + alunoObtido2.getNome());

        // Removendo um aluno
        Aluno alunoRemovido = mapa.remove(1);
        System.out.println("Aluno removido: " + alunoRemovido.getNome());

        // Verificando se o aluno removido ainda existe no mapa
        Aluno alunoRemovidoNovamente = mapa.get(1);
        if (alunoRemovidoNovamente == null) {
            System.out.println("Aluno 1 removido com sucesso!");
        } else {
            System.out.println("Erro ao remover o aluno 1.");
        }
    }
}
