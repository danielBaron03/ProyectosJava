import java.util.ArrayList;
import java.util.Scanner;

public class proyecto2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- LISTA DE TAREAS ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            if (opcion == 1) {
                sc.nextLine();

                System.out.println("Introduce la tarea: ");
                String tarea = sc.nextLine();

                tareas.add(tarea);

                System.out.println("Tarea añadida correctamente");
            }

            if (opcion == 2) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas en la lista");
                } else {
                    System.out.println("Tus tareas:");

                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                }
            }

            if (opcion == 3) {
                if (tareas.isEmpty()) {
                    System.out.println("No hay tareas para eliminar");
                } else {
                    System.out.println("Estas son tus tareas actuales:");

                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }

                    System.out.println("Introduce el numero de la tarea que desea eliminar");
                    int numeroTarea = sc.nextInt();

                    if (numeroTarea >= 1 && numeroTarea <= tareas.size()) {
                        tareas.remove(numeroTarea - 1);
                        System.out.println("Tarea eliminada correctamente");
                    } else {
                        System.out.println("Tarea no encontrada, introduce un número correcto");
                    }
                }
            }

            if (opcion < 1 || opcion > 4){
                System.out.println("Opción no valida.Intenta de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}