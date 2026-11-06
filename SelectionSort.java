import javax.swing.Timer;

public class SelectionSort {

    private static Timer timer;
    private static int i, j, menor;
    private static int[] valores;
    private static ArrayPanel painel;

    public static void ordenar(int[] vetor, ArrayPanel painelTela) {
        valores = vetor;
        painel = painelTela;
        i = 0;
        j = 1;
        menor = 0;
        timer = new Timer(800, e -> {
            if (j < valores.length) {
                if (valores[j] < valores[menor]) {
                    menor = j;
                }
                painel.destacarIndices(j, menor);
                j++;
            } else {
                int aux = valores[i];
                valores[i] = valores[menor];
                valores[menor] = aux;

                painel.repaint();

                i++;

                if (i < valores.length - 1) {
                    menor = i;
                    j = i + 1;
                } else {
                    timer.stop();
                    painel.destacarIndices(-1, -1);
                }
            }
        });

        timer.start();
    }
}