package ejercicio_4;

public  class ComboExtra implements Combo {

    protected Combo combo;
    protected Double precioAdicional = 0.0;
    protected String descripcionAdicional = "";

    public ComboExtra(Combo combo) {
        this.combo = combo;
    }

    @Override
    public Double precio() {
        return combo.precio() + precioAdicional;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + descripcionAdicional;
    }




}
