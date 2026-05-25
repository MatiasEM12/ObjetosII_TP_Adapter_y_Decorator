package ejercicio_3;

public class Main {

    static void main() {
        try {
            var reporte = new ReporteNoSobrebrescribe(new ReporteBase("hola"));
            reporte.export(new java.io.File("holamundo.txt"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //repito para ver la excepcion de siExiste
        try {
            var reporte = new ReporteNoSobrebrescribe(new ReporteBase("hola"));
            reporte.export(new java.io.File("holamundo.txt"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
