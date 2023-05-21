public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10; // Número do termo da série a ser calculado
        int resultado = fibonacci.calcularFibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + resultado);
    }
}
