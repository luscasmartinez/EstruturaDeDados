public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        lista.insereFim(5);
        lista.insereFim(2);
        lista.insereFim(8);
        lista.insereFim(1);
        lista.insereFim(7);
        
        System.out.println("Lista antes da ordenação:");
        lista.imprimirLista();
        
        lista.ordenarBubbleSort();
        
        System.out.println("Lista após a ordenação:");
        lista.imprimirLista();
    }
}
