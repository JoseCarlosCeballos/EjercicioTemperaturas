
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario DAM 2
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        boolean continuar = true;
        String duda;
        ArrayList<Double> arraytemp = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Introducir temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Ordenar temperaturas");
            System.out.println("4. Mostrar extremos");
            System.out.println("5. Mostrar medias");
            System.out.println("6. Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    do{
                    System.out.println("Introduzca la temperatura:");
                    arraytemp.add(sc.nextDouble());
                    System.out.println("¿Quieres seguir intoduciendo temperaturas?: (s/n)");
                    duda = sc.next();
                    duda = duda.toUpperCase();
                    }while(duda.equals("S"));
                    break;
                case 2:
                    if(arraytemp.size() == 0){
                        System.out.println("No hay temperaturas disponibles");
                    }else{
                        for (Double valores : arraytemp) {
                            System.out.println("- "+valores);
                        }
                    }
                    break;
                case 3:
                    Collections.sort(arraytemp);
                    for (Double i : arraytemp) {
                    System.out.println("- "+i);
                    }
                    break;
                case 4:
                    Collections.sort(arraytemp);
                    double min = arraytemp.get(0) - 1;
                    System.out.println("Minima temperatura: "+min);
                    double max = arraytemp.get(arraytemp.size());
                    break;
                case 5:
                    break;
                case 6:
                    continuar = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escriba una opcion válida");
                    break;
            }

        }while(continuar = true);
    }

}
