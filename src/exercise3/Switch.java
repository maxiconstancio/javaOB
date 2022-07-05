package exercise3;

public class Switch {

    public static void main(String[] args) {
        String dia = "Martes";

        switch (dia) {
            case "Lunes" -> System.out.println("Hoy es Lunes..");
            case "Martes" -> System.out.println("Hoy es Martes..");
            case "Miercoles" -> System.out.println("Hoy es Miercoles..");
            case "Jueves" -> System.out.println("Hoy es Jueves..");
            case "Viernes" -> System.out.println("Hoy es Viernes..");
            case "Sabado" -> System.out.println("Hoy es Sabado..");
            default -> System.out.println("Hoy es Domingo");
        }
    }
}
