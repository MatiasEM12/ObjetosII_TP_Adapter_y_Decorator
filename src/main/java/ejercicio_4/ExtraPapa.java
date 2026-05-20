package ejercicio_4;

public class ExtraPapa extends ComboExtra{

    public static final Double PRECIO_EXTRA_PAPA = 25.0;
    public static final String DESCRIPCION_EXTRA_PAPA = ", con papa extra ";

    public ExtraPapa(Combo combo) {
        super(combo);
    }

    public ComboExtra agregarPapa(){
        sumarleAdicional(PRECIO_EXTRA_PAPA);
        sumarleDescripcion(DESCRIPCION_EXTRA_PAPA);
        return this;
    }
}
