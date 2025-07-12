package usuario;


package usuario;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("\n ¿ Deseas ingresar al control de Prestamos ? (s/n): ");
        String opcionPrestamo = Sc.nextLine();
        if (opcionPrestamo.equalsIgnoreCase("s")) {
        
            ControlDePrestamos Cp = new ControlDePrestamos();
        Cp.ControlDePrestamos();
    }

    }

    private static class ControlDePrestamos {

        public ControlDePrestamos() {
        }
    }
}
Scanner Sc = new Scanner (System.in);
        System.out.println("\n ¿ Deseas ingresar al control de Prestamos ? (s/n): ");
        String opcionPrestamo = Sc.nextLine();
        if (opcionPrestamo.equalsIgnoreCase("s")) {