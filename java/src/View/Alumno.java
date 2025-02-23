package src.View;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Empty Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}