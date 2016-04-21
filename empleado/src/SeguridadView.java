/**
 * Created by Julio on 11/3/16.
 */

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class SeguridadView extends Applet{


    SeguridadView vm = this;


    JPanel pp ,p, p2,p3,p4,p5,p6,p7,p8 ,pf,pc;
    JLabel l,l2, title;
    JTextField t,t2;
    JCheckBox pri, sec, tec;
    Choice c;
    JButton bsave, bdel,bedit,badd;
    java.net.URL urlsav,urldel, urledit, urladd;
    ImageIcon iconsav,icondel, iconedit, iconadd;
    int fp = 50;


    private int gp(int n){
        return n * fp;
    }

    public void init(){

        vm.setSize(430, 250);
        //inconos de imagenes de botones
        urlsav = getClass().getResource("images/guardar.png");
        urldel = getClass().getResource("images/shut_down.png");
        urledit = getClass().getResource("images/clean.png");
        urladd = getClass().getResource("images/download.jpeg");

        //creacion de iconos apartir de las url de las imagenes
        iconsav =  new ImageIcon(((new ImageIcon(urlsav)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        icondel =  new ImageIcon(((new ImageIcon(urldel)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconedit = new ImageIcon(((new ImageIcon(urledit)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconadd =  new ImageIcon(((new ImageIcon(urladd)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));


        vm.setLayout(null);


        //creacion de paneles
        pp = new JPanel();  pp.setLayout(null);   pp.setBounds(0, gp(0), 430, 50);
        p = new JPanel();  p.setLayout(null);  p.setBounds(0, gp(1), 430, 50);
        p2 = new JPanel(); p2.setLayout(null);   p2.setBounds(0, gp(2), 430, 50);
        p7 = new JPanel(); p7.setLayout(null);  p7.setBounds(0, gp(3), 430, 210);
        p3 = new JPanel(); p3.setLayout(null);   p3.setBounds(0, gp(4), 430, 50);
        p4 = new JPanel(); p4.setLayout(null);  p4.setBounds(0, gp(5), 430, 50);
        p5 = new JPanel(); p5.setLayout(null); p5.setBounds(0, gp(6), 430, 50);
        p6 = new JPanel(); p6.setLayout(null);  p6.setBounds(0, gp(7), 430, 210);
        p8 = new JPanel(); p8.setLayout(null);  p8.setBounds(0, gp(3)-20, 430, 50);
        pf = new JPanel(); pf.setLayout(null); pf.setBounds(0,gp(9), 430, 70);

        pc = new JPanel(); pc.setLayout(null);  pc.setBounds(0,315, 430, 70);

        title = new JLabel("Por favor ingrese los siguientes datos");
        title.setBounds(10, 10, 400, 35);

        t = new JTextField("",10);  t.setBounds(110, 10, 190, 20) ;
        l = new JLabel("Nombre:"); l.setBounds(10, 10, 100, 20);


        t2 = new JTextField("",10);  t2.setBounds(110, 10, 190, 20);
        l2 = new JLabel("Apellido:"); l2.setBounds(10, 10, 100, 20);



        bsave = new JButton("Guardar",iconsav); bsave.setBounds(40, 5,100, 50);
        bdel = new JButton("Terminar",icondel); bdel.setBounds(160, 5,100, 50);
        bedit =  new JButton("Limpiar",iconedit); bedit.setBounds(280, 5,100, 50);
        badd = new JButton("Agregar",iconadd); badd.setBounds(310, 5,100, 50);




        //customizar en icono de guardar
        bsave.setBorderPainted(true);  bsave.setContentAreaFilled(true);
        bsave.setFocusPainted(true); bsave.setOpaque(true);


        //customizar el icono de borrar
        bdel.setBorderPainted(true);bdel.setContentAreaFilled(true);
        bdel.setFocusPainted(true); bdel.setOpaque(true);

        //customizar el icono de editar
        bedit.setBorderPainted(true);bedit.setContentAreaFilled(true);
        bedit.setFocusPainted(true); bedit.setOpaque(true);

        //customizar el icono de agregar
        badd.setBackground(Color.BLUE);badd.setBorderPainted(true);badd.setContentAreaFilled(true);
        badd.setFocusPainted(true);badd.setOpaque(true);


        //creacion de choice selected
        c  = new Choice();
        c.setBounds(110, 0, 190, 50);

        c.add("");
        c.add("Calculo II");
        c.add("Progrmación II");



        //title
        pp.add(title);
        //parrafo nombre
        p.add(t);p.add(l);

        //parrafo apellido
        p2.add(t2);p2.add(l2);
//        p7.add(ced);p7.add(lced);



        p7.add(bsave);
        p7.add(bdel);
        p7.add(bedit);


        //se agregan al aplet todos los parrafos
        vm.add(pp);vm.add(p); vm.add(p2);vm.add(p3);vm.add(p4);vm.add(p5);
        vm.add(p7);
        vm.add(p8);
        vm.add(p6);



    }

}
