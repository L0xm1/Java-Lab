//Write a java program to design an application with three text fields. Display the sum of first two text fields into the third text field.
import javax.swing.*;
public class Class1
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("Sum of two numbers");
        jf.setBounds(400,400,400, 400);
        JTextField jt1 = new JTextField();
        JTextField jt2 = new JTextField();
        JTextField jt3 = new JTextField();
        jf.setVisible(true);
    }
}
