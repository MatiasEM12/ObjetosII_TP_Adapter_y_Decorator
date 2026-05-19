package ejercicio_2;

import javax.swing.*;

public class Panel extends JFrame {

    public static void panel() {

        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btnCirculo= new JButton("Dibujar un circulo");
        JButton btnTexto = new JButton("Dibujar un texto");
        JButton btnLinea = new JButton("Dibujar una linea");

        btnCirculo.setBounds(100, 100, 150, 40);
        btnTexto.setBounds(100, 100, 150, 40);
        btnLinea.setBounds(100, 100, 150, 40);

        frame.add(btnCirculo);
        frame.add(btnTexto);
        frame.add(btnLinea);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
