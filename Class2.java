//Write a swing program to add two numbers from two text frields and display in the third text field on the press of a button.
import javax.swing.*;
public class Class2 
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Addition");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Enter 1st number");
        l1.setBounds(50,50,100,30);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(150,50,100,30);
        f.add(t1);
        JLabel l2=new JLabel("Enter 2nd number");
        l2.setBounds(50,100,100,30);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(150,100,100,30);
        f.add(t2);
        JLabel l3=new JLabel("Result");
        l3.setBounds(50,150,100,30);
        f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(150,150,100,30);
        f.add(t3);
        JButton b=new JButton("Add");
        b.setBounds(150,200,100,30);
        f.add(b);
        f.setLocationRelativeTo(null);
        f.invalidate();
        f.validate();
        f.repaint();
        b.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent e)
            {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                t3.setText(String.valueOf(c));
            }
        });
    }
}
