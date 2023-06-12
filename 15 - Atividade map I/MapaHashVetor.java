public class MapaHashVetor {
    private int capacidadeInicial;
    private double fatorCargaMaximo;
    private int fatorRedimensionamento;

    private Aluno[] vetor;
    private int tamanho;

    public MapaHashVetor() {
        this.capacidadeInicial = 20;
        this.fatorCargaMaximo = 0.75;
        this.fatorRedimensionamento = 2;

        this.vetor = new Aluno[this.capacidadeInicial];
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    private int proximaPosicaoLivre(int indice) {
        int proximoIndice = indice;
        while (this.vetor[proximoIndice] != null) {
            proximoIndice = (proximoIndice + 1) % this.vetor.length;
        }
        return proximoIndice;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        int indice = hash;
        while (this.vetor[indice] != null) {
            if (this.vetor[indice].getMatricula() == chave) {
                return this.vetor[indice];
            }
            indice = (indice + 1) % this.vetor.length;
        }
        return null; // Elemento não encontrado
    }

    public void put(int chave, Aluno valor) {
        if (this.tamanho >= this.fatorCargaMaximo * this.vetor.length) {
            resize();
        }

        int hash = hash(chave);
        int indice = proximaPosicaoLivre(hash);

        this.vetor[indice] = valor;
        this.tamanho++;
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        int indice = hash;
        while (this.vetor[indice] != null) {
            if (this.vetor[indice].getMatricula() == chave) {
                Aluno aluno = this.vetor[indice];
                this.vetor[indice] = null;
                this.tamanho--;
                return aluno;
            }
            indice = (indice + 1) % this.vetor.length;
        }
        return null; // Elemento não encontrado
    }

    private void resize() {
        int novoTamanho = this.vetor.length * this.fatorRedimensionamento;
        Aluno[] novoVetor = new Aluno[novoTamanho];

        for (Aluno aluno : this.vetor) {
            if (aluno != null) {
                int novaHash = hash(aluno.getMatricula());
                int novoIndice = proximaPosicaoLivre(novaHash);
                novoVetor[novoIndice] = aluno;
            }
        }

        this.vetor = novoVetor;
    }
}
