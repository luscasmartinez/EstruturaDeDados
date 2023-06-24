public class HeapSort {

    public void heapSort(int[] vetor) {
        int tamanho = vetor.length;
        
        // Construir o heap (reorganizar o vetor)
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            heapify(vetor, tamanho, i);
        }
        
        // Extrair elementos do heap um por um
        for (int i = tamanho - 1; i >= 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            
            heapify(vetor, i, 0);
        }
    }
    
    private void heapify(int[] vetor, int tamanho, int indiceRaiz) {
        int maior = indiceRaiz;
        int indiceEsquerda = 2 * indiceRaiz + 1;
        int indiceDireita = 2 * indiceRaiz + 2;
        
        if (indiceEsquerda < tamanho && vetor[indiceEsquerda] > vetor[maior]) {
            maior = indiceEsquerda;
        }
        
        if (indiceDireita < tamanho && vetor[indiceDireita] > vetor[maior]) {
            maior = indiceDireita;
        }
        
        if (maior != indiceRaiz) {
            int temp = vetor[indiceRaiz];
            vetor[indiceRaiz] = vetor[maior];
            vetor[maior] = temp;
            
            heapify(vetor, tamanho, maior);
        }
    }
    
    
    public void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
