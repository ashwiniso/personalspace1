public class Droid {
    int batteryLevel;
    String name;

    public Droid(int battery, String droidName) {
        batteryLevel = battery;
        name = droidName;
    }

    public String toString() {
        return "Hello, I'm the droid :" + name;
    }

    public String performTask(String task) {
        batteryLevel -= 10;
        return name + " is performing " + task + "!";

    }

    public String stateBattery() {
        return "The battery level of the droid is " + batteryLevel;

    }

    public static void main(String[] args) {
        Droid Codey = new Droid(100, "Ashwin");
        Codey.stateBattery();

    }

}