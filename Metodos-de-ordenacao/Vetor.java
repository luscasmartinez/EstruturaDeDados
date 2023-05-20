import java.util.Arrays;

public class Vetor  {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public int tamanho() {
        return elementos.length;
    }

    public int get(int indice) {
        return elementos[indice];
    }

    public void set(int indice, int valor) {
        elementos[indice] = valor;
    }

    public void preencherAleatorio() {
        for (int i = 0; i < tamanho(); i++) {
            elementos[i] = (int) (Math.random() * 1000);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < tamanho() - 1; i++) {
            for (int j = 0; j < tamanho() - i - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < tamanho() - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tamanho(); j++) {
                if (elementos[j] < elementos[menor]) {
                    menor = j;
                }
            }
            int aux = elementos[i];
            elementos[i] = elementos[menor];
            elementos[menor] = aux;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < tamanho(); i++) {
            int chave = elementos[i];
            int j = i - 1;
            while (j >= 0 && elementos[j] > chave) {
                elementos[j + 1] = elementos[j];
                j--;
            }
            elementos[j + 1] = chave;
        }
    }
}
