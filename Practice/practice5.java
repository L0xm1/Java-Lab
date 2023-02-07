import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice5 extends JFrame implements ActionListener
{
    JTextField inp = new JTextField();
    JTextArea out = new JTextArea();
    JButton b1 = new JButton("Submit");

    public practice5()
    {
        inp.setBounds(100,100,90,20);
        out.setBounds(100,130,200,200);
        b1.setBounds(200,100,100,20);
        b1.addActionListener(this);
        add(inp);
        add(out);
        add(b1);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new practice5();
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = inp.getText();
        int n = Integer.parseInt(s);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 10; i++)
            sb.append(n + " * " + i + " = " + (n*i)+"\n");
        out.setText(sb.toString());
    }
}
