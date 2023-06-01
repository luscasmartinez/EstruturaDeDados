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

    public boolean palindromo(String palavra) {
        // Limpa a pilha
        this.numElem = 0;

        // Adiciona os caracteres da palavra na pilha
        for (int i = 0; i < palavra.length(); i++) {
            push(palavra.charAt(i));
        }

        // Compara os caracteres da palavra com os caracteres desempilhados
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != (char) pop()) {
                return false;
            }
        }

        return true;
    }

    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Estado da pilha: ");
            for (int i = numElem - 1; i >= 0; i--) {
                System.out.print(pilha[i] + " ");
            }
            System.out.println();
        }
    }

}
