package ejercicio_3;

import java.io.File;

public class ReporteNoSobrebrescribe  extends DecoradorReporte {

    public ReporteNoSobrebrescribe(Report reporte) {
        super(reporte);
    }

    public void export(File file) {

        if(file.exists()){
            throw new IllegalArgumentException("El archivo ya existe");
        }

        reporte.export(file);
    }
}
