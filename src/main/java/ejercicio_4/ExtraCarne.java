package ejercicio_4;

public class ExtraCarne extends ComboExtra {

    public static final Double PRECIO_EXTRA_CARNE = 50.0;
    public static final String DESCRIPCION_EXTRA_CARNE = ", con carne extra ";
    public ExtraCarne(Combo combo) {
        super(combo);
        this.precioAdicional=PRECIO_EXTRA_CARNE;
        this.descripcionAdicional=DESCRIPCION_EXTRA_CARNE;
    }


}
