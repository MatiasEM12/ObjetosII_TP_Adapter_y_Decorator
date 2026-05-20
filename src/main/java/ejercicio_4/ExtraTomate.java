package ejercicio_4;

public class ExtraTomate extends ComboExtra{

    public static final Double PRECIO_EXTRA_TOMATE = 20.0;
    public static final String DESCRIPCION_EXTRA_TOMATE = ", con tomate extra ";

    public ExtraTomate(Combo combo) {
        super(combo);
    }

    public ComboExtra agregarTomate(){
        sumarleAdicional(PRECIO_EXTRA_TOMATE);
        sumarleDescripcion(DESCRIPCION_EXTRA_TOMATE);
        return this;
    }
}
