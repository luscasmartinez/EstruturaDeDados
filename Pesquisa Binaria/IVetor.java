public interface IVetor {

    int tamanho();

    int get(int indice);

    void set(int indice, int valor);

    void preencherAleatorio();

    void ordenar();

    int pesquisaBinariaIterativa(int valor);

    int pesquisaBinariaRecursiva(int valor);

    int pesquisaLinear(int valor);
}
