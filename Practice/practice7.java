import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice7 extends JFrame implements AdjustmentListener
{
    JScrollBar r;
    JScrollBar g;
    JScrollBar b;
    public practice7()
    {
        super("Scroll Bar");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        r = new JScrollBar(JScrollBar.HORIZONTAL);
        r.setBounds(100, 100, 200, 20);
        r.setMinimum(0);
        r.setMaximum(256);
        r.addAdjustmentListener(this);
        add(r);
        g = new JScrollBar(JScrollBar.HORIZONTAL);
        g.setBounds(100, 150, 200, 20);
        g.setMinimum(0);
        g.setMaximum(256);
        g.addAdjustmentListener(this);
        add(g);
        b = new JScrollBar(JScrollBar.HORIZONTAL);
        b.setBounds(100, 200, 200, 20);
        b.setMinimum(0);
        b.setMaximum(256);
        b.addAdjustmentListener(this);
        add(b);
        setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        //Change background color of the frame
        getContentPane().setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
    }
    public static void main(String args[])
    {
        new practice7();
    }
}
