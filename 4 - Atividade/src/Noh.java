public class Noh<T> {
    private T info;
    private Noh proximo;

    public Noh (T info){
        this.info = info;
        this.proximo = null;
    }

    public void setProximo(Noh topo) {
    }


    public T getInfo() {
        return this.info;
    }


    public Noh getProximo() {
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
   

}
