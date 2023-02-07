import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice6 extends JFrame implements AdjustmentListener
{
    JScrollBar sb;

    public practice6()
    {
        super("Scroll Bar");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        sb = new JScrollBar(JScrollBar.HORIZONTAL);
        sb.setBounds(100, 100, 200, 20);
        sb.setMinimum(0);
        sb.setMaximum(256);
        sb.addAdjustmentListener(this);
        add(sb);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        //Change background color of the frame
        getContentPane().setBackground(new Color(sb.getValue(), sb.getValue(), sb.getValue()));
    }
    public static void main(String args[])
    {
        new practice6();
    }
}
