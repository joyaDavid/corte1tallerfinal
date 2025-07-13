
package usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

     
    String nombre;
    String Id;

    public Usuario(String nombre, String Id) {
        this.nombre = nombre;
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return Id;
    }
       

    @Override
     public String toString() {
        return nombre + " (ID: " + Id + ")";
   }
}
