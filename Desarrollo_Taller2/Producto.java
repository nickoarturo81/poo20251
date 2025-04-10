package Desarrollo_Taller2;

public class Producto {

    // Atributos
    private int numero;
    private String referencia;

    // Constructor
    public Producto(int numero, String referencia) {
        this.numero = numero;
        this.referencia = referencia;
    }

    // Métodos
    public int getNumero() {
        return numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public String toString() {
        return ("{PRODUCTO: [NUMERO: ]" + numero + "[ REFERENCIA: ] " + referencia + "}");
    }
}
