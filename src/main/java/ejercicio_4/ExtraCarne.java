package ejercicio_4;

public class ExtraCarne extends ComboExtra {

    public static final Double PRECIO_EXTRA_CARNE = 50.0;
    public static final String DESCRIPCION_EXTRA_CARNE = ", con carne extra ";
    public ExtraCarne(Combo combo) {
        super(combo);
    }

    public ComboExtra agregarCarne(){
        sumarleAdicional(PRECIO_EXTRA_CARNE);
        sumarleDescripcion(DESCRIPCION_EXTRA_CARNE);
        return this;
    }
}
