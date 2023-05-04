public class Vetor implements IVetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int tamanho) {
        this.elementos = new int[tamanho];
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }


    @Override
    public int getElemento(int indice) {
        return elementos[indice];
    }

    public void setElemento(int inidice, int valor) {
        elementos[inidice] = valor;
    }

    public int maiorRecursivo() {
        return maiorRecursivo(elementos, tamanho - 1);
    }

    private int maiorRecursivo(int[] elementos, int indice) {
        if (indice == 0) {
            return elementos[0];
        } else {
            int maiorParcial = maiorRecursivo(elementos, indice - 1);
            if (maiorParcial > elementos[indice]) {
                return maiorParcial;
            } else {
                return elementos[indice];
            }
        }
    }

    public int maiorIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    

}
