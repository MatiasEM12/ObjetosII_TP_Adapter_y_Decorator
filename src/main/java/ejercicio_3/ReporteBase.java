package ejercicio_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReporteBase implements Report {

    private String reporte;
    public ReporteBase(String reporte) {
        this.reporte = reporte;
    }


    @Override
    public void export(File file) { //sobreexcribe

        if(file==null){
            throw new IllegalArgumentException("El archivo no puede ser nulo");

        }
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(reporte);

            System.out.println("Reporte exportado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
