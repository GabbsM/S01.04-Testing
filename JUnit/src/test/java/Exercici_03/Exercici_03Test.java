package Exercici_03;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Exercici_03Test extends TestCase {

    @Test
    public void testLanzarExcepcion() {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, Exercici_03::lanzarExcepcion);
    }
}