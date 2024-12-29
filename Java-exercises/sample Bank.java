import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleBankingApp extends JFrame
 {
    private double balance = 0;

    public SimpleBankingApp()
	{
        // Set up the JFrame
        setTitle("Simple Banking Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Components
        JLabel balanceLabel = new JLabel("Balance: $" + balance);
        JTextField amountField = new JTextField();
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton exitButton = new JButton("Exit");

        // Add components to the frame
        add(balanceLabel);
        add(amountField);
        add(depositButton);
        add(withdrawButton);
        add(exitButton);

        // Deposit button action listener
        depositButton.addActionListener(new ActionListener() //anynomous methods which has declaration and defintition at sameplace 
		
		{
            @Override
            public void actionPerformed(ActionEvent e)
			{
                double amount = Double.parseDouble(amountField.getText());
                deposit(amount);
                balanceLabel.setText("Balance: $" + balance);
            }
        });

        // Withdraw button action listener
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                withdraw(amount);
                balanceLabel.setText("Balance: $" + balance);
            }
        });

        // Exit button action listener
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Deposit method
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid amount for deposit.");
        }
    }

    // Withdraw method
    private void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid amount for withdrawal.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleBankingApp().setVisible(true);
            }
        });
    }
}