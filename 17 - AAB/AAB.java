public class AAB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                } // fim else
            } // fim while
        } // fim else
    } // fim da operação add

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }

    public boolean procura(int element) {
        return procura(raiz, element);
    }

    private boolean procura(Noh node, int element) {
        if (node == null)
            return false;

        if (node.valor == element)
            return true;

        if (element < node.valor)
            return procura(node.esq, element);
        else
            return procura(node.dir, element);
    }

    public void imprime() {
        imprime(raiz);
    }

    private void imprime(Noh node) {
        if (node != null) {
            imprime(node.esq);
            System.out.print(node.valor + " ");
            imprime(node.dir);
        }
    }

 
}