import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        Vetor vetor2 = new Vetor(1000);
        Vetor vetor3 = new Vetor(1000);
        vetor.preencherAleatorio();
        vetor2.preencherAleatorio();
        vetor3.preencherAleatorio();

        long inicio, fim, duracao;

        // Bubble Sort
        inicio = System.nanoTime();
        vetor.bubbleSort();
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Bubble    Sort: " + duracao + " ns");

        // Selection Sort
        inicio = System.nanoTime();
        vetor2.selectionSort();
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Selection Sort: " + duracao + " ns");

        // Insertion Sort
        inicio = System.nanoTime();
        vetor3.insertionSort();
        fim = System.nanoTime();
        duracao = fim - inicio;
        System.out.println("Insertion Sort: " + duracao + " ns");
    }
}
