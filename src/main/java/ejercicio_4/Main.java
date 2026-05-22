package ejercicio_4;

import static java.lang.System.lineSeparator;

public class Main {

    public static void main(String[] args) {
        Combo combo = new ComboSimple(100.0, "Combo Simple:  hamburguesa");


        System.out.println( lineSeparator() +"Combo Simple" + lineSeparator());
        var comboFinal= new ExtraTomate(new ExtraQueso(new ComboSimple(100.0, "Combo Simple:  hamburguesa")));
        System.out.println(comboFinal.precio());
        System.out.println(comboFinal.descripcion());


        var combo3 = new ExtraTomate(new ExtraQueso(new ComboSimple(10d, "bkaaaa")));
        System.out.println(combo3.precio());
        System.out.println(combo3.descripcion());

        System.out.println( lineSeparator());

        var combo4= new ComboExtra(combo).conExtraCarne().ConExtraQueso().ConExtraTomate();
        System.out.println(combo4.precio());
        System.out.println(combo4.descripcion());


    }
}
