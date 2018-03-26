package learn;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.ToolTipManager;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tooltip extends  JFrame {

    private  Toolkit toolkit;
    public  Tooltip(){

        setTitle("Tool tip");
        setSize(300,200);

        toolkit = getToolkit();

        Dimension size  = toolkit.getScreenSize();


        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);


        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        getContentPane().add(panel);

        panel.setLayout(null);

        panel.setToolTipText("A panel container");

        JButton  but = new JButton("But");

        but.setBounds(100,60,80,30);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        but.setToolTipText("Exit button");

        panel.add(but);


    }

    public static void main(String[] args) {

        Tooltip tip = new Tooltip();

        tip.setVisible(true);
	// write your code here
    }
}
