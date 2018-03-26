package learn;
import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.awt.event.KeyEvent;
import javax.swing.*;


public class Menu extends JFrame {

    public  Menu(){

        setTitle("Swing-menu");

        JMenuBar menubar = new JMenuBar();

        ImageIcon  icon= new  ImageIcon("/home/john/Desktop/exit.png");

        JMenu file = new JMenu("File");

        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem fileClose = new JMenuItem("close",icon);

        fileClose.setMnemonic(KeyEvent.VK_C);

        fileClose.setToolTipText("Exit application");

        fileClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(fileClose);

        menubar.add(file);

        setJMenuBar(menubar);

        setSize(250,200);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {
        new  Menu();
	// write your code here
    }
}
