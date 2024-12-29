import javax.swing.*;
import java.awt.*;

public class VerticalButtonsExample extends JFrame {
    public VerticalButtonsExample() {
        Container container = getContentPane();
        container.setLayout(null);

        int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;

        // Create buttons and set bounds
        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, initialY, buttonWidth, buttonHeight);
        container.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
        container.add(button2);

        JButton button3 = new JButton("Button 3");
        button3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        container.add(button3);

        JButton button4 = new JButton("Button 4");
        button4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        container.add(button4);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Vertical Buttons Example");
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VerticalButtonsExample());
    }
}
