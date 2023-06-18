import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;

public class janela extends JFrame{
    public janela()





    {
        super("layouts");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        Container c2 =  new JPanel();
        c2.setLayout(new GridLayout(2,1));

            c2.add(new JButton("ok"));
            c2.add(new JButton("cancel"));
            c2.add(new JButton("setup"));
            c2.add(new JButton("gelp"));

            c.add(BorderLayout.CENTER,new JButton("centro"));
            c.add(BorderLayout.EAST, c2);
            

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300,300);
            setVisible(true);

    }
public static void main(String[]args){
    new janela();
} 

}