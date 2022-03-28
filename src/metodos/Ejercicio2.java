package metodos;

public class Ejercicio2 {
    /*a*/
    public static String dibujo(int tamaño, char char1, char char2,char char3){
        String resultado = "";
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                if (i == j) {
                    System.out.print(char2);
                }else if(i>j){
                    System.out.print(char3);
                }else{
                    System.out.print(char1);
                }
            }
            System.out.println();
        }
        return resultado;
    }
    
    /*b*/
    public static boolean ceros(int[] array){
        boolean resultado = false;
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0) {
                contador++;
            }
        }
        if (contador==array.length) {
            resultado = true;
        }
        return resultado;
    }
    
    /*c*/
    public static int[] mayores(int[] array, int[] array2){
        int res[] = new int [array.length];
        for (int i = 0; i < res.length; i++) {
            if (array[i]>array2[i]) {
                res[i]=array[i];
            }else{
                res[i]=array2[i];
            }
        }
        return res;
    }
}
