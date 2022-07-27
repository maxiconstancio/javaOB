package exercise4;

public class SmartPhone extends SmartDevice{
    String display;
    String frontalCam;
    String backCam;


    public SmartPhone () {}

    public SmartPhone(String processor, String memory, String os, String brand, String model, String display, String frontalCam, String backCam) {
        super(processor, memory, os, brand, model);
        this.display = display;
        this.frontalCam = frontalCam;
        this.backCam = backCam;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "display='" + display + '\'' +
                ", frontalCam='" + frontalCam + '\'' +
                ", backCam='" + backCam + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
