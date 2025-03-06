package parkingnow;

public class Ejecutar {
    public static void main(String[] args) {
        
        Motos objMotos1 = new Motos(125, "EUC76F");
        Motos objMotos2 = new Motos(350, "HRP76F");

        //Mostrar el objeto
        System.out.println(objMotos1.toString());
        System.out.println(objMotos2.toString());
    } 
}
