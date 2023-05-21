public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        
        // Adicionar elementos à lista
        lista.insereInicio(5);
        lista.insereFim(12);
        lista.insereFim(7);
        lista.insereFim(8);
        lista.insereFim(3);
        lista.insereFim(10);
        
        // Contar o número de elementos pares
        int countPares = lista.contarPares();
        System.out.println("Número de elementos pares: " + countPares);
    }
}