public class LSE implements Lista {// TAD Lista simplesmente encadeada
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(int info) { // info = 10
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void insereFim(int info) { // info = 7
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(int info) { // info = 10
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info) { // busca
            ant = p;
            p = p.getProx();
        }
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (ant == null) // retira info do início
            inicio = p.getProx();
        else
            ant.setProx(p.getProx());
        return true;
    }

    public int tamanho() {
        int count = 0;
        Noh atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.getProx();
        }
        return count;
    }

    public void imprime_rec() {
        imprimeRecursivo(inicio);
    }
    
    private void imprimeRecursivo(Noh noh) {
        if (noh == null)
            return;
    
        System.out.print(noh.getInfo() + " ");
        imprimeRecursivo(noh.getProx());
    }
    
    public void ordenarBubbleSort() {
        if (inicio == null || inicio.getProx() == null) {
            return; // Nada para ordenar se a lista estiver vazia ou tiver apenas um elemento
        }
    
        boolean trocou;
        do {
            trocou = false;
            Noh atual = inicio;
            Noh proximo = inicio.getProx();
            while (proximo != null) {
                if (atual.getInfo() > proximo.getInfo()) {
                    int temp = atual.getInfo();
                    atual.setInfo(proximo.getInfo());
                    proximo.setInfo(temp);
                    trocou = true;
                }
                atual = proximo;
                proximo = proximo.getProx();
            }
        } while (trocou);
    }
    
    public void imprimirLista() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }
    

}
