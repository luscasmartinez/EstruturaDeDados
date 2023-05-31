public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) { // construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) { // empilha
        if (this.numElem == pilha.length) {
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object top() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        return this.pilha[this.numElem - 1];
    }

    public boolean isEmpty() {
        return this.numElem == 0;
    }

    public int size() {
        return this.numElem;
    }

    public Object pop() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

}
