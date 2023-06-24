public class QuickSort {
    public void quickSort(int[] vetor) {
        quickSortRecursivo(vetor, 0, vetor.length - 1);
    }
    
    private void quickSortRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);
            quickSortRecursivo(vetor, inicio, indicePivo - 1);
            quickSortRecursivo(vetor, indicePivo + 1, fim);
        }
    }
    
    private int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int indicePivo = inicio;
        
        for (int i = inicio; i < fim; i++) {
            if (vetor[i] <= pivo) {
                trocar(vetor, i, indicePivo);
                indicePivo++;
            }
        }
        
        trocar(vetor, indicePivo, fim);
        
        return indicePivo;
    }
    
    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
