
package modelo;

/**
 *
 * @author gonzalo.detomas
 */
public class Mascota {
    private String nombre;
    private String fechaNacimiento;
    private String animal;
    private String raza;
    private int numeroChip;
   
    //Constructor por defecto
    public Mascota() {
        this.nombre = "abandonado";
        this.fechaNacimiento ="01/01/23";
        this.animal = "Rata";
        this.raza = "Chunga";
        this.numeroChip = 0;
    }
   //Constructor por parametros
    public Mascota(String nombre, String fechaNacimiento, String animal,
            String raza, int numeroChip) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.animal = animal;
        this.raza = raza;
        this.numeroChip = numeroChip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
    }
    
}
