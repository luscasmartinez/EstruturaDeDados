public class Main {
    public static void main(String[] args) {
        AAB arvere = new AAB();
        
        arvere.add(50);
        arvere.add(30);
        arvere.add(70);
        arvere.add(20);
        arvere.add(40);
        arvere.add(60);
        arvere.add(80);

        System.out.println(arvere.procura(40));  // true
        System.out.println(arvere.procura(90));  // false
        
        arvere.imprime();
        System.out.println();

        // Adicionando nós para aumentar a profundidade
        arvere.add(99);
        arvere.add(98);
        arvere.add(97);
        arvere.add(96);
        arvere.add(95);

        // Imprimindo a profundidade da árvore
        
    
        
       arvere.imprime();
       System.out.println();
    }
}
