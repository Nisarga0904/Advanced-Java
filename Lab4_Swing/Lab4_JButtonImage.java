// 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
// Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
// pressed by implementing the event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Lab4_JButtonImage extends JFrame {
    private JLabel messageLabel;
    private JButton digitalClockButton;
    private JButton hourglassButton;
    public Lab4_JButtonImage() {
        setTitle("Button Image Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        messageLabel = new JLabel(" ", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(messageLabel, BorderLayout.NORTH);
       ImageIcon digitalClockIcon = new ImageIcon("c:\\Users\\nisar\\Desktop\\resized_clock_equal.png");
       ImageIcon hourGlassIcon = new ImageIcon("c:\\Users\\nisar\\Desktop\\HourGlass.png");             
        digitalClockButton = new JButton(digitalClockIcon);
        hourglassButton = new JButton(hourGlassIcon);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(hourglassButton);
        add(buttonPanel, BorderLayout.CENTER);
        digitalClockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed digital clock!");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("You have pressed hourglass!");
            }
        });
        setLocationRelativeTo(null); 
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Lab4_JButtonImage());
    }
}
