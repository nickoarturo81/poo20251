package parkingnow;

public class Motos {
    
    //Atributos
    private double cilindraje;
    
    //Constructor
    public Motos(double cilindraje) {
        this.cilindraje = cilindraje;
    
    }
    //Getter
    public double getcilindraje() {
        return cilindraje;
    }

    //Setter
    public void setcilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Pemite mostrar el objeto
    public String toString() {
        return "MOTO { Cilindraje: " + cilindraje + "}";
    }

}
