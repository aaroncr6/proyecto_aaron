
package proyecto_futuro;

public class Proyecto_futuro {

    public static void main(String[] args) { 
        String nombre=args[0];
        String modulos=args[1];
        String horasSemana=args[2];

        
        System.out.println("Estudiante " + nombre + " : ");
        System.out.println(veredicto(modulos,horasSemana));
    }
    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
}
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
}
            return "Ideal. Trabajas los contenidos en casa.";
        
    }
    
}
