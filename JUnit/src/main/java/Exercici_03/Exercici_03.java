
package Exercici_03;

import java.util.ArrayList;

/*
. Creu una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
 Verifiqui el seu correcte funcionament amb un test jUnit.
 */
public class Exercici_03 {

    public static void main(String[] args) {
        lanzarExcepcion();

    }

    public static void lanzarExcepcion(){
        String[] amigos = new String[0];
        System.out.println(amigos[3]);



    }


}

