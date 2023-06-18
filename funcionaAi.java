import javax.swing.JFrame;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.ActionListener;
import java.swing.JOptionPane;
import javax.swing.JButton;
public class funcionaAi extends JFrame implements ActionListener {
    
    public funcionaAi(){
        super("EVENTOS ");
        JButton botao= new JButton("ok");
        botao.addActionListener(this);
        getContentPane().add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);


   
    }
    public static void main(String[]args){
        new funcionaAi()
    }
    @Override
    public void actionPerformed(ActionEvent e ){
        JOptionPane.showMessageDialog(null,
            "ola,isso é uma caixa de mensagem",
            "caixa de mensagem",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        )
        ;
    }
}
