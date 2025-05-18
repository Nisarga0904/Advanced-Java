package Swings;
import javax.swing.*;
import java.awt.event.*;
public class MouseEventsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Click Me");
        JLabel statusLabel = new JLabel("Perform mouse actions on the button", SwingConstants.CENTER);
        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                statusLabel.setText("Mouse Down on Button");
            }

            public void mouseReleased(MouseEvent e) {
                statusLabel.setText("Mouse Up on Button");
            }

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    statusLabel.setText("Double Clicked on Button");
                } else if (e.getClickCount() == 1) {
                    statusLabel.setText("Single Clicked on Button");
                }
            }
        });
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(button, java.awt.BorderLayout.CENTER);
        frame.add(statusLabel, java.awt.BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
