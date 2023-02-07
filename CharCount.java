import javax.swing.*;
public class CharCount
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame();
        jf.setBounds(500,300,1000,600);
        JTextField jt = new JTextField();
        jt.setBounds(10,10,1000,100);
        JLabel jl = new JLabel();
        jl.setBounds(400,600,100,10);
        jf.add(jt);
        jf.add(jl);
        jf.setVisible(true);
        while (true)
        {
            String s = jt.getText();
            jl.setText(s.length()+"");
        }
    }
}