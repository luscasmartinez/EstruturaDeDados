public class Noh {
    private int info; // Este exemplo armazena números inteiros
    private Noh ant; // Destaque para o atributo ant de anterior
    private Noh prox;

    public Noh(int info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public Noh getProx() {
        return prox;
    }

    public void setProx(Noh n) {
        this.prox = n;
    }

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh n) {
        this.ant = n;
    }
}
