public class Main {
    public static void main(String[] args) {
        PilhaVet pilha = new PilhaVet(50);
        String palavra1 = "radar";
        String palavra2 = "anotaramadatadamaratona";
        
        System.out.println(palavra1 + " é um palíndromo? " + pilha.palindromo(palavra1));
        pilha.imprimirPilha();

        System.out.println(palavra2 + " é um palíndromo? " + pilha.palindromo(palavra2));
        pilha.imprimirPilha();
    }
}
