import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro para Edificio de Departamento");
        System.out.println("Porfavor ingrese su Informacion");

        System.out.print("Ingrese su Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad = scanner.nextByte();
        System.out.print("Ingrese su Cedula: ");
        long Cedula = scanner.nextLong();
        System.out.print("Ingrese el número del apartamento que va a visitar: ");
        int Apartamento = scanner.nextInt();
        System.out.print("¿Es un visitante recurrente? (true/false): ");
        boolean Recurrente = scanner.nextBoolean();
        scanner.close();

        System.out.println("\nInformación del Visitante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de apartamento: " + Apartamento);
        System.out.println("Número de identificación: " + Cedula);
        System.out.println("Visitante recurrente: " + Recurrente);
    }
}