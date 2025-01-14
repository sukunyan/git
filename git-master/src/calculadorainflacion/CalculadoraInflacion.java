package calculadorainflacion;

import java.util.Scanner;

/**
 * Calculadora que permite calcular la tasa de inflación entre dos precios 
 * de un producto.
 * <p>
 * El programa solicita al usuario el precio original y el precio actual de 
 * un producto y calcula la tasa de inflación.
 * </p>
 * 
 * @author jiale.ye
 */
public class CalculadoraInflacion {

    /**
     * Método principal que ejecuta el programa.
     * Solicita al usuario los precios y calcula la inflación.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar los precios y calcular inflación
        System.out.println("Calculadora de Inflación");
        System.out.println("-----------------------------");
        
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = teclado.nextDouble();

        System.out.print("Ingrese el precio actual del producto: ");
        double precioActual = teclado.nextDouble();
        
        double tasaInflacion = calcularInflacion(precioOriginal, precioActual);
        
        System.out.printf("La tasa de inflación es: %.2f%%\n", tasaInflacion);
    }
    
    /**
     * Calcula la tasa de inflación entre el precio original y el precio actual.
     *
     * @param precioOriginal El precio original del producto.
     * @param precioActual El precio actual del producto.
     * @return La tasa de inflación en porcentaje.
     */
    public static double calcularInflacion(double precioOriginal, double precioActual) {
        return ((precioActual - precioOriginal) / precioOriginal) * 100;
    }
}