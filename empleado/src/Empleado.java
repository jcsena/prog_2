/**
 * Created by Julio on 12/2/16.
 */
public class Empleado extends Academica {
    String nombre;
    String apellido;
    String cedula;
    String telefono;
    String naciolidad;


   public void setDatos(String n, String a, String c, String t, String na){

       if(!n.isEmpty()) this.nombre = n;
       if(!a.isEmpty()) this.apellido = a;
       if(!c.isEmpty()) this.cedula = c;
       if(!t.isEmpty()) this.telefono = t;
       if(!na.isEmpty()) this.naciolidad = na;
       
   }

    public void imprimirDatos(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Cedula: "+ this.getCedula());
        System.out.println("Telefono:" + this.getTelefono());
        System.out.println("Nacionlidad:" + this.getNaciolidad());
    }

    public boolean validar(){
        return false;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNaciolidad() {
        return naciolidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
