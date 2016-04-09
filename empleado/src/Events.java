/**
 * Created by Julio on 1/4/16.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;;
import java.util.Iterator;

import javax.swing.*;



public class Events extends Applet implements ActionListener{


        Events vm = this;
        JPanel panel;
        JLabel title;

    public void actionPerformed(ActionEvent e) {

    }

    public void init() {
        super.init();

        panel = new JPanel();  panel.setLayout(null);   panel.setBounds(0, 0, 430, 50);
        title = new JLabel("Por favor ingrese los siguientes datos");
        title.setBounds(10, 10, 400, 35);


        vm.add(panel);
    }
}
