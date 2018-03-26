package learn;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;



public class Submenu extends JFrame {

    public  Submenu(){

        setTitle("Submenu");

        JMenuBar  menubar = new JMenuBar();

        ImageIcon iconNew  = new ImageIcon("/home/john/Desktop/new1.png");

        ImageIcon iconOpen = new ImageIcon("/home/john/Desktop/open1.png");

        ImageIcon iconImport = new ImageIcon("/home/john/Desktop/import1.png");

        ImageIcon iconExit = new ImageIcon("/home/john/Desktop/exit.png");

        JMenu file = new JMenu("File");

        file.setMnemonic(KeyEvent.VK_F);

        JMenu imp  =new JMenu("Import");

        imp.setMnemonic(KeyEvent.VK_M);


        JMenuItem newsf  =new JMenuItem("Import newsfeed");
        JMenuItem bookm = new JMenuItem("Import bookmarks");
        JMenuItem mail = new JMenuItem("Import mail");

        imp.add(newsf);
        imp.add(bookm);
        imp.add(mail);

        JMenuItem filenew = new JMenuItem("New",iconNew);

        filenew.setMnemonic(KeyEvent.VK_N);
        filenew.setToolTipText("Create anew file");
        filenew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        JMenuItem  fileOpen = new JMenuItem("Open",iconOpen);
        fileOpen.setToolTipText("Open recent project");
        fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        fileOpen.setMnemonic(KeyEvent.VK_O);

        JMenuItem fileClose = new JMenuItem("Exit",iconExit);

        fileClose.setMnemonic(KeyEvent.VK_X);
        fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        fileClose.setToolTipText("Exit application");

        fileClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(filenew);
        file.add(fileOpen);
        file.addSeparator();
        file.add(imp);
        file.add(fileClose);

        menubar.add(file);
        setJMenuBar(menubar);

        setSize(360,250);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);



    }

    public static void main(String[] args) {

        new Submenu();
	// write your code here
    }
}
