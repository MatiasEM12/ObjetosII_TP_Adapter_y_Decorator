package ejercicio_4;

public class ComboExtra implements Combo {

    private Combo combo;

    public ComboExtra(Combo combo) {
        this.combo = combo;
    }

    @Override
    public Double precio() {
        return combo.precio();
    }

    @Override
    public String descripcion() {
        return combo.descripcion();
    }

    @Override
    public void sumarleAdicional(Double adicional) {
        combo.sumarleAdicional(adicional);
    }

    @Override
    public void sumarleDescripcion(String descripcion) {
        combo.sumarleDescripcion(descripcion);
    }

    public ComboExtra agregarCarne(){
        new ExtraCarne(this).agregarCarne();
        return this;

    }

    public ComboExtra agregarQueso(){
        new ExtraQueso(this).agregarQueso();
        return this;
    }
}
