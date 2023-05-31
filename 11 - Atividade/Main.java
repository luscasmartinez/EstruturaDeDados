public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        
        System.out.println("Adicionando elementos na fila:");
        fila.add("1");
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

    
        
        
        fila.remove();
        fila.remove();
        
        fila.add("7");
        fila.add(8);
        fila.remove();
        fila.add("zé");
        

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Fila está vazia? " + fila.isEmpty());
        
        fila.imprime();
    }
}
