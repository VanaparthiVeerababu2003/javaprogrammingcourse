import java.awt.*;
import java.awt.event.*;
class MyEvent extends Frame implements ActionListener
{
    Button bt;
    Label lb;
    MyEvent()
    {
        bt=new Button("click");
        lb=new Label("show");
        bt.addActionListener(this);
        setLayout(new FlowLayout());
        add(lb);
        add(bt);
        setVisible(true);
        setSize(400,400);
    }
        public void actionPerformed(ActionEvent e)
        {
            lb.setText("Hello");
        }
    public static void main(String[] args) {
        MyEvent m=new MyEvent();
    }
}
