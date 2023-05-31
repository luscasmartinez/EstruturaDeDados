public class PilhaLista implements IPilha {

    private Noh topo;

    @Override
    public boolean push(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
        return true;

    }

    @Override
    public Object pop() {
        Object info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProximo();
        }
        return info;
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        return topo.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int count = 0;
        Noh current = topo;
        while (current != null) {
            count++;
            current = current.getProximo();
        }
        return count;
    }

}
