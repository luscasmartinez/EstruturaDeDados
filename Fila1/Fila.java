public class Fila implements IFila {

    private int nElementosFila;
    private int inicioFila;
    private Object[] vetFila;

    public Fila(int tamanhoFila) {
        this.nElementosFila = 0;
        this.inicioFila = 0;
        this.vetFila = new Object[tamanhoFila];
    }

    public boolean add(Object info) { // método que insere na fila
        if (this.nElementosFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicioFila + this.nElementosFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElementosFila++;
        return true;
    }

    @Override
    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila vazia");
            return false;
        } else {
            this.inicioFila = (this.inicioFila + 1) % this.vetFila.length;
            this.nElementosFila--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.nElementosFila == 0;
    }

    @Override
    public int size() {
        return this.nElementosFila;
    }

    public void imprime() {
        System.out.println("Elementos da fila:");
        int index = this.inicioFila;
        for (int i = 0; i < this.nElementosFila; i++) {
            System.out.print(" (" + this.vetFila[index] + ") ");
            index = (index + 1) % this.vetFila.length;
        }
    }

}
