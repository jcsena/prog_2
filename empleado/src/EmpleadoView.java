/**
 * Created by Julio on 11/3/16.
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

public class EmpleadoView extends Applet{


//    ArrayList<Usuario> usuarios = new ArrayList<>();
    EmpleadoView vm = this;

    //se define los paneles de la applet
//    ArrayList list = new ArrayList();

    boolean isHab;
    JPanel pp ,p, p2,p3,p4,p5,p6,pf,pc;
    JLabel l,l2,l3,l4,l5, title;
    JTextField t,t2,t3,t4;
    JRadioButton f, m;
    JCheckBox pri, sec, tec;
    Choice c;
    JButton bsave, bdel,bedit,badd, bnext, bpast , bfirst, blast;
    java.net.URL urlsav,urldel, urledit, urladd;
    ImageIcon iconsav,icondel, iconedit, iconadd;
    int fp = 50;

    public void habilarCampos(boolean b){
        vm.t.setEditable(b);
        vm.t2.setEditable(b);
        vm.t3.setEditable(b);
        vm.t4.setEditable(b);
        vm.c.setEnabled(b);
        isHab = b;
    }

    private int gp(int n){
        return n * fp;
    }

    public void init(){

        vm.setSize(430, 550);
        //inconos de imagenes de botones
        urlsav = getClass().getResource("images/guardar.png");
        urldel = getClass().getResource("images/user-delete-icon.png");
        urledit = getClass().getResource("images/edit-28110.jpg");
        urladd = getClass().getResource("images/download.jpeg");

        //creacion de iconos apartir de las url de las imagenes
        iconsav =  new ImageIcon(((new ImageIcon(urlsav)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        icondel =  new ImageIcon(((new ImageIcon(urldel)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconedit = new ImageIcon(((new ImageIcon(urledit)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        iconadd =  new ImageIcon(((new ImageIcon(urladd)).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));




        vm.setLayout(null);


        //creacion de paneles
        pp = new JPanel();  pp.setLayout(null); pp.setBackground(Color.gray);  pp.setBounds(0, gp(0), 430, 50);
        p = new JPanel();  p.setLayout(null); p.setBackground(Color.gray);  p.setBounds(0, gp(1), 430, 50);
        p2 = new JPanel(); p2.setLayout(null);  p2.setBackground(Color.gray); p2.setBounds(0, gp(2), 430, 50);
        p3 = new JPanel(); p3.setLayout(null); p3.setBackground(Color.gray);  p3.setBounds(0, gp(3), 430, 50);
        p4 = new JPanel(); p4.setLayout(null); p4.setBackground(Color.gray); p4.setBounds(0, gp(4), 430, 50);
        p5 = new JPanel(); p5.setLayout(null); p5.setBackground(Color.gray); p5.setBounds(0, gp(5), 430, 50);
        p6 = new JPanel(); p6.setLayout(null); p6.setBackground(Color.gray); p6.setBounds(0, gp(6), 430, 210);
        pf = new JPanel(); pf.setLayout(null); pf.setBounds(0,gp(6), 430, 70);

        pc = new JPanel(); pc.setLayout(null);  pc.setBounds(0,315, 430, 70);

        title = new JLabel("Por favor ingrese los siguientes datos");
        title.setBounds(10, 10, 400, 35);

        t = new JTextField("",10);  t.setBounds(110, 10, 190, 20) ;
        l = new JLabel("Nombre:"); l.setBounds(10, 10, 100, 20);


        t2 = new JTextField("",10);  t2.setBounds(110, 10, 190, 20);
        l2 = new JLabel("Apellido:"); l2.setBounds(10, 10, 100, 20);

        t3= new JTextField("",10);  t3.setBounds(110, 10, 190, 20);
        l3 = new JLabel("Sexo:"); l3.setBounds(10, 10, 100, 20);

        t4= new JTextField("",10);  t4.setBounds(110, 10, 190, 20);
        l4 = new JLabel("Educación:"); l4.setBounds(10, 10, 100, 20);

        l5 = new JLabel("Asignaturas:",10);  l5.setBounds(10, 10, 80, 20);



        bsave = new JButton("Guardar",iconsav); bsave.setBounds(10, 5,100, 50);
        bdel = new JButton("Borrar",icondel); bdel.setBounds(110, 5,100, 50);
        bedit =  new JButton("Editar",iconedit); bedit.setBounds(210, 5,100, 50);
        badd = new JButton("Agregar",iconadd); badd.setBounds(310, 5,100, 50);

        bfirst = new JButton("<<"); bfirst.setBounds(120, 5,50, 30);
        bpast = new JButton("<"); bpast.setBounds(170, 5,50, 30);

        bnext = new JButton(">"); bnext.setBounds(220, 5,50, 30);
        blast = new JButton(">>"); blast.setBounds(270, 5,50, 30);


//        bsave.addActionListener(new UsuarioEventValidation(vm));
//        bdel.addActionListener(new UsuarioEventValidation(vm));
//        bedit.addActionListener(new UsuarioEventValidation(vm));
//        badd.addActionListener(new UsuarioEventValidation(vm));
//
//        botones de movimiento
//        bfirst.addActionListener(new UsuarioEventValidation(vm));
//        bpast.addActionListener(new UsuarioEventValidation(vm));
//        bnext.addActionListener(new UsuarioEventValidation(vm));
//        blast.addActionListener(new UsuarioEventValidation(vm));



        //customizar en icono de guardar
        bsave.setBackground(Color.BLUE); bsave.setBorderPainted(true);  bsave.setContentAreaFilled(true);
        bsave.setFocusPainted(true); bsave.setOpaque(true);


        //customizar el icono de borrar
        bdel.setBackground(Color.BLUE); bdel.setBorderPainted(true);bdel.setContentAreaFilled(true);
        bdel.setFocusPainted(true); bdel.setOpaque(true);

        //customizar el icono de editar
        bedit.setBackground(Color.BLUE);bedit.setBorderPainted(true);bedit.setContentAreaFilled(true);
        bedit.setFocusPainted(true); bedit.setOpaque(true);

        //customizar el icono de agregar
        badd.setBackground(Color.BLUE);badd.setBorderPainted(true);badd.setContentAreaFilled(true);
        badd.setFocusPainted(true);badd.setOpaque(true);


        bpast.setBackground(Color.BLUE);bpast.setBorderPainted(true);bpast.setContentAreaFilled(true);
        bpast.setFocusPainted(true);bpast.setOpaque(true);

        blast.setBackground(Color.BLUE);blast.setBorderPainted(true);blast.setContentAreaFilled(true);
        blast.setFocusPainted(true);blast.setOpaque(true);

        bnext.setBackground(Color.BLUE);bnext.setBorderPainted(true);bnext.setContentAreaFilled(true);
        bnext.setFocusPainted(true);bnext.setOpaque(true);

        bfirst.setBackground(Color.BLUE);bfirst.setBorderPainted(true);bfirst.setContentAreaFilled(true);
        bfirst.setFocusPainted(true);bfirst.setOpaque(true);


        //creacion de arrayList


        //creacion de choice selected
        c  = new Choice();
        c.setBounds(110, 0, 190, 50);

        c.add("");
        c.add("Calculo II");
        c.add("Progrmación II");


//        pc.add(bfirst);    pc.add(bpast);  pc.add(bnext);  pc.add(blast);
        //se agregan los botones al ultimo parrafo
//        pf.add(bsave);pf.add(bdel);pf.add(bedit);pf.add(badd);pf.setBackground(Color.BLUE);


        //title
        pp.add(title);
        //parrafo nombre
        p.add(t);p.add(l);

        //parrafo apellido
        p2.add(t2);p2.add(l2);



        //parrafo  sexo
        p3.add(l3);
        m = new JRadioButton("Femeninio");
        f = new JRadioButton("Masculino");

        ButtonGroup group = new ButtonGroup();
        group.add(m);
        group.add(f);


        m.setBounds(110,0,190,40);
        f.setBounds(210,0,190,40);

        //parrafo apellido
        p3.add(m);
        p3.add(f);



        //parrafo
        p4.add(l4);
                pri = new JCheckBox("Primaria");
                sec = new JCheckBox("Secundaria");
                tec = new JCheckBox("Tecnico");

        pri.setBounds(110,0,190,40);
        sec.setBounds(210,0,190,40);
        tec.setBounds(310,0,190,40);

        ButtonGroup groupcheck = new ButtonGroup();
        group.add(pri);
        group.add(sec);
        group.add(tec);

        p4.add(pri);
        p4.add(sec);
        p4.add(tec);

        //parrafo tipo de usuario
        p5.add(l5);p5.add(c);

        TextArea textarea =  new TextArea("Bienvenidos\n\nAl Sitema de Primer Ingreso\n\nPor favor Llene los campos", 7, 50);
        textarea.setBounds(50,20,320,150);

        p6.add(textarea);


        //se agregan al aplet todos los parrafos
        vm.add(pp);vm.add(p); vm.add(p2);vm.add(p3);vm.add(p4);vm.add(p5);

        vm.add(p6);



        vm.habilarCampos(true);


    }

}
