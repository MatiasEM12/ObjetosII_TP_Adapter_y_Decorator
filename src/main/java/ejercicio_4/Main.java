package ejercicio_4;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

import static java.lang.System.lineSeparator;

public class Main {

    public static void main(String[] args) {
        Combo combo = new ComboSimple(100.0, "Combo Simple:  hamburguesa");
        Combo combo1 = new ComboFamiliar(200.0, "Combo Familiar: 2 hamburguesas, papas y gaseosa");
        ComboEspecial combo2 = new ComboEspecial(150.0, "Combo Especial: asado , pizza y ensalada de papa");
        System.out.println( lineSeparator() +"Combo Simple" + lineSeparator());

        var comboFinal= new ExtraTomate(new ExtraQueso(combo));
        System.out.println(comboFinal.precio());
        System.out.println(comboFinal.descripcion());


        System.out.println( lineSeparator() +"Construccion con cadena de constructores" + lineSeparator());
        var comboFinal2 = new ExtraTomate(new ExtraQueso(combo1));
        System.out.println(comboFinal2.precio());
        System.out.println(comboFinal2.descripcion());


        System.out.println( lineSeparator() +"Construccion con builder" + lineSeparator());
        var builderCombo = new BuilderCombo();
        var comboFinal3= builderCombo.BuilderComboDe(combo2).conExtraCarne().ConExtraTomate().build();
        System.out.println(comboFinal3.precio());
        System.out.println(comboFinal3.descripcion());

    }
}
