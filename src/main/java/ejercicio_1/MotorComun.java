package ejercicio_1;

public class MotorComun implements Motor {


    @Override
    public void encender() {
        System.out.println("Encendiendo motor común");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor común");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor común");
    }
}
