package examen;
//import metodos.Ejercicio2;
import metodos.Ejercicio2;

import java.util.Arrays;

public class Principal2 {
    public static void main(String[] args) {
        //APARTADO a
        System.out.println(Ejercicio2.dibujo(5,'☺','X','☻'));
        //APARTADO b
        int[] datos={0,0,0,0};
        System.out.println(Ejercicio2.ceros(datos));
        
        //APARTADO c
        int[] primero={2,5,6};
        int[] segundo={-1,7,4};
        int[] resultado=Ejercicio2.mayores(primero,segundo);
        System.out.println(Arrays.toString(resultado));
        
        
    }
}
