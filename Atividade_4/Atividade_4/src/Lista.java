public interface Lista<T> {
    public void insereInicio(T info);

    public void insereFim(T info);

    public boolean estahVazia();

    public boolean remove(T info);

    public int tamanho();

    public void imprimeLista();

}
