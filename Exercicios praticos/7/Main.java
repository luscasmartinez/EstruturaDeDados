public class Main {
    public static void main(String[] args) {
        LSE lista = new LSE();
        
        lista.insereInicio(5);
        lista.insereFim(8);
        lista.insereFim(12);
        lista.insereFim(3);
        
        System.out.println("Lista simplesmente encadeada:");
        lista.imprime_rec();
    }
}
