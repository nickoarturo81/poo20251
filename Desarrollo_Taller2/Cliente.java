package Desarrollo_Taller2;

public class Cliente {
    //Atributos
    private String cedula;
    private String nombre;

    //Construtor
    public Cliente (String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    //Metodos
    public String getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "CEDULA: " + cedula + " NOMBRE: " + nombre;
    }
}
