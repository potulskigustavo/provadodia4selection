import java.util.Arrays;

public class Tres {
    public static int[] ordenaSelecao(int[] array) {
        int[] arraySelecao = array.clone();

        for (int i = 0; i < arraySelecao.length; i++) {
            int menor = arraySelecao[i];
            int posMenor = i;

            // Buscando o menor elemento.
            for (int j = i + 1; j < arraySelecao.length; j++) {
                if (menor > arraySelecao[j]) {
                    menor = arraySelecao[j];
                    posMenor = j;
                }
            }

            // Posicionando o menor elemento.
            if (arraySelecao[i] > arraySelecao[posMenor]) {
                int aux = arraySelecao[posMenor];
                arraySelecao[posMenor] = arraySelecao[i];
                arraySelecao[i] = aux;
            }
        }
        return arraySelecao;
    }

    public static int[] ordenaInsercao(int[] array) {
        int[] arrayInsercao = array.clone();
        for (int i = 1; i < arrayInsercao.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arrayInsercao[j + 1] < arrayInsercao[j]) {
                    int aux = arrayInsercao[j + 1];
                    arrayInsercao[j + 1] = arrayInsercao[j];
                    arrayInsercao[j] = aux;
                }
            }
        }

        return arrayInsercao;
    }

    public static void main(String[] args) {
        int[] arrayOriginal = {3, 9, 1, 5, 2, 0, 8, 4, 6, 7, };
        System.out.println("Sequencia Original: " + Arrays.toString(arrayOriginal) + ".");

        int[] arraySelecao = ordenaSelecao(arrayOriginal);
        System.out.println("Sequencia Selecao: " + Arrays.toString(arraySelecao) + ".");

        int[] arrayInsercao = ordenaInsercao(arrayOriginal);
        System.out.println("Sequencia Insercao: " + Arrays.toString(arrayInsercao) + ".");
    }
}