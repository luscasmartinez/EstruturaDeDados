public class Main {
    public static void main(String[] args) {
        ABB bst = new ABB ();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("In-Order Traversal:");
        bst.printInOrder();

        int procuraChave = 40;
        if (bst.search(procuraChave)) {
            System.out.println("chave " + procuraChave + " encontrado!");
        } else {
            System.out.println("chave " + procuraChave + " não encontrado!");
        }

        bst.insert(75);
        

        int chaveRemovida = 30;
        bst.remove(chaveRemovida);
        System.out.println("Em ordem após a remoção chave " + chaveRemovida + ":");
        bst.printInOrder();
    
    }
}