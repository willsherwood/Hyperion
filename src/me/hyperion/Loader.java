package me.hyperion;

import me.hyperion.entity.Human;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chris on 11/29/2014.
 */
public class Loader extends JFrame {
    private final String WINDOW_TITLE = "Loader";
    private final int WINDOW_WIDTH = 420;
    private final int WINDOW_HEIGHT = 240;
    private JPanel jPanel;
    private JLabel jLabel1;
    private JButton jButton1, jButton2, jButton3;
    private Human entity = new Human();

    public Loader() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(WINDOW_TITLE);
        buildPanel();
        setVisible(true);
    }

    //start point
    public static void main(String[] args) {
        new Loader();
    }

    private void buildPanel() {
        //creates a jPanel and sets it to the form
        jPanel = new JPanel();
        add(jPanel);
        // build the rest of the items from the panel
        jLabel1 = new JLabel("Create a new Player!");
        jButton1 = new JButton("Make Human Player");
        jButton1.addActionListener(new btn1Click());
        jButton2 = new JButton("reset");
        jButton2.addActionListener(new btn2Click());
        jButton2 = new JButton("reset");
        jButton2.addActionListener(new btn2Click());
        jButton3 = new JButton("Take Damage");
        jButton3.addActionListener(new btn3Click());
        jPanel.add(jLabel1);
        jPanel.add(jButton1);
        jPanel.add(jButton3);
        jPanel.add(jButton2);
    }

    private class btn3Click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            entity.entityTakeDamage(5.0);
        }
    }

    private class btn2Click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jLabel1.setText("Your health is! ");
        }
    }

    private class btn1Click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jLabel1.setText(String.valueOf(entity.getHealth()));
        }
    }


}
