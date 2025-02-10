import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.wt.event.*;
public class Radio extends JFrame implements ActionListener
{
    JButton bt;
    JRadioButton r1,r2;
    ButtonGroup g;
    Radio()
    {
        r1=new JRadioButton("male");
        r2=new JRadioButton("female");
        bt=new JButton("clicked");
        bt.add ActionListener(this);
        setLayout(new FlowLayout());
        add(r1);
        add(r2);
        add(bt);
        setVisible(true);
        setSize(400,350 );
        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
        public void actionPerformed(ActionEvent e)
        {
            if(r1.isSelected())
            {
                JOptionPane.showMessageDialog("male");
            }
            else
            {
                JOptionPane.showMessageDialog("female");
            }
        }
    public static void main(String[] args)
     {
        Radio rd=new Radio();
    }
    
}
