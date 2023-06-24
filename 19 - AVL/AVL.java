public class AVL {
    private No raiz;
    
    public AVL() {
        this.raiz = null;
    }
    
    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }
    
    private int fatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
    }
    
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;
        
        x.direita = y;
        y.esquerda = T2;
        
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        
        return x;
    }
    
    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;
        
        y.esquerda = x;
        x.direita = T2;
        
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        
        return y;
    }
    
    public void inserir(int chave) {
        this.raiz = inserirRecursivo(this.raiz, chave);
    }
    
    private No inserirRecursivo(No no, int chave) {
        if (no == null) {
            return new No(chave);
        }
        
        if (chave < no.chave) {
            no.esquerda = inserirRecursivo(no.esquerda, chave);
        } else if (chave > no.chave) {
            no.direita = inserirRecursivo(no.direita, chave);
        } else {
            return no;
        }
        
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));
        
        int fatorBalanceamento = fatorBalanceamento(no);
        
        if (fatorBalanceamento > 1 && chave < no.esquerda.chave) {
            return rotacaoDireita(no);
        }
        
        if (fatorBalanceamento < -1 && chave > no.direita.chave) {
            return rotacaoEsquerda(no);
        }
        
        if (fatorBalanceamento > 1 && chave > no.esquerda.chave) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }
        
        if (fatorBalanceamento < -1 && chave < no.direita.chave) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }
        
        return no;
    }
    
    public boolean buscar(int chave) {
        return buscarRecursivo(this.raiz, chave);
    }
    
    private boolean buscarRecursivo(No no, int chave) {
        if (no == null) {
            return false;
        }
        
        if (chave == no.chave) {
            return true;
        }
        
        if (chave < no.chave) {
            return buscarRecursivo(no.esquerda, chave);
        } else {
            return buscarRecursivo(no.direita, chave);
        }
    }
    
    public void imprimirInOrder() {
        imprimirInOrderRecursivo(this.raiz);
        System.out.println();
    }
    
    private void imprimirInOrderRecursivo(No no) {
        if (no != null) {
            imprimirInOrderRecursivo(no.esquerda);
            System.out.print(no.chave + " ");
            imprimirInOrderRecursivo(no.direita);
        }
    }
}
