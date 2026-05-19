package ejercicio_1;

import ejercicio_1.Elementos_Electricos.MotorElectrico;

public class AdapterMotorElectrico implements Motor {

    private MotorElectrico motorElectrico;

    public AdapterMotorElectrico(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
