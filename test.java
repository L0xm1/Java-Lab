import javax.swing.*;
public class test
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("My window");
        jf.setSize(600,600);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb = new JButton("OK");
        JLabel jl = new JLabel("Press this: ");
        JTextField jt = new JTextField("Type something");
        jl.setBounds(50,200,100,30);
        jb.setBounds(200,200,100,30);
        jt.setBounds(50, 300, 300, 100);
        jf.add(jb);
        jf.add(jl);
        jf.add(jt);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
