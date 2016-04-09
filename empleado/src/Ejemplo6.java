/**
 * Created by Julio on 8/4/16.
 */

import java.awt.*;

public class Ejemplo6 {
    private Frame f;
    private Button bn, bs, bw, be, bc;

    public Ejemplo6(){
        f = new Frame("Borber Layaut");
        bn = new Button("B1");
        bs = new Button("B2");
        bw = new Button("B3");
        be = new Button("B4");
        bc = new Button("B5");

    }
    // proyecto final
    //centro panel de entorno grafico , norte un nombre cualquira, sur tres botones

    public void launchFrame(){
        f.add(bn,  BorderLayout.NORTH);
        f.add(bs,  BorderLayout.SOUTH);
        f.add(bw,  BorderLayout.WEST);
        f.add(be,  BorderLayout.EAST);
        f.add(bc,  BorderLayout.CENTER);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main (String args[]){
        Ejemplo6 guiWindow2 = new Ejemplo6();
        guiWindow2.launchFrame();
    }
}

