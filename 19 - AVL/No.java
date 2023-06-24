public class No {
    int chave;
    int altura;
    No esquerda;
    No direita;
    
    public No(int chave) {
        this.chave = chave;
        this.altura = 1;
        this.esquerda = null;
        this.direita = null;
    }
}