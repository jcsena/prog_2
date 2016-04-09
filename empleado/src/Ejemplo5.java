/**
 * Created by Julio on 8/4/16.
 */

import java.awt.*;

public class Ejemplo5 {
    private Frame f;
    private  Button b1;
    private  Button b2;

    public  Ejemplo5(){
        f = new Frame("hasdfa");
        b1 = new Button("hello");
        b2 = new Button("face");
    }

    public void lounchFrame(){
        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]){
        Ejemplo5 guiWindow = new Ejemplo5();
        guiWindow.lounchFrame();
    }
}
