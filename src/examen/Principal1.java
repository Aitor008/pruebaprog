package examen;

import java.util.Scanner;


public class Principal1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        
        String nombre, medicacion;
        int cant_dosis;
        int pos_med, pos_pac;
        
        String[] pacientes={"Daniel","Antonio","Arturo"};
        String[] medicamentos={"Ibuprofeno","Paracetamol","Omeoprazol","Diazepan"};
        double[] precio_medicamentos={3.4,2.1,2.3,5};
        
        int[][] dosis=new int[pacientes.length][medicamentos.length];
        boolean[][] recetas=new boolean[pacientes.length][medicamentos.length];
        
        //Ponemos que por defecto int[][] dosis sea -1
        for (int i = 0; i < dosis.length; i++) {
            for (int j = 0; j < dosis[i].length; j++) {
                dosis[i][j] = -1;
            }
        }
        
        dosis[2][0]=3;
        recetas[2][0]=true;
        dosis[1][0]=4;
        recetas[1][0]=true;
        dosis[2][1]=5;
        recetas[2][1]=true;
        dosis[2][3]=2;
        recetas[2][3]=true;
        
        do{
            System.out.println("0.SALIR");
            System.out.println("1.MOSTRAR RESUMEN PACIENTES");
            System.out.println("2.RECETAR MEDICACION AL PACIENTE");
            System.out.println("3.VER COSTE MEDICACION PACIENTE");
            System.out.print("SELECCION:");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    //MOSTRAR TODA LA INFO DE LOS PACIENTES
                    for (int i = 0; i < pacientes.length; i++) {
                        System.out.println(pacientes[i]+":");
                        for (int j = 0; j < medicamentos.length; j++) {
                            System.out.print(medicamentos[j]+":");
                            if (recetas[i][j]) {
                                System.out.println(dosis[i][j]);
                            }else{
                                System.out.println("SIN MEDICACION");
                            }
                        }
                    }
                    break;
                case 2:
                    //USANDO TECLADO
                        //PEDIR NOMBRE PACIENTE
                        //PEDIR NOMBRE MEDICACION
                        //PEDIR DOSIS
                    System.out.print("Introduzca el nombre del paciente: ");
                    nombre = teclado.next();
                    System.out.print("Introduzca el nombre de la medicación: ");
                    medicacion = teclado.next();
                    System.out.print("Introduzca la cantidad de dosis: ");
                    cant_dosis = teclado.nextInt();
                    
                    //CODIGO PARA QUE EL MEDICAMENTO QUEDE RECETADO EN LAS MATRICES
                    int i;
                    //La posicion del medicamento y del paciente empiezan siendo -1
                    pos_med = -1;
                    pos_pac = -1;
                    
                    i = 0;
                    while (i < pacientes.length && pos_pac == -1){
                        if (pacientes[i].equalsIgnoreCase(nombre)) {
                            pos_pac = i;
                        }
                        i++;
                    }
                    
                    i = 0;
                    while (i < medicamentos.length && pos_med == -1){
                        if (medicamentos[i].equalsIgnoreCase(medicacion)) {
                            pos_med = i;
                        }
                        i++;
                    }
                    
                    if(pos_pac!=-1 && pos_med!=-1){
                        if(recetas[pos_pac][pos_med]){
                            System.out.println("Error: Paciente ya recetado en ese medicamentos");
                        }else{
                            recetas[pos_pac][pos_med]=true;
                            System.out.println("Paciente recetado correctamente");
                        } 
                     }else{
                        System.out.println("ERROR:Datos incorrectos en Paciente y/o Medicación");
                    }
                    
                    if (pos_pac != -1 && pos_med != -1) {
                        if (recetas[pos_pac][pos_med]) {
                            if (dosis[pos_pac][pos_med]==-1) {
                                dosis[pos_pac][pos_med] = cant_dosis;
                                System.out.println("MEDICINA RECETADA CON ÉXITO");
                            }else{
                                System.out.println("Error: El paciente ya estaba recetado");
                            }
                        }else{
                            System.out.println("Error: El paciente no tiene receta en ese medicamento");
                        }
                    }else{
                        System.out.println("Datos introducidos erróneamente");
                    }
                    break;
                case 3:
                    //USANDO TECLADO
                        //PEDIR NOMBRE PACIENTE
                    System.out.print("Introduzca el nombre del paciente: ");
                    nombre = teclado.next();
                    
                    //MOSTRAR POR PANTALLA COSTE TRATAMIENTO
                    int cont;
                    double suma = 0;
                    pos_pac=-1;
                    cont=0;
                    while(cont<pacientes.length && pos_pac==-1){
                        if(pacientes[cont].equalsIgnoreCase(nombre)){
                            pos_pac=cont;
                        }
                        cont++;
                    }
                    if(pos_pac==-1){
                        System.out.println("No existe el paciente");
                    }else{
                        for (int j = 0; j <= pacientes.length; j++) {
                            System.out.print(medicamentos[j]+":");
                            if(recetas[pos_pac][j]){
                                if(dosis[pos_pac][j]!=-1){
                                    suma = dosis[pos_pac][j]*precio_medicamentos[j];
                                    System.out.println(suma+" €");
                                }else{
                                    System.out.println("NO PAGA MEDICACION"); 
                                }
                            }else{
                                System.out.println("SIN RECETA");
                            }
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(opcion!=0);
        
    }
    
}