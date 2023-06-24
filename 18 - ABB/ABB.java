public class ABB {
    private Noh raiz;
    
    public ABB() {
        this.raiz = null;
    }
    
    public void insert(int chave) {
        this.raiz = insertRecursive(this.raiz, chave);
    }
    
    private Noh insertRecursive(Noh raiz, int chave) {
        if (raiz == null) {
            return new Noh(chave);
        }
        
        if (chave < raiz.chave) {
            raiz.esquerda = insertRecursive(raiz.esquerda, chave);
        } else if (chave > raiz.chave) {
            raiz.direita = insertRecursive(raiz.direita, chave);
        }
        
        return raiz;
    }
    
    public boolean search(int chave) {
        return searchRecursive(this.raiz, chave);
    }
    
    private boolean searchRecursive(Noh raiz, int chave) {
        if (raiz == null) {
            return false;
        }
        
        if (chave == raiz.chave) {
            return true;
        }
        
        if (chave < raiz.chave) {
            return searchRecursive(raiz.esquerda, chave);
        } else {
            return searchRecursive(raiz.direita, chave);
        }
    }
    
    public void printInOrder() {
        printInOrderRecursive(this.raiz);
        System.out.println();
    }
    
    private void printInOrderRecursive(Noh raiz) {
        if (raiz != null) {
            printInOrderRecursive(raiz.esquerda);
            System.out.print(raiz.chave + " ");
            printInOrderRecursive(raiz.direita);
        }
    }
    
    public void remove(int chave) {
        this.raiz = removeRecursive(this.raiz, chave);
    }
    
    private Noh removeRecursive(Noh raiz, int chave) {
        if (raiz == null) {
            return raiz;
        }
        
        if (chave < raiz.chave) {
            raiz.esquerda = removeRecursive(raiz.esquerda, chave);
        } else if (chave > raiz.chave) {
            raiz.direita = removeRecursive(raiz.direita, chave);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }
            
            raiz.chave = findMinValue(raiz.direita);
            raiz.direita = removeRecursive(raiz.direita, raiz.chave);
        }
        
        return raiz;
    }
    
    private int findMinValue(Noh raiz) {
        int minValue = raiz.chave;
        while (raiz.esquerda != null) {
            minValue = raiz.esquerda.chave;
            raiz = raiz.esquerda;
        }
        return minValue;
    }
}
