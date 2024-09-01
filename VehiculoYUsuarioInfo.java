 import java.util.Scanner;

public class VehiculoYUsuarioInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y leer la marca del vehículo
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = sc.nextLine();

        // Solicitar y leer el modelo del vehículo
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = sc.nextLine();

        // Solicitar y leer la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = sc.nextLine();

        // Solicitar y leer el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        // Solicitar y leer la capacidad en pasajeros
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Mostrar los datos ingresados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // Solicitar y leer el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Solicitar y leer la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Mostrar los datos ingresados del usuario
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
