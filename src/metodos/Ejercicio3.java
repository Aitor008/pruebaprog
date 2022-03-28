package metodos;

import java.util.Arrays;

public class Ejercicio3 {
    /*a*/
    public static int suma(int numero){
        int resultado = 0;
        while(numero>0){
            resultado += numero % 10;
            numero = numero / 10;
        }
        return resultado;
    }
    
    /*b*/
    public static int consonantes(String frase){
        int consonantes = 0;
        frase = frase.toLowerCase().replace(" ","")
                                   .replace(",","")
                                   .replace(".","")
                                   .replace(";","")
                                   .replace("?","")
                                   .replace("¡","")
                                   .replace("¿","")
                                   .replace("!","")
                                   .replace("a","")
                                   .replace("e","")
                                   .replace("i","")
                                   .replace("o","")
                                   .replace("u","")
                                   .replace("á","a")
                                   .replace("é","e")
                                   .replace("ó","o")
                                   .replace("ú","u")
                                   .replace("í","i");
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            consonantes++;
        }
        return consonantes;
    }
    
    /*c*/
    //Primero hago esto para conseguir un metodo rápido con el que poder ordenar los String
    public static String ordenar(String primero){
        char[] caracter = primero.toCharArray();
        Arrays.sort(caracter);
        return new String(caracter);
    }
    public static boolean anagrama(String primero, String segundo){
        boolean verdad = false;
        primero = primero.toLowerCase().replace(" ","").replace(".","").replace(",","").replace("á","a")
                  .replace("é","e").replace("ó","o").replace("ú","u").replace("í","i");
        segundo = segundo.toLowerCase().replace(" ","").replace(".","").replace(",","").replace("á","a")
                  .replace("é","e").replace("ó","o").replace("ú","u").replace("í","i");
        
        //Aquí utilizo el metodo que habia creado antes para ser más rápido y no repetir tanto codigo
        primero = ordenar(primero);
        segundo = ordenar(segundo);
        
        return primero.equals(segundo);
    }
}
