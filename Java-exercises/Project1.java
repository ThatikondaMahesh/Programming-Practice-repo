import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Project1 extends JFrame implements ActionListener {
    JTextField f1;
    JLabel logo;

    Project1() {
        Container c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        ImageIcon img = new ImageIcon("SBI.jpg");
        logo = new JLabel(img);
        logo.setBounds(780, 130, 500, 500);
        c.add(logo);

        JLabel n = new JLabel("UserName:➡️");
        n.setBounds(100, 100, 130, 25);
        c.add(n);

        f1 = new JTextField();
        f1.setBounds(250, 100, 130, 35);
        c.add(f1);

        JLabel a = new JLabel("password:➡️");
        a.setBounds(100, 170, 130, 25);
        c.add(a);

        JPasswordField ad = new JPasswordField(15);
        ad.setEchoChar('*');
        ad.setBounds(250, 170, 130, 30);
        c.add(ad);

        JLabel g = new JLabel("Terms&Condition");
        g.setBounds(100, 300, 130, 25);
        c.add(g);

        JRadioButton m = new JRadioButton("Agree");
        m.setBounds(250, 300, 75, 25);
        c.add(m);

        JRadioButton f = new JRadioButton("Disagree");
        f.setBounds(335, 300, 75, 25);
        c.add(f);

        ButtonGroup bg = new ButtonGroup();
        bg.add(f);
        bg.add(m);

        JButton b = new JButton("Submit");
        b.setBounds(165, 400, 150, 35);
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        String s = f1.getText();
        if (s.equals("Raju")) {
            new Raju();
        } else if (s.equals("Saikumar")) {
            new Saikumar();
        } else if (s.equals("Yashwanth")) {
            // new Yashwanth();
        } else {
            // System.out.println("Invalid UserData😒");
        }
    }

    public static void main(String ar[]) {
        Project1 f = new Project1();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setTitle("Simple SBI Banking");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Account extends JFrame
 {
    int balance = 0;
    JLabel temp;
    Container c1;

    Account(String title) 
	{
        this.setSize(500, 500);
        setVisible(true);
        setTitle(title);

        // Initialize c1
        c1 = this.getContentPane();
        c1.setLayout(null);

        int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;

        JButton b1 = new JButton("Deposit");
        b1.setBounds(50, initialY, buttonWidth, buttonHeight);
        c1.add(b1);

        JButton b2 = new JButton("WithDraw");
        b2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
        c1.add(b2);

        JButton b3 = new JButton("CheckBalance");
        b3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        c1.add(b3);

        JButton b4 = new JButton("Exit");
        b4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        c1.add(b4);

        temp = new JLabel();
		temp.setBounds(800,200,50,50);
    }
}

class Raju extends Account implements ActionListener 
{
    JButton b1, b2, b3, b4;

    Raju()
	{
        super("YOUR ACCOUNT - Raju");

        int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;

        b1 = new JButton("Deposit");
        b1.setBounds(50, initialY, buttonWidth, buttonHeight);
        b1.addActionListener(this);
        c1.add(b1);

        b2 = new JButton("WithDraw");
        b2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
        b2.addActionListener(this);
        c1.add(b2);

        b3 = new JButton("CheckBalance");
        b3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        b3.addActionListener(this);
        c1.add(b3);

        b4 = new JButton("Exit");
        b4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        b4.addActionListener(this);
        c1.add(b4);
    }

    public void actionPerformed(ActionEvent e)
	{
        if (e.getSource() == b1)
			{
               JTextField am = new JTextField();
              am.setBounds(50, 200, 150, 30);
              c1.add(am);
            String amount = am.getText();
            int amou = Integer.parseInt(amount);
            balance = balance + amou;
            temp.setText("Hello Customer Deposit Successful current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } 
		else if (e.getSource() == b2)
		{
            JTextField am = new JTextField();
            am.setBounds(50, 200, 150, 30);
            c1.add(am);
            String amount = am.getText();
            int amou = Integer.parseInt(amount);
            balance = balance - amou;
            temp.setText("Hello Customer WithDraw Successful, current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } 
		else if (e.getSource() == b3) 
		{
            temp.setText("Hello Customer CheckBalance Successful, current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } else if (e.getSource() == b4) 
		{
            System.exit(0);
        }
    }
}

class Saikumar extends Account implements ActionListener {
    JButton b1, b2, b3, b4;

    Saikumar() {
        super("YOUR ACCOUNT - Saikumar");

        int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;

        b1 = new JButton("Deposit");
        b1.setBounds(50, initialY, buttonWidth, buttonHeight);
        b1.addActionListener(this);
        c1.add(b1);

        b2 = new JButton("WithDraw");
        b2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
        b2.addActionListener(this);
        c1.add(b2);

        b3 = new JButton("CheckBalance");
        b3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        b3.addActionListener(this);
        c1.add(b3);

        b4 = new JButton("Exit");
        b4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
        b4.addActionListener(this);
        c1.add(b4);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JTextField am = new JTextField();
            am.setBounds(50, 200, 150, 30);
            c1.add(am);
            String amount = am.getText();
            int amou = Integer.parseInt(amount);
            balance = balance + amou;
            temp.setText("Hello Customer Deposit Successful current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } else if (e.getSource() == b2) {
            JTextField am = new JTextField();
            am.setBounds(50, 200, 150, 30);
            c1.add(am);
            String amount = am.getText();
            int amou = Integer.parseInt(amount);
            balance = balance - amou;
            temp.setText("Hello Customer WithDraw Successful, current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } else if (e.getSource() == b3) {
            temp.setText("Hello Customer CheckBalance Successful, current balance:" + balance);
            temp.setBounds(50, 50, 200, 30);

        } else if (e.getSource() == b4) {
            System.exit(0);
        }
    }
}
