public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novoNoh = new Noh(info);
        if (estahVazia()) {
            inicio = novoNoh;
            fim = novoNoh;
        } else {
            novoNoh.setProx(inicio);
            inicio.setAnt(novoNoh);
            inicio = novoNoh;
        }
    }

    public void insereFim(int info) {
        Noh novoNoh = new Noh(info);
        if (estahVazia()) {
            inicio = novoNoh;
            fim = novoNoh;
        } else {
            fim.setProx(novoNoh);
            novoNoh.setAnt(fim);
            fim = novoNoh;
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(int info) {
        if (estahVazia()) {
            return false;
        }

        Noh atual = inicio;
        while (atual != null) {
            if (atual.getInfo() == info) {
                if (atual == inicio) {
                    inicio = inicio.getProx();
                    if (inicio != null) {
                        inicio.setAnt(null);
                    } else {
                        fim = null;
                    }
                } else if (atual == fim) {
                    fim = fim.getAnt();
                    if (fim != null) {
                        fim.setProx(null);
                    } else {
                        inicio = null;
                    }
                } else {
                    Noh ant = atual.getAnt();
                    Noh prox = atual.getProx();
                    ant.setProx(prox);
                    prox.setAnt(ant);
                }
                return true;
            }
            atual = atual.getProx();
        }
        return false;
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

    public int contarPares() {
        int count = 0;
        Noh atual = inicio;
        while (atual != null) {
            if (atual.getInfo() % 2 == 0) {
                count++;
            }
            atual = atual.getProx();
        }
        return count;
    }

    public void concat(LDE l) {
        if (l == null || l.estahVazia()) {
            return;
        }

        if (this.estahVazia()) {
            this.inicio = l.inicio;
            this.fim = l.fim;
        } else {
            this.fim.setProx(l.inicio);
            l.inicio.setAnt(this.fim);
            this.fim = l.fim;
        }
    }
    
    public void imprimirLista() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

}
