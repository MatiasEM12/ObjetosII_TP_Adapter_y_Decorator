package ejercicio_4;

public class ExtraQueso extends ComboExtra {

    public static final Double PRECIO_EXTRA_QUESO = 30.0;
    public static final String DESCRIPCION_EXTRA_QUESO = ", con queso extra ";

    public ExtraQueso(Combo combo) {
        super(combo);
    }

    public ComboExtra agregarQueso(){
        sumarleAdicional(PRECIO_EXTRA_QUESO);
        sumarleDescripcion(DESCRIPCION_EXTRA_QUESO);
        return this;
    }
}
