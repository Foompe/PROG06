package com.prog06_Ejerc1;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inicio atributos
        boolean salir = true;

        //inicializamos el scanner
        Scanner sc = new Scanner (System.in);
        while (salir) {
            //Seleccion
            System.out.println("Escoge una opción:\n" +
                    " 1. Nuevo vehivulo\n" +
                    " 2. Ver Matricula\n" +
                    " 3. Ver número de Kilometros\n" +
                    " 4. Actualizar Kilometros\n" +
                    " 5. Ver años antigúedad\n" +
                    " 6. Mosotrar propietario\n" +
                    " 7. Mostrar descripción\n" +
                    " 8. Mostrar precio\n" +
                    " 9. Salir");

            //lanzamos escaner

            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("\nHas seleccionado nuevo vehiculo");
                    break;
                case 2:
                    System.out.println("\nHas seleccionado ver matricula");
                    break;
                case 3:
                    System.out.println("\nHas seleccionado ver numero kilometros");
                    break;
                case 4:
                    System.out.println("\nHas seleccionado actualizar Kilometros");
                    break;
                case 5:
                    System.out.println("\nHas seleccionado ver años antigúedad");
                    break;
                case 6:
                    System.out.println("\nHas seleccionado mostrar propietario");
                    break;
                case 7:
                    System.out.println("\nHas seleccionado mostrar descripción");
                    break;
                case 8:
                    System.out.println("\nHas seleccionado mostrar precio");
                    break;
                case 9:
                    System.out.println("\nHas seleccionado salir");
                    salir = false;
                    break;
                default:
                    System.out.println("\nEleccción erronea, selecciona de nuevo!\n");
            }

        }
    }
}