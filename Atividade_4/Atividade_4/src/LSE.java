public class LSE implements Lista {

    private Noh inicio;

    public LSE(){
        this.inicio = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if(inicio == null)
            inicio = novo;
        else{
            novo.setProximo(novo);
            inicio = novo;
        }
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (inicio == null)
            inicio = novo;
        else{
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i = i.getProximo())
                ultimo = i;
            ultimo.setProximo(novo);
        }
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public boolean estahVazia() {
        return this.inicio == null;
    }

    @Override
    public boolean remove(int info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getInfo() != info){
            ant = p;
            p = p.getProximo();
        }
        if (p == null)
            return false;
        if(ant == null)
            inicio = p.getProximo();
        else 
            ant.setProximo(p.getProximo());
            return true;
    }

    @Override
    public int tamanho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanho'");
    }

    public void imprimeLista(){
        Noh novoNoh = inicio;
        while (novoNoh !=null){
            System.out.println(novoNoh.getInfo()+" ");
            novoNoh = novoNoh.getProximo();
        }
        System.out.println("");
    }
    
}
