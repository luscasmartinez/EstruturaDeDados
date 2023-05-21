import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {8,9,2, 4, 6, 8, 10,};
        int[] arr2 = {1, 3, 5, 6, 8, 9};

        int[] intersecao = IntersecaoArray.encontrarIntersecao(arr1, arr2);

        System.out.println("Interseção: " + Arrays.toString(intersecao));
    }
}
