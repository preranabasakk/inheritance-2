package thermostat;

public class Thermostat {
    public String roomName;
    private int currentTemp;

    public int getCurrentTemp() {
        return currentTemp;
    }

    public Thermostat(String roomName, int currentTemp){
        this.roomName=roomName;
        this.currentTemp=currentTemp;
    }


    public void increaseTemp(int amount){
        currentTemp=currentTemp+amount;
        if(currentTemp>30){
            currentTemp=30;
            System.out.println("the max temp is 30");
        }
        else{
            System.out.println("temp is now"+currentTemp);
        }

    }
    public void decreaseTemp(int amount){
        currentTemp=currentTemp-amount;
        if(currentTemp<16){
            currentTemp=16;
            System.out.println("the minimum is 16");
        }
        else{
            System.out.println("temp is "+" "+getCurrentTemp());
        }

    }
}
