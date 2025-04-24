package Desarrollo_Taller2;

public class Producto {

    // Atributos
    private int numero;
    private long precio; // <-- nuevo atributo para almacenar el precio

    // Constructor que solo recibe número (por compatibilidad si lo necesitas)
    public Producto(int numero) {
        this.numero = numero;
    }

    // Constructor actualizado que también recibe el precio
    public Producto(int numero, long precio) {
        this.numero = numero;
        this.precio = precio;
    }

    // Métodos
    public int getNumero() {
        return numero;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PRODUCTO ID: " + numero + " PRECIO: $" + precio;
    }
}
