public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        
        // Adicionar elementos à lista
        lista.insereOrdenado(5);
        lista.insereOrdenado(2);
        lista.insereOrdenado(10);
        lista.insereOrdenado(7);
        lista.insereOrdenado(1);
        
        // Imprimir a lista
        lista.imprimirLista();
    }
}