package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlDePrestamo {

    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        int opcion;
        do {
            System.out.println("\n === CONTROL DE PRÉSTAMOS ===");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Listar préstamos por usuario");
            System.out.println("3. Actualizar fecha de devolución");
            System.out.println("4. Eliminar préstamo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1: registrarPrestamo(); break;
                case 2: listarPrestamosPorUsuario(); break;
                case 3: actualizarDevolucion(); break;
                case 4: eliminarPrestamo(); break;
                case 5: System.out.println("Hasta luego!"); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private void registrarPrestamo() {
        System.out.print("Nombre de usuario: ");
        String nombre = sc.nextLine();
        System.out.print("ID de usuario: ");
        String id = sc.nextLine();

        Usuario usuario = buscarOcrearUsuario(nombre, id);

        System.out.print("Nombre del libro: ");
        String libro = sc.nextLine();

        LocalDate fechaPrestamo = LocalDate.now();
        System.out.print("Fecha de devolución (YYYY-MM-DD): ");
        String fechaDev = sc.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechaDev);

        if (fechaDevolucion.isBefore(fechaPrestamo)) {
            System.out.println("La fecha de devolución no puede ser antes del préstamo.");
            return;
        }

        Prestamo prestamo = new Prestamo(usuario, libro, fechaPrestamo, fechaDevolucion);
        prestamos.add(prestamo);
        System.out.println("Préstamo registrado.");
    }

    private Usuario buscarOcrearUsuario(String nombre, String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        Usuario nuevo = new Usuario(nombre, id);
        usuarios.add(nuevo);
        return nuevo;
    }

    private void listarPrestamosPorUsuario() {
        System.out.print("ID de usuario: ");
        String id = sc.nextLine();
        boolean encontrado = false;
        for (Prestamo p : prestamos) {
            if (p.getUsuario().getId().equals(id)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay préstamos para ese usuario.");
        }
    }

    private void actualizarDevolucion() {
        System.out.print("Nombre del libro a actualizar: ");
        String libro = sc.nextLine();
        boolean encontrado = false;
        for (Prestamo p : prestamos) {
            if (p.getLibro().equalsIgnoreCase(libro)) {
                System.out.print("Nueva fecha de devolución (YYYY-MM-DD): ");
                String fechaDevStr = sc.nextLine();
                LocalDate nuevaFecha = LocalDate.parse(fechaDevStr);

                if (nuevaFecha.isBefore(p.getFechaPrestamo())) {
                    System.out.println("Fecha inválida.");
                    return;
                }
                p.setFechaDevolucion(nuevaFecha);
                System.out.println("Fecha actualizada.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Préstamo no encontrado.");
        }
    }

    private void eliminarPrestamo() {
        System.out.print("Nombre del libro a eliminar: ");
        String libro = sc.nextLine();
        boolean eliminado = prestamos.removeIf(p -> p.getLibro().equalsIgnoreCase(libro));

        if (eliminado) {
            System.out.println("Préstamo eliminado.");
        } else {
            System.out.println("No se encontró el préstamo.");
        }
    }
}
