package ejercicio_4;

public class ExtraTomate extends ComboExtra{

    public static final Double PRECIO_EXTRA_TOMATE = 20.0;
    public static final String DESCRIPCION_EXTRA_TOMATE = ", con tomate extra ";

    public ExtraTomate(Combo combo) {
        super(combo);
        this.precioAdicional=PRECIO_EXTRA_TOMATE;
        this.descripcionAdicional=DESCRIPCION_EXTRA_TOMATE;
    }


}
