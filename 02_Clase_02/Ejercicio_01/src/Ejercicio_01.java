import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "Hola, ¿qué estaciones te gustan?, escribe la opción correspondiente:\n 1. Primavera.\n 2. Verano.\n 3. Otoño.\n 4. Invierno. ");
        byte estacion = teclado.nextByte();
        teclado.close();
        switch (estacion) {
            case 1:
                System.out.println(
                        "Todo cambia y nada permanece. Y no habría belleza, ni danza, ni movimiento si las estaciones no alborotaran los colores y el follaje de los arboles no se desprendiera amarillo en el atardecer. -Gioconda Belli-");
                break;
            case 2:
                System.out.println(
                        "Hermosas son las estaciones todas para el mortal que en sí guarda la dicha. -Rosalía De Castro-");
                break;
            case 3:
                System.out
                        .println("El otoño es una segunda primavera donde cada hoja es una flor. -Albert Camus-");
                break;
            case 4:
                System.out.println(
                        "El otoño da frutos; el estío es hermoso por sus mieses; la primavera nos regala sus flores; el invierno se nos alivia con el fuego. -Ovidio-");
                break;

            default:
                System.out.println("No has escogido una opción válida.");
                break;
        }

    }
}
