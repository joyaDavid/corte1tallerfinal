
package usuario;

import java.time.LocalDate;

public class Prestamo {
    
    private Usuario usuario;
    private String libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
 
    public Prestamo(Usuario usuario, String libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public Usuario getUsuario() { return usuario; }
    public String getLibro() { return libro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    @Override
    public String toString() {
        return "Libro: " + libro +
               ", Usuario: " + usuario.getNombre() +
               ", Préstamo: " + fechaPrestamo +
               ", Devolución: " + fechaDevolucion;
  }
}
   