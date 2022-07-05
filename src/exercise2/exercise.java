package exercise2;

public class exercise {
    public static void main(String[] args) {

       double precio = 100;
       double precioTotal = calculoTotal(precio);
        System.out.println(precioTotal);

    }

    static double calculoTotal(double precio) {
        double iva = 0.21;
        return precio + (precio * iva);
    }
}
