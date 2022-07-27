package exercise4;

public class MainSmartDevice {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Snapdragon", "8Gb", "Android", "Samsung", "Galaxy S3", "5''", "2mp", "5mp" );
        System.out.println( phone );

        SmartWatch watch = new SmartWatch("Snapdragon Wear", "2gb", "Android", "Lenovo", "S2 Pro", true, false, true, true);
        System.out.println(watch);
    }
}
