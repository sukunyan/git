/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadorainflacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cliente1
 */
public class CalculadoraInflacionTest {
    
    public CalculadoraInflacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculadoraInflacion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraInflacion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularInflacion method, of class CalculadoraInflacion.
     */
    @Test
    public void testCalcularInflacion() {
        System.out.println("calcularInflacion");
        double precioOriginal = 100.0;
        double precioActual = 120.0;
        double expResult = 20.0;
        double result = CalculadoraInflacion.calcularInflacion(precioOriginal, precioActual);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
