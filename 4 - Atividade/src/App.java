public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new LSE();

        l.insereInicio(51);
        l.insereInicio(5112157);
        l.insereFim(15);
        l.insereFim(155);

        l.imprimeLista();
        
        System.out.println("O tamanho da lista é: "+l.tamanho());
        System.out.println();
        
        l.remove(51);

        l.imprimeLista();
        
        System.out.println("O tamanho da lista é: "+l.tamanho());

        Lista<String> l2 = new LSE<String>();
        l2.insereInicio("Inicio");
        l2.insereFim("Fim");
        l2.insereFim("Que legal isso tudo");

        l2.imprimeLista();


        l2.remove("Fim");
        l2.imprimeLista();
    }
}
