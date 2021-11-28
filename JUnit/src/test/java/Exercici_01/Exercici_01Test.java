package Exercici_01;


import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class Exercici_01Test {

    @Test
    public void test() {
        Exercici_01 exercici_01 = new Exercici_01();

        List<String> result = exercici_01.getMeses();


        // meses no es null:
        Assert.assertNotNull(result);
        // Tamaño de la lista:
        Assert.assertEquals(12,result.size());
        // Posición de Agosto:
        Assert.assertEquals("Agosto",result.get(7));



    }
}
