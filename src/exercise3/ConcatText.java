package exercise3;

//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima
// el resultado final por consola.
// Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

//    String[] nombres = {"", "", "", ""}

public class ConcatText {
    public static void main(String[] args) {
        String[] nombres = {"M", "a", "x", "i", "miliano"};
        StringBuilder concat = new StringBuilder();
        for (String nombre : nombres) {
            concat.append(nombre);
        }
        System.out.println(concat);

    }
}
