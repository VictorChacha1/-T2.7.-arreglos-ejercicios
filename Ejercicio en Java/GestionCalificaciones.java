import java.util.Scanner;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[100];
        double[] notas = new double[100];
        int cantidad = 0, opcion = 0;

        do {
            System.out.print("\n1. Registrar\n2. Reporte\n3. Buscar\n4. Salir\nOpcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                for (int i = 0; i < cantidad; i++) {
                    System.out.print("Nombre: "); nombres[i] = sc.next();
                    System.out.print("Nota: "); notas[i] = sc.nextDouble();
                }
            } else if (opcion == 2 && cantidad > 0) {
                double suma = 0; int aprob = 0, reprob = 0;
                for (int i = 0; i < cantidad; i++) {
                    suma += notas[i];
                    if (notas[i] >= 7) aprob++; else reprob++;
                }
                System.out.println("Promedio: " + (suma/cantidad) + "\nAprobados: " + aprob + "\nReprobados: " + reprob);
            } else if (opcion == 3) {
                System.out.print("Buscar: "); String buscar = sc.next();
                boolean enc = false;
                for (int i = 0; i < cantidad; i++) {
                    if (nombres[i].equalsIgnoreCase(buscar)) {
                        System.out.println(nombres[i] + " | Nota: " + notas[i] + " | " + (notas[i]>=7?"Aprobado":"Reprobado"));
                        enc = true; break;
                    }
                }
                if (!enc) System.out.println("El estudiante " + buscar + " no se encuentra registrado.");
            }
        } while (opcion != 4);
    }
}
