import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clase> listaClases = new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("CREACIÓN DE CLASES");
        System.out.print("¿Cuántas clases quieres crear?: ");
        int numClases = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < numClases; i++) {
            System.out.println("Introduce el curso:");
            String curso = sc.nextLine();

            System.out.println("Introduce el número de la clase:");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce la capacidad máxima:");
            int capacidadMaxima = sc.nextInt();
            sc.nextLine();  

            listaClases.add(new Clase(curso, numero, capacidadMaxima));
        }

        System.out.println("\nLISTA DE CLASES CREADAS:");
        for (Clase clase : listaClases) {
            System.out.println(clase);
        }

        System.out.println("\nCREACIÓN DE ALUMNOS");
        System.out.print("¿Cuántos alumnos quieres crear?: ");
        int numAlumnos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno:");
            String nombre = sc.nextLine();

            System.out.println("Introduce el apellido del alumno:");
            String apellido = sc.nextLine();

            System.out.println("Introduce el DNI del alumno:");
            String dni = sc.nextLine();

            System.out.println("Introduce la edad del alumno:");
            int edad = sc.nextInt();
            sc.nextLine(); 

            listaAlumnos.add(new Alumno(nombre, apellido, dni, edad));
        }

        System.out.println("\nLISTA DE ALUMNOS CREADOS:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}

