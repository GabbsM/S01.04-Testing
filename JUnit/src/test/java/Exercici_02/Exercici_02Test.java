package Exercici_02;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Exercici_02Test extends TestCase {

    @Test
    public void testCalculaLetra() {
        Assert.assertEquals('Z',Exercici_02.calculaLetra(47637292));
    }
}