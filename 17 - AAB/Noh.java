public class Noh {
    public int valor;
    public Noh pai;
    public Noh esq;
    public Noh dir;

    public Noh(int valor) {
        this.valor = valor;
        this.pai = null;
        this.esq = null;
        this.dir = null;
    }
}