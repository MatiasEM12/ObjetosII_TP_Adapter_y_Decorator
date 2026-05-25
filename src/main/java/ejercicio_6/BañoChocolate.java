package ejercicio_6;

public class BañoChocolate extends DecorarTorta{

    public static final float PORCENTAJE_EXTRA_BAÑO_CHOCOLATE = 0.15f;
    public static final String DESCRIPCION_EXTRA_BAÑO_CHOCOLATE =", con baño de chocolate";

    public BañoChocolate(Torta torta) {
        super(torta);
    }

    @Override
    public float precio() {
        return torta.precio() + (precioBase * PORCENTAJE_EXTRA_BAÑO_CHOCOLATE) ;
    }

    @Override
    public String descripcion() {
        return torta.descripcion() + DESCRIPCION_EXTRA_BAÑO_CHOCOLATE;
    }
}
