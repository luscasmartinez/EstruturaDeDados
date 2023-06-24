public class Main{
    public static void main(String[] args) {
        
        AVL avl = new AVL();

        avl.inserir(51);
        avl.inserir(57);
        avl.inserir(98);
        avl.inserir(19);
        avl.inserir(11);
        avl.inserir(45);
        avl.inserir(79);

        System.out.println("Travessia em Ordem:");
        avl.imprimirInOrder();

        int chaveBusca = 45;
        if (avl.buscar(chaveBusca)) {
            System.out.println("Chave " + chaveBusca + " encontrada!");
        } else {
            System.out.println("Chave " + chaveBusca + " não encontrada!");
        }
    }
}