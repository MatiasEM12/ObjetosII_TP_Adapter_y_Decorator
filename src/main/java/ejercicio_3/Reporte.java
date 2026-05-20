package ejercicio_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reporte  implements Report {

    private String reporte;
    public Reporte(String reporte) {
        this.reporte = reporte;
    }


    @Override
    public void export(File file) {
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(reporte);

            System.out.println("Reporte exportado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
