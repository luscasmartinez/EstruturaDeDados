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

    Public void bubble_sort(){
        for (int i = 0; i < this.tamanho; i++){
            for (int j = 0; j < this.tamanho-1; j++){
                if (this.vet[j] > this.vet[j+1]) {
                    int aux = this.vet[j];
                    this.vet[j] = this.vet[j+1];
                     this.vet[j+1] = aux;
                }
            }
        }
    }


    Public void selection_sort(){
        for (int i = 0; i < this.totalElem; i++) {
            int menor = i;
            for (int j = i+1; j < this.totalElem; j++) { 
                if (this.vet[j] < this.vet[menor]){
                    menor = j;
                    int aux = vet[i];
                    this.vet[i] = this.vet[menor];
                    this.vet[menor] = aux; 
                }
            }
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < this.totalElem; i++) {
            int chave = this.vet[i];
            int j = i - 1;
            while (j >= 0 && chave < this.vet[j]) {
                this.vet[j + 1] = this.vet[j];
                j--;
            }
        this.vet[j + 1] = chave;
        }
    }
        

}
