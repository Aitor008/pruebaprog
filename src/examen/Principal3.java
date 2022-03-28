package examen;
import java.util.Arrays;
//import metodos.Ejercicio3;
import metodos.Ejercicio3;

public class Principal3 {
    public static void main(String[] args) {
        //APARTADO a
        System.out.println("Suma="+Ejercicio3.suma(8798));
        //APARTADO b
        String frase="Hola buenas dias, Maria Josefa¡¡";
        System.out.println(Ejercicio3.consonantes(frase)+" Consonantes");
        
        //APARTADO c
        String primero="Sergio";
        String segundo="regios";
        System.out.println("Anagrama="+Ejercicio3.anagrama(primero,segundo));
        
    }
}
