import java.util.Scanner;

public class recorridoCarro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float velocidad;
        float distancia;
        float tiempo;

        System.out.println("Ingresa la velocidad del carro en Km/h");
        velocidad = scanner.nextFloat();

        System.out.println("Ingresa la distancia que recorre en Km");
        distancia = scanner.nextFloat();

        tiempo = distancia/velocidad;

        System.out.println("El tiempo que tarda el carro es "+tiempo+" Horas");
    }
}