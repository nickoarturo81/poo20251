package Desarrollo_Taller2;

public class Foto {
    
    //Atributos
    private String fichero;

    //Constructor
    public Foto(String fichero){
        this.fichero = fichero;
    }
    
    //Metodos
    public void print(){
    }
    public String getFichero(){
        return fichero;
    }

    public String toString(){
        return "FICHERO: " + fichero;
    }
}
