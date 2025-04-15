package Desarrollo_Taller2;
import java.util.Scanner;
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
        return "CEDULA: " + cedula + " NOMBRE: " + nombre + "\n";
    }

    //Solicitud de Cliente
    public static Cliente digCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su cédula");
        String cedula = sc.nextLine();
        System.out.println("Digite su nombre y apellido");
        String nombre = sc.nextLine();
        return new Cliente(cedula, nombre);
    }
    
}
