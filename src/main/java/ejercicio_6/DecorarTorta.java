package ejercicio_6;

public abstract  class DecorarTorta extends Torta {
    protected Torta torta;

    protected float precioBase = 0.0f;
    public DecorarTorta(Torta torta) {
        this.torta = torta;
        precioBase = torta.precio();
    }
}
