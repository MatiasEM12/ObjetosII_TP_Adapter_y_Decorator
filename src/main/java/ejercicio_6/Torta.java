package ejercicio_6;

public abstract class Torta {
    private float COSTO = 10;
    public float precio() {
        return COSTO;
    }
    public abstract String descripcion();
}