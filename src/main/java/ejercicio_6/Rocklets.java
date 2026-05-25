package ejercicio_6;

public class Rocklets extends DecorarTorta {

    public static final float EXTRA_ROCKLETS= 5;
    public static final String DESCRIPCION_EXTRA_ROCKLETS_CHOCOLATE =", con rocklets";

    public Rocklets(Torta torta) {
        super(torta);
    }

    @Override
    public float precio() {
        return torta.precio() + EXTRA_ROCKLETS ;
    }

    @Override
    public String descripcion() {
        return torta.descripcion() + DESCRIPCION_EXTRA_ROCKLETS_CHOCOLATE;
    }
}
