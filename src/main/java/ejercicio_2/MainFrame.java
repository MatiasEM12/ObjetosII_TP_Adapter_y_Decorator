package ejercicio_2;


import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Dibujar Figuras");

        MiCanvas miCanvas = new MiCanvas();
        miCanvas.agregarFigura(new Linea(new Coordenada(50, 50), 200));
        miCanvas.agregarFigura(new Circulo(new Coordenada(200, 200), 50));
        miCanvas.agregarFigura(new Texto(new Coordenada(100, 300), "Hola Mundo"));


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().add(miCanvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}