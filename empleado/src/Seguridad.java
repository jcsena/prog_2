/**
 * Created by Julio on 12/2/16.
 */
public class Seguridad {

    String nombre;
    String pass;

    public void setDatos(String u, String p){
        this.nombre = u;
        this.pass = p;
    }

    public boolean Autenticar(){
        if(this.nombre == "Julio" && this.pass == "12345678"){
            return true;
        }
        return false;
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return nombre;
    }
}
