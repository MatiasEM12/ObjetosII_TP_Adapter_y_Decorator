package ejercicio_1;

public class MotorEconomico implements Motor {

    @Override
    public void encender() {
        System.out.println("Encendiendo motor económico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor económico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor económico");
    }
}
