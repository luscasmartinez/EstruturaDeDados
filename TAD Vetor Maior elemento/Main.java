import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vetor vetor = new Vetor(1000);
        for (int i = 0; i < vetor.getTamanho(); i++) {
            vetor.setElemento(i, random.nextInt(1000));
        }
        long inicio, fim;

        inicio = System.nanoTime();
        int maiorRecursivo = vetor.maiorRecursivo();
        fim = System.nanoTime();
        System.out.println("Maior elemento (recursivo): " + maiorRecursivo);
        System.out.println("Tempo de execução (recursivo): " + (fim - inicio) + " ns");

        inicio = System.nanoTime();
        int maiorIterativo = vetor.maiorIterativo();
        fim = System.nanoTime();
        System.out.println("Maior elemento (iterativo): " + maiorIterativo);
        System.out.println("Tempo de execução (iterativo): " + (fim - inicio) + " ns");
    }
}