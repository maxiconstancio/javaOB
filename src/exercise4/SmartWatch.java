package exercise4;

public class SmartWatch extends SmartDevice {
    boolean pedometer;
    boolean data;
    boolean submersible;
    boolean simCard;

    public SmartWatch(){}

    public SmartWatch(String processor, String memory, String os, String brand, String model, boolean pedometer, boolean data, boolean submersible, boolean simCard) {
        super(processor, memory, os, brand, model);
        this.pedometer = pedometer;
        this.data = data;
        this.submersible = submersible;
        this.simCard = simCard;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pedometer=" + pedometer +
                ", data=" + data +
                ", submersible=" + submersible +
                ", simCard=" + simCard +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
