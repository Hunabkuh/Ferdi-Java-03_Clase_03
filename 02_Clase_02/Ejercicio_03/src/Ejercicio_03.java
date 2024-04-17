import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        do {

            System.out.println(
                    "Hola, bienvenid@ al convertidor de Onomatopeyas; escoge el sonido que quieres convertir de la lista:\n 1. Moto.\n 2. Vaca.\n 3. Perro.\n 4. Gato.\n 5. Pollito.");
            byte opcion = teclado.nextByte();

            switch (opcion) {
                case 1:
                    System.out.println("La Moto hace: ¡Bbbrrrrmmmmmm!");
                    break;
                case 2:
                    System.out.println("La Vaca hace: ¡Muuuu!");
                    break;
                case 3:
                    System.out.println("El Perro hace: ¡Guau, guau!");
                    break;
                case 4:
                    System.out.println("El Gato hace: ¡Miau!");
                    break;
                case 5:
                    System.out.println("El Pollito hace: ¡Pío pío!");
                    break;

                default:
                    System.out.println("No has seleccionado una opción de la lista.");
                    seguir = false;
                    break;
            }
        } while (seguir == true);

        teclado.close();
    }
}
