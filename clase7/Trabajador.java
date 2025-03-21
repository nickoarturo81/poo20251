package clase7;

public class Trabajador {
    
    //Atributos
    private int idTrabajador;
    private String nombre;
    private String apellido;

    //Constructor(Método)
    public Trabajador(int idTrabajador, String nombre, String apellido){
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter(Método) --> Solo para atributos
    public int getidTrabajador(){
        return idTrabajador;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }

    public double pagar(){
        return 0.0;
    }

    public String toString(){
        return "Trabajador { idTrabajador: " + idTrabajador + " Nombre: " + nombre + " Apellido: " + apellido + "}";
    }

}
