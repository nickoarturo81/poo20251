package clase7;

public class Operario extends Trabajador{

    private double  horas;
    public final double SALARIO_BASE = 100; //Constante(SALARIO_BASE): Solo las constantes van en mayuscula

    //Constructor que hereda atributos tomados de la superclase o padre idTrabajador, nombre, apellido
    public Operario(int idTrabajador, String nombre, String apellido, double horas){
        super(idTrabajador, nombre, apellido);
        this.horas = horas;
    }

    public double pagar(){
        return SALARIO_BASE * horas;
    }

    public String toString(){
        return "Operario { idTrabajador: " + super.getidTrabajador() + 
                " Nombre: " + super.getNombre() + 
                " Apellido: " + super.getApellido() + 
                " Horas Laboradas: " + horas + "}"; //--> No lleva super. porque horas es propio de esta clase Operario
    }

}
