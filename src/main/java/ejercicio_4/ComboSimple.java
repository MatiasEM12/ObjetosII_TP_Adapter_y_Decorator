package ejercicio_4;

public class ComboSimple implements Combo {

    private Double precio;
    private String descripcion;

    public ComboSimple(Double precio, String descripcion) {
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
