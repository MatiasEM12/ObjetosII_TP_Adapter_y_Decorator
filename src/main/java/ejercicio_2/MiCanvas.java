package ejercicio_2;

import javax.swing.*;
import java.awt.*;

class MiCanvas extends JPanel {
    private java.util.List<Figura> figuras;

    public MiCanvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (Figura figura : figuras) {
            figura.dibujar(g2d);
        }
    }
}