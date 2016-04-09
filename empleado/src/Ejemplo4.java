import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo4 extends JFrame {

    JButton amarillo ,rojo, azul;
    java.net.URL am,ro, bl;
    ImageIcon iconam,iconro, iconbl;

    Container p;

    public Ejemplo4() {


        super("Color de fondo");

        am = getClass().getResource("images/yellow.png");
        ro = getClass().getResource("images/red.png");
        bl = getClass().getResource("images/blue.png");


        iconam =  new ImageIcon(((new ImageIcon(am)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconro =  new ImageIcon(((new ImageIcon(ro)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconbl = new ImageIcon(((new ImageIcon(bl)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));


        amarillo = new JButton("Amarillo", iconam);
        rojo = new JButton("Rojo", iconro);
        azul = new JButton("Azul", iconbl);


        p = this.getContentPane();
        setLayout(new FlowLayout());
        add(amarillo);
        add(rojo);
        add(azul);
        amarillo.addActionListener(new OyenteAmarrillo());
        rojo.addActionListener(new OyenteRojo());
        azul.addActionListener(new OyenteAzul());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Ejemplo4 ventana = new Ejemplo4();
    }


    class OyenteAmarrillo implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            p.setBackground(Color.yellow);
        }
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