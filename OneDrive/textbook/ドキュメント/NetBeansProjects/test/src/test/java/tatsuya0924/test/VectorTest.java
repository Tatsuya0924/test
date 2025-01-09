/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tatsuya0924.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author woota
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("BeforeAll: Test class setup.");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("AfterAll: Test class teardown.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("BeforeEach: Test method setup.");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach: Test method teardown.");
    }

    /**
     * Test of equal method, of class Vector.
     */
    @Test
    public void testEqual() {
        System.out.println("equal with valid arguments");
        final int[] a = {1, 2, 3};
        final int[] b = {1, 2, 3};
        boolean expResult = true;
        boolean result = Vector.equal(a, b);
        assertEquals(expResult, result);

        System.out.println("equal with null arguments");
        assertThrows(IllegalArgumentException.class, () -> {
            Vector.equal(a, b);
        });
    }

    /**
     * Test of scalarMultiplication method, of class Vector.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication with valid arguments");
        final int[] a = {1, 2, 3};
        final int[] b = {4, 5, 6};
        int expResult = 1 * 4 + 2 * 5 + 3 * 6; // Expected result: 32
        int result = Vector.scalarMultiplication(a, b);
        assertEquals(expResult, result);

        System.out.println("scalarMultiplication with null arguments");
        assertThrows(IllegalArgumentException.class, () -> {
            Vector.scalarMultiplication(a, b);
        });
    }
}
