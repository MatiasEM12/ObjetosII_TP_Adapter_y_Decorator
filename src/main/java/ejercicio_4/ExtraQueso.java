package ejercicio_4;

public class ExtraQueso extends ComboExtra {

    public static final Double PRECIO_EXTRA_QUESO = 30.0;
    public static final String DESCRIPCION_EXTRA_QUESO = ", con queso extra ";

    public ExtraQueso(Combo combo) {
        super(combo);
        this.precioAdicional=PRECIO_EXTRA_QUESO;
        this.descripcionAdicional=DESCRIPCION_EXTRA_QUESO;
    }

}
