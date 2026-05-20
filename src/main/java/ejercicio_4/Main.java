package ejercicio_4;

import static java.lang.System.lineSeparator;

public class Main {

    public static void main(String[] args) {
        Combo combo = new ComboSimple(100.0, "Combo Simple:  hamburguesa");
        Combo combo2 = new ComboFamiliar(150.0, "Combo familiar:  pizza");

        System.out.println( lineSeparator() +"Combo Simple" + lineSeparator());

       // System.out.println("Precio: " + combo.precio());
       // System.out.println("Descripción: " + combo.descripcion());

        var comboExtra = new ComboExtra(combo).agregarCarne();
        System.out.println("Precio con carne extra: " + comboExtra.precio());
        System.out.println("Descripción con carne extra: " + comboExtra.descripcion());


        System.out.println( lineSeparator() + "Combo Familiar" + lineSeparator());

      //  System.out.println("Precio: " + combo2.precio());
      //  System.out.println("Descripción: " + combo2.descripcion());

        var comboExtra2 = new ComboExtra(combo2).agregarQueso().agregarQueso();
        System.out.println("Precio con queso extra: " + comboExtra2.precio());
        System.out.println("Descripción con queso extra: " + comboExtra2.descripcion());
    }
}
