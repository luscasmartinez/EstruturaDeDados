import java.util.Arrays;

public class Vetor implements IVetor{
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

    public void ordenar() {
        Arrays.sort(elementos);
    }

    public int pesquisaBinariaIterativa(int valor) {
        int inicio = 0;
        int fim = tamanho() - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (elementos[meio] == valor) {
                return meio;
            } else if (elementos[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public int pesquisaBinariaRecursiva(int valor) {
        return pesquisaBinariaRecursiva(valor, 0, tamanho() - 1);
    }

    private int pesquisaBinariaRecursiva(int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;
        if (elementos[meio] == valor) {
            return meio;
        } else if (elementos[meio] < valor) {
            return pesquisaBinariaRecursiva(valor, meio + 1, fim);
        } else {
            return pesquisaBinariaRecursiva(valor, inicio, meio - 1);
        }
    }

    public int pesquisaLinear(int valor) {
        for (int i = 0; i < tamanho(); i++) {
            if(elementos[i]==valor){
                return i;
            }
        }
        return -1;
    }
}