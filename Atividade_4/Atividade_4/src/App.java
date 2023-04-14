public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new LSE();

        l.insereInicio(51);

        l.insereFim(15);
        l.insereFim(155);
        


        l.imprimeLista();
        System.out.println(l.tamanho());
    }
}
