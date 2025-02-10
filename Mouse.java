import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mouse extends JFrame implements MouseMotionListener
{
    JLabel lb;
    Mouse()
    {
        lb=new JLabel("show");
        addMouseMotionListener(this);
        setLayout(new FlowLayout());
        add(lb);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public void mouseDragged(MouseEvent e)
        {
            int x=e.getX();
            int y=e.getY();      
            lb.setText(" dragged X is"+x+"y is" +y);
        }
    public void mouseMoved(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();      
        lb.setText(" moved X is"+x +" y is " +y);
    }      
    public static void main(String[] args) 
    {
        Mouse m=new Mouse();
    }
}
