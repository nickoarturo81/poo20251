package parkingnow;

public class Motos {
    
    //Atributos
    private double cilindraje;
    private String placa;
    
    //Constructor
    public Motos(double cilindraje, String placa) {
        this.cilindraje = cilindraje;
        this.placa = placa;
    }
    
    //Getter
    public double getcilindraje() {
        return cilindraje;
    }

    public String getplaca() {
        return placa;
    }

    //Setter
    public void setcilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Pemite mostrar el objeto
    public String toString() {
        return "MOTO { Cilindraje: " + cilindraje + " Placa: " + placa + "}";
    }

}
