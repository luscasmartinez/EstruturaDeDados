import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersecaoArray {
    public static int[] encontrarIntersecao(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> intersecao = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersecao.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] resultado = new int[intersecao.size()];
        for (int k = 0; k < intersecao.size(); k++) {
            resultado[k] = intersecao.get(k);
        }

        return resultado;
    }
}
