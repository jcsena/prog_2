import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo2 extends JFrame implements ActionListener {
    JButton botonCopiar;
    JTextField campoValor;
    JLabel resultado;

    public Ejemplo2() {
        setLayout(new FlowLayout());
        add(new JLabel("Valor "));
        campoValor = new JTextField(5);
        add(campoValor);
        botonCopiar = new JButton("Copiar");
        add(botonCopiar);
        botonCopiar.addActionListener(this);
//        add(new JLabel(" Copia "));
        resultado = new JLabel();
        add(resultado);

        setSize(400, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String valor = campoValor.getText();
        resultado.setText(valor);
    }

    public static void main(String args[]) {
        Ejemplo2 ventana = new Ejemplo2();
    }
}