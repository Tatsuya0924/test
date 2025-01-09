package fr.centrale.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    public void testEqualWithNullArguments() {
        System.out.println("equal with null arguments");
        int[] a = null;
        int[] b = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Vector.equal(a, b);
        });
    }

    @Test
    public void testScalarMultiplicationWithNullArguments() {
        System.out.println("scalarMultiplication with null arguments");
        int[] a = null;
        int[] b = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Vector.scalarMultiplication(a, b);
        });
    }

    @Test
    public void testEqualWithValidArguments() {
        System.out.println("equal with valid arguments");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean expResult = true;
        boolean result = Vector.equal(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testScalarMultiplicationWithValidArguments() {
        System.out.println("scalarMultiplication with valid arguments");
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int expResult = 1*4 + 2*5 + 3*6; // 32
        int result = Vector.scalarMultiplication(a, b);
        assertEquals(expResult, result);
    }
}
