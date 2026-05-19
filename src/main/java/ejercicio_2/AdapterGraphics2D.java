package ejercicio_2;

import java.awt.*;

public class AdapterGraphics2D implements Panel {
    private Graphics2D graphics2D;

    public AdapterGraphics2D(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }

    @Override
    public void dibujarCirculo(int x, int y, int width, int heigth) {
        graphics2D.drawOval(x, y, width, heigth);
    }

    @Override
    public void dibujarLinea(int x1, int y1, int x2, int y2) {
        graphics2D.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        graphics2D.drawString(texto, x, y);
    }
}
