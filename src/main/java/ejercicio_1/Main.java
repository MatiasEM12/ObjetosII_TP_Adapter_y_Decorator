package ejercicio_1;

import ejercicio_1.Elementos_Electricos.MotorElectrico;

public class Main {

    public static void main(String[] args) {
        Motor motorComun = new MotorComun();
        Motor motorEconomico = new MotorEconomico();
        Motor motorElectrico = new AdapterMotorElectrico();

        System.out.println("Usando Motor Comun:");
        motorComun.encender();
        motorComun.acelerar();
        motorComun.apagar();

        System.out.println("\nUsando Motor Economico:");
        motorEconomico.encender();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        System.out.println("\nUsando Adapter Motor Electrico:");
        motorElectrico.encender();
        motorElectrico.acelerar();
        motorElectrico.apagar();


    }
}
