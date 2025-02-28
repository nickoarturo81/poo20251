package clase4;

public class Vehiculo {

    // Atributos de la clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chasis;
    private double peso;
    private String potencia;

    //*****NO SE PONE EN LA CLASE
    /*
     * Constucor de la clase -> permite inicializar el objeto.
     * El constructor de la clae se reconoce porque iene el mismo
     * nombre de la clase
     */

    public Vehiculo(String marca, String color, double cilindraje, String chasis, double peso, String potencia) {
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chasis = chasis;
        this.peso = peso;
        this.potencia = potencia;
    }

    // Métodos getter (retorna) / setter (no retorna)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Pemite mosrar el objeto
    public String toString() {
        return "VEHICULO { Marca: " + marca + " Color: " + color + " Cilindraje: " + cilindraje + " Chasis: " + chasis
                + " Peso: " + " Potencia: " + potencia + "}";
    }
    //NO SE PONE EN LA CLASE

    //Métodos de la clase

    public void acelerar(){
        System.out.println("Vehiculo acelerando... ");
    }
    public void frenar(){
        System.out.println("Vehiculo frenando... ");
    }
    public void girarIzquierda(){
        System.out.println("Vehiculo gira a la izquierda: ");
    }
    public void girarDerecha(){
        System.out.println("Vehiculo gira a la derecha: ");
    }
    public void retroceder(){
        System.out.println("Vehiculo retrocede: ");
    }
}
