
import java.awt.*;
import javax.swing.*;

public class VizualizerFrame extends JFrame{
    private final ArrayPanel painel;
    public VizualizerFrame(){
        setTitle("Sorting Visualizer");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        painel = new ArrayPanel();
        add(painel);
        painel.destacarIndice(0);
        int[] valores = painel.getValores();
        SelectionSort.ordenar(valores, painel);
    }
}
