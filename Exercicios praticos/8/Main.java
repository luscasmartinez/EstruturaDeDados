public class Main {
    public static void main(String[] args) {
        LDE lista1 = new LDE();
        lista1.insereFim(1);
        lista1.insereFim(2);
        lista1.insereFim(3);
        lista1.insereFim(4);
        lista1.insereFim(9);
        
        LDE lista2 = new LDE();
        lista2.insereFim(5);
        lista2.insereFim(6);
        lista2.insereFim(7);
        lista2.insereFim(8);
        
        System.out.println("Lista 1:");
        lista1.imprimirLista();
        
        System.out.println("Lista 2:");
        lista2.imprimirLista();
        
        lista1.concat(lista2);
        
        System.out.println("Lista concatenada:");
        lista1.imprimirLista();
    }
}
