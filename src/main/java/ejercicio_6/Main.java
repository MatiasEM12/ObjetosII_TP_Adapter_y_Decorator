package ejercicio_6;

public class Main {
    static void main() {


        Orden orden = new Orden();
        BuilderTorta builderTorta = new BuilderTorta();
        var Torta1 = builderTorta.BuilderTortaDe(new TortaVainilla()).ConBañoChocolate().build();
        var Torta2 = builderTorta.BuilderTortaDe(new TortaChocolate()).ConRocklets().build();
        var Torta3 = builderTorta.BuilderTortaDe(new TortaFrutilla()).ConBañoChocolate().ConRocklets().build();

        orden.agregarTorta(Torta1);
        orden.agregarTorta(Torta2);
        orden.agregarTorta(Torta3);

        orden.imprimirOrden();
    }
}
