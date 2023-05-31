public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rerber Terichard", 17, 9);
        Aluno a2 = new Aluno("Chapolin", 17, 9);
        Aluno a3 = new Aluno("Telis Berado", 17, 9);

        FilaLista fila = new FilaLista();
        fila.adiciona(a1);
        fila.adiciona(a2);
        fila.adiciona(a3);
        
        fila.imprimirFilaLista();
        System.out.println(fila.tamanho());
        System.out.println("");

        fila.remove();
        fila.imprimirFilaLista();
        System.out.println(fila.tamanho());
    }
}
