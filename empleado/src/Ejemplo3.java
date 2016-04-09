import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo3 extends JFrame {
    JButton rojo = new JButton("Rojo");
    JButton azul = new JButton("Azul");
    Container p;

    public Ejemplo3() {
        super("Color de fondo");
        p = this.getContentPane();
        setLayout(new FlowLayout());
        add(rojo);
        add(azul);
        rojo.addActionListener(new OyenteRojo());
        azul.addActionListener(new OyenteAzul());
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Ejemplo3 ventana = new Ejemplo3();
    }

    class OyenteRojo implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            p.setBackground(Color.red);
        }
    }

    class OyenteAzul implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            p.setBackground(Color.blue);
        }
    }
}