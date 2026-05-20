package ejercicio_3;

import java.io.File;

public abstract class DecoradorReporte implements Report {

    protected Report reporte;

    public DecoradorReporte(Report reporte) {
        this.reporte = reporte;
    }

}
