public class Main {
    public static void main (String[] args) {

        Vetor vetor = new Vetor(1000);
        vetor.preencherAleatorio();
        vetor.ordenar();

        int valorPesquisa = vetor.get(vetor.tamanho() - 1);

        long tempoInicio = System.nanoTime();
        int resultadoIterativo = vetor.pesquisaBinariaIterativa(valorPesquisa);
        long tempoIterativo = System.nanoTime() - tempoInicio;

        tempoInicio = System.nanoTime();
        int resultadoRecursivo = vetor.pesquisaBinariaRecursiva(valorPesquisa);
        long tempoRecursivo = System.nanoTime() - tempoInicio;

        tempoInicio = System.nanoTime();
        int resultadoLinear = vetor.pesquisaLinear(valorPesquisa);
        long tempoLinear = System.nanoTime() - tempoInicio;

        System.out.println("Resultado pesquisa iterativa: " + resultadoIterativo + ", tempo de execução: "+ tempoIterativo + " ns");
        System.out.println("Resultado pesquisa recursiva: " + resultadoRecursivo + ", tempo de execução: "+ tempoRecursivo + " ns");
        System.out.println("Resultado pesquisa linear: "    + resultadoLinear    + ", tempo de execuçãp: "+ tempoLinear    + " ns");

    }
}