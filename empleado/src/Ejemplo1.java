
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo1 extends JFrame {
    JButton boton;

    public Ejemplo1() {
        boton = new JButton("Pulsa!");
        add(boton);
        boton.addActionListener(new OyenteBoton());
        setSize(100, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Ejemplo1 ventana = new Ejemplo1();
    }
}

class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null,
                "Has presionado el botton",
                "Mensaje de entrada ",
                JOptionPane.INFORMATION_MESSAGE);
    }
}