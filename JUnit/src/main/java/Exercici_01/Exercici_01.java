package Exercici_01;

import java.util.ArrayList;
import java.util.List;

/*
Creu una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifiqui amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició
8 conté el nom 'Agost'.
 */
public class Exercici_01 {

    public List<String> getMeses() {
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        return meses;
    }

    public static void main(String[] args) {
        System.out.println(new Exercici_01().getMeses());
    }
}
