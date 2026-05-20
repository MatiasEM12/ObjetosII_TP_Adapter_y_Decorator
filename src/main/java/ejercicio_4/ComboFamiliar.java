package ejercicio_4;

public class ComboFamiliar implements Combo {

    private Double precio;
    private String descripcion;

    public ComboFamiliar(Double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public Double precio() {
        return precio;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public void sumarleAdicional(Double adicional) {
        this.precio += adicional;
    }

    @Override
    public void sumarleDescripcion(String descripcion) {
        this.descripcion += " "+descripcion;
    }


}
