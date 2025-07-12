
package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlDePrestamo {
    
    private ArrayList<Prestamo> prestamos = new ArrayList <>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Scanner Sc = new Scanner(System.in);
    private Object FechaDevolucion;
    
    public void menu(){
        int opcion;
        do{
            
            System.out.println("\n === NUMERO DE CONTROL DE PRESTAMOS ===");
        System.out.println("1.Registrar préstamo");
        System.out.println("2.Listar préstamos por usuario");
        System.out.println("3.Actualizar fecha de devolución");
        System.out.println("4.Eliminar préstamo");
        System.out.println("5.Salir");
        System.out.println("Elige una opcion");
        opcion = Sc.nextInt(); Sc.nextLine();
        
        
        switch (opcion) {
            
            case 1: registrarPrestamo(); break;
            case 2: listarPrestamosPorUsuario(); break;
            case 3: actualizarDevolucion(); break;
            case 4: eliminarPrestamo(); break;
            case 5: System.out.println("Hasta luego!"); break;
            
            default: System.out.println("Opción inválida.");
      }
    }  while (opcion != 5);
        
        
        System.out.print("Nombre de usuario: ");
        String nombre = Sc.nextLine();
        System.out.print("ID de usuario: ");
        String id = Sc.nextLine();
        
        Usuario usuario = buscarOcrearUsuario(nombre, id);
        System.out.print("Nombre del libro: ");
        String libro = Sc.nextLine();

        
        System.out.print("Fecha de Prestamo (YYYY/MM/DD): ");
        String fechaPr = Sc.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechaPr);
        
        System.out.print("Fecha de devolución (YYYY/MM/DD): ");
        String fechaDev = Sc.nextLine();
        LocalDate fechaPrestamo = LocalDate.parse(fechaDev);
        
        if (fechaDevolucion.isBefore(fechaPrestamo)) {
            System.out.println("La fecha de devolución no puede ser antes del préstamo.");
            return;
        
       Prestamo prestamo = new Prestamo(usuario, libro, FechaPrestamo, FechaDevolucion);
       prestamos.add(prestamo);
       System.out.println("Prestamo registrado.");
  }
}

    private void registrarPrestamo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void listarPrestamosPorUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void actualizarDevolucion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void eliminarPrestamo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Usuario buscarOcrearUsuario(String nombre, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}