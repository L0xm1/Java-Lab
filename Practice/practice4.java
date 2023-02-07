//Java program to create a button and a text field which handles the button click event and displays the number of times the button was presssed, using swing.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice4 extends JFrame implements ActionListener
{
    JButton b1;
    JTextField t1;
    int count=0;
    practice4()
    {
        b1=new JButton("Click");
        b1.setBounds(100,100,100,50);
        b1.addActionListener(this);
        t1=new JTextField();
        t1.setBounds(100,200,100,50);
        add(b1);
        add(t1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        t1.setText("Number of times button was pressed: "+count);
    }
    public static void main(String args[])
    {
        new practice4();
    }
}