import javax.swing.*;
import java.awt.event.*;
public class KeyAd extends KeyAdapter
{
    JLabel l;
    JTextArea area;
    JFrame f;
    KeyAd()
    {
        l=new JLabel();
        area= new JTextArea();
        f=new JFrame("keyAdapter");
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        KeyAd k=new KeyAd();
    }
    
}
