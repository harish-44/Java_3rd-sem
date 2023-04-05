import java.awt.event.*;
import javax.swing.*;

public class Prog12b extends JApplet implements ActionListener
{
    JLabel j1,j2,j3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable()
            {
                public void run()
                {
                    makeGUI();
                }
            });
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    private void makeGUI()
    {
        j1 = new JLabel("enter a");
        add(j1);
        t1=new JTextField(10);
        add(t1);
        j2=new JLabel("enter b");
        add(j2);
        t2=new JTextField(10);
        add(t2);
        j3=new JLabel("result");
        add(j3);
        t3=new JTextField(10);
        t3.setEditable(false);
        add(t3);
        b1=new JButton("+");
        b1.setActionCommand("+");
        b1.addActionListener(this);
        b2=new JButton("-");
        b2.setActionCommand("-");
        b2.addActionListener(this);
        b3=new JButton("*");
        b3.setActionCommand("*");
        b3.addActionListener(this);
        b4=new JButton("/");
        b4.setActionCommand("/");
        b4.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String choice = ae.getActionCommand();
        double a=Double.parseDouble(t1.getText());
        double b=Double.parseDouble(t2.getText());
        double res=0;
        switch(choice)
        {
            case "+":
            {
                res=a+b;
                break;
            }
            case "-":
            {
                res=a-b;
                break;
            }
            case "*":
            {
                res=a*b;
                break;
            }
            case "/":
            {
                res=a/b;
                break;
            }
        }
        t3.setText(res+" ");
    }
}