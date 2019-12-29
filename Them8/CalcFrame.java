package Them8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame implements ActionListener {
    public CalcFrame(){
        setTitle("Calculate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 240, 370 );
        add(new CalcPanel());
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        JMenuItem itm = new JMenuItem("calc pro");
        menu.add(itm);
        itm.addActionListener(this);

        itm = new JMenuItem("Open");
        itm.addActionListener(this);
        menu.add(itm);

        itm = new JMenuItem("Close");
        itm.addActionListener(this);
        menu.add(itm);

        menu.add(new JSeparator());
        JMenu submenu = new JMenu("Sub");
        itm = new JMenuItem("Print");
        itm.addActionListener(this);

        menu.add(submenu);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        submenu.add(itm);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
    }
}
