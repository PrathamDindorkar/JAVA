import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class MultiplicationTable extends JFrame {
    int ROWS = 10;
    int COLS = 10;

    public MultiplicationTable() {
        setTitle("Multiplication Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLS));

        // Populate the panel with JLabels containing the multiplication table values
        for (int row = 1; row <= ROWS; row++) {
            for (int col = 1; col <= COLS; col++) {
                int product = row * col;
                JLabel label = new JLabel(String.valueOf(product));
                panel.add(label);

            }
        }

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplicationTable();
    }
}