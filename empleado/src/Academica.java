/**
 * Created by Julio on 12/2/16.
 */
public class Academica {

    //atributos
    String escuela;
    String nivelAcdemico;
    int aniogrado;
    String titulo;


    //metodos
    public void setDatos(String e, String n, int a, String t) {
        if(!e.isEmpty()) this.escuela = e;
        if(!n.isEmpty()) this.nivelAcdemico = n;
        if(!t.isEmpty()) this.titulo = t;
        if(a >= 18 && a <= 70) this.aniogrado = a;
    }

    public boolean validar(){
        return false;
    }

    public int getAniogrado() {
        return aniogrado;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getNivelAcdemico() {
        return nivelAcdemico;
    }

    public String getTitulo() {
        return titulo;
    }
}
