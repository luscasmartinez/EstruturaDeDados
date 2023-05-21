public class Fibonacci {
    public int calcularFibonacci(int n) {
        if (n <= 1) {
            return n; // Caso base: retorna o próprio n se for 0 ou 1
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // Chamadas recursivas
        }
    }
}
