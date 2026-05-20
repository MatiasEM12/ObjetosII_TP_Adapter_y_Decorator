package ejercicio_3;

import java.io.File;

public class ReporteSobrescribre extends DecoradorReporte {

    public ReporteSobrescribre(Report reporte) {
        super(reporte);
    }

    @Override
    public void export(File file) {

        if(file==null){
            throw new IllegalArgumentException("El archivo no puede ser nulo");

        }
        reporte.export(file);
    }
}
