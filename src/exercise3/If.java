package exercise3;

public class If {
    public static void main(String[] args) {
        int edad = 1;
        verifyAge(edad); //funcion condicional


    }

    static void verifyAge( Integer age) {
        if (age < 18) {
            System.out.println("Las comillas simples no se usan en String");
        }
        else {
            System.out.println("Es mayor");
        }

    }



}
