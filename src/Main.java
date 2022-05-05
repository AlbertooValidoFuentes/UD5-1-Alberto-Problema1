import com.alberto.datastructures.CustomQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cicloBucle = true;
        Float sumaNumeros = 0.0f;
        CustomQueue colaNumeros = new CustomQueue();
        Scanner scan = new Scanner(System.in);

        while (cicloBucle) {
            System.out.println("Selecciona una opción");
            System.out.println("1. Introducir un número");
            System.out.println("Q. Salir");
            String seleccionUsuario = scan.nextLine();

            if (seleccionUsuario.equals("1")) {
                System.out.println("Introduce un numero: ");
                Float numeroUsuario = scan.nextFloat();
                scan.nextLine();
                colaNumeros.enqueue(numeroUsuario);
            } else if (seleccionUsuario.equals("q") || seleccionUsuario.equals("Q")) {
                cicloBucle = false;

                for (int i = 0; i < colaNumeros.length; i++) {
                    sumaNumeros += colaNumeros.dequeue();
                }
                System.out.println("El valor de la suma es " +  sumaNumeros);
            } else {
                System.out.println("La opción introducida no es correcta");
            }
        }
    }
}