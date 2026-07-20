package thermostat;

public class Main {
    public static void main (String[]args){
        Thermostat thermo = new Thermostat("1st floor : 201",20);
        thermo.decreaseTemp(20);
        thermo.increaseTemp(15);
        thermo.decreaseTemp(2);
    }
}
