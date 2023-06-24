public class Main{
    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();

        int[] vetor = {30, 20, 10, 7, 60, 50, 80, 40, 100};
        
        System.out.println("Vetor original:");
        quickSort.imprimirVetor(vetor);
        
        quickSort.quickSort(vetor);
        
        System.out.println("\nVetor ordenado:");
        quickSort.imprimirVetor(vetor);
        System.out.println("");


        int[] vetor2 = {5, 3, 17, 10, 8, 9};
        
        System.out.println("Vetor original:");
        heapSort.imprimirVetor(vetor2);
        
        heapSort.heapSort(vetor2);
        
        System.out.println("\nVetor ordenado:");
        heapSort.imprimirVetor(vetor2);

    }
}