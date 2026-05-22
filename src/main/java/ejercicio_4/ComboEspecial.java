package ejercicio_4;

public class ComboEspecial implements Combo {

    private Double precio;
    private String descripcion;

    public ComboEspecial(Double precio, String descripcion) {
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


}
