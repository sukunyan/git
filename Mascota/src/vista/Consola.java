
package vista;

import java.util.Scanner;
import modelo.Mascota;

/**
 *
 * @author gonzalo.detomas
 */
public class Consola {
    public Mascota pideDatos(){
        Scanner teclado = new Scanner(System.in);
        Mascota m = new Mascota();
        System.out.println("Introduce el nombre de la mascota: ");
        m.setNombre(teclado.nextLine());
        System.out.println("Introduce la fecha de nacimiento de la mascota: ");
        m.setFechaNacimiento(teclado.nextLine());
        System.out.println("Introduce el tipo de animal: ");
        m.setAnimal(teclado.nextLine());
        System.out.println("Introduce la raza del animal: ");
        m.setRaza(teclado.nextLine());
        System.out.println("Introduce el numero de chip del animal: ");
        m.setNumeroChip(teclado.nextInt());
        
        return m;
    }
    public void muestraDatos(Mascota nuevaMascota){
        System.out.println("\n\tLos datos de la mascota son: ");
        System.out.println("Nombre: " + nuevaMascota.getNombre());
        System.out.println("Fecha de nacimiento: " + nuevaMascota.getFechaNacimiento());
        System.out.println("Animal: " + nuevaMascota.getAnimal());
        System.out.println("Raza: " + nuevaMascota.getRaza());
        System.out.println("Numerochip: " + nuevaMascota.getNumeroChip());
        
    }
    public String pideCadena(String pregunta){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.print(pregunta);
        cadena = teclado.nextLine();
        
        return cadena;
    }
    public int pideEntero(String pregunta){
        Scanner teclado = new Scanner(System.in);
        int entero;
        System.out.print(pregunta);
        entero = teclado.nextInt();
        
        return entero;
    }
}


