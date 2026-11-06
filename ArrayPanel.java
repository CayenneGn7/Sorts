import java.awt.*;
import javax.swing.*;
public class ArrayPanel extends JPanel {
    private final int[] valores = {5, 2, 4, 1, 3};
    private int indiceAtual = -1;
    private int menorIndice = -1;
    public ArrayPanel(){
        setBackground(Color.BLACK);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int largura = 60;
        int espaco =  30;
        int base = getHeight() - 80;

        for( int i = 0; i < valores.length; i++){
            int altura = valores[i]*50;
            int x = 100 + i * (largura + espaco);
            int y = base - altura;

            if (i == menorIndice) {
                g.setColor(Color.WHITE);
            } else if (i == indiceAtual) {
                g.setColor(new Color(255, 166, 228));
            } else {
                g.setColor(Color.MAGENTA);
            }
            g.fillRect(x,y,largura,altura);

            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(valores[i]), x + 25, base + 25);

        }
    }
    public void destacarIndice(int indice) {
        indiceAtual = indice;
        repaint();
    }
    public void destacarIndices(int atual, int menor) {
        indiceAtual = atual;
        menorIndice = menor;
        repaint();
    }
    public int[] getValores() {
        return valores;
    }
}
