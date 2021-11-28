
package Exercici_02;

public class Exercici_02 {

    public static void main(String[] args) {

    System.out.println(Exercici_02.calculaLetra(47637292));


    }
    static char calculaLetra(int dni){
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";

        int modulo= dni % 23;

        char letra = juegoCaracteres.charAt(modulo);

        return letra;
    }
}