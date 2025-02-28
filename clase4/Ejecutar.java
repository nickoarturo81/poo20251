package clase4;

public class Ejecutar {

    public static void main(String[] args) {

        //Creación de los objetos de la clase Vehiculo
        //Forma 1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanco", 4500.0, "TS34568WE", 2.3, "150HP");

        //Forma 2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0, "SWE567UY", 1.8, "450HP");

        //Mostrar la marca del objeto Vehiculo1
        System.out.println(objVehiculo1.getMarca());

        //Se va a modificar la marca del vehiculo de objeo objVhiculo1
        objVehiculo1.setMarca("Chevrolet");

        //Mostrar todo objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo1.getMarca());
        objVehiculo1.acelerar();
        System.out.println(objVehiculo2.getMarca());
        objVehiculo2.frenar();
    }
}
