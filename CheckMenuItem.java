package learn;
import javafx.scene.shape.Circle;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import  javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;


public class CheckMenuItem extends  JFrame {

    private  JLabel statusbar;

    public  CheckMenuItem (){

        setTitle("CheckBoxMenuItem");

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenu view = new JMenu("View");
        view.setMnemonic(KeyEvent.VK_V);

        JCheckBoxMenuItem  sbar = new JCheckBoxMenuItem("Show Statusbar");
        sbar.setState(true);

        sbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (statusbar.isVisible()){
                    statusbar.setVisible(false);
                }else {
                    statusbar.setVisible(true);
                }
            }
        });

        view.add(sbar);

        menubar.add(file);
        menubar.add(view);

        setJMenuBar(menubar);

        statusbar =new JLabel("Statusbar");

        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        add(statusbar, BorderLayout.SOUTH);

        setSize(360,250);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckMenuItem();
    }
}
