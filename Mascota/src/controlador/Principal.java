/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.Mascota;
import vista.Consola;

/**
 *
 * @author gonzalo.detomas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consola c = new Consola();
        Mascota perro = new Mascota("Alan", "19/04/2018", "Perro", "Dálmata", 78924);
        Mascota gato = new Mascota("Yeremy", "08/10/2019", "Gato", "Esfinge", 11264);

        c.muestraDatos(perro);
        c.muestraDatos(gato);

        String nombre = c.pideCadena("Introduce el nombre: ");
        String fechaNacimiento = c.pideCadena("Introduce el fecha de nacimiento: ");
        String animal = c.pideCadena("Introduce el tipo de animal: ");
        String raza = c.pideCadena("Introduce la raza: ");
        int numeroChip = c.pideEntero("Introduce el numero del chip: ");
        Mascota loro = new Mascota(nombre, fechaNacimiento, animal, raza, numeroChip);
        
        c.muestraDatos(loro);
        
        
    }
}
