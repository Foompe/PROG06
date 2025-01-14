package com.prog06_Ejerc1;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inicio atributos
        boolean salir = true;
        int km;
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
            Vehiculo coche = new Vehiculo();
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("\nHas seleccionado nuevo vehiculo\n" +
                            "Introduce nombre de la marca: ");
                    String marca = sc.nextLine();
                    coche.setMarca(marca);

                    System.out.println("Introduce matricula:");
                    String matricula = sc.nextLine();
                    coche.setMatricula(matricula);

                    System.out.println("Introduce número de kilometros:");
                    km= sc.nextInt();
                    coche.setnKm(km);

                    System.out.println("Indica la fecha de matriculación:\n" +
                            "Día:");
                    int dia = sc.nextInt();
                    coche.setDia(dia);

                    System.out.println("Mes:");
                    int mes = sc.nextInt();
                    coche.setMes(mes);

                    System.out.println("Año:");
                    int ano = sc.nextInt();
                    coche.setAno(ano);

                    System.out.println("Introduce el precio:");
                    double precio = sc.nextDouble();
                    coche.setPrecio(precio);

                    System.out.println("Introduce el nombre del propietario:");
                    String nombrePropietario = sc.nextLine();
                    coche.setNombrePropietario(nombrePropietario);

                    System.out.println("Introduce DNI del propietario (solo los numeros):");
                    int dni = sc.nextInt();
                    coche.setDNI(dni);
                    System.out.println("La letra es: " + "Metodo para letra");

                    break;
                case 2:
                    System.out.println("\nHas seleccionado ver matricula\n" +
                            "La matricula es: " + coche.getMatricula());
                    break;
                case 3:
                    System.out.println("\nHas seleccionado ver numero kilometros\n" +
                            "Tiene " + coche.getnKm() + " Km.");
                    break;
                case 4:
                    System.out.println("Introduce los nuevos Km:" + "\nHas seleccionado actualizar Kilometros\n");
                    km = sc.nextInt();
                    coche.setnKm(km);
                    System.out.println("\nHas actualizado los km a: " + coche.getnKm() + " Km");
                    break;
                case 5:
                    System.out.println("\nHas seleccionado ver años antigúedad\n" +
                            "El coche " + coche.getMarca() + " tiene " + coche.get_Anios() + " años de antigúedad");
                    break;
                case 6:
                    System.out.println("\nHas seleccionado mostrar propietario\n" +
                            "El propietario se llama: " + coche.getNombrePropietario() + "\n" +
                            "DNI: " + coche.getDNI());
                    break;
                case 7:
                    System.out.println("\nHas seleccionado mostrar descripción\n" +
                            coche.Descripcion());
                    break;
                case 8:
                    System.out.println("\nHas seleccionado mostrar \n" +
                            "El precio es: " + coche.getPrecio());
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