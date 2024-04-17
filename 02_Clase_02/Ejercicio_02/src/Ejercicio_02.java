import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, nuevo empleado: Te toca salir a recolectar ayudantes..");

        boolean entrevistando = true;
        byte ayudantesDia = 0;

        while (entrevistando == true) {

            System.out.println("Hola, ¿cuál es tu nombre?");
            String nombre = teclado.nextLine();
            System.out.println(
                    "Hola " + nombre
                            + ", le presento a la asociación benéfica 'La ayuda más grande', ¿deseas ayudar a nuestra asociación?, escoge una opción:\n 1. Sí.\n 2. No. ");
            byte ayudar = teclado.nextByte();

            if (ayudar == 1) {
                System.out.println("¿Con cuánto dinero desea comenzar a aportar a nuestra asociación?");
                int aporte = teclado.nextInt();
                teclado.nextLine();
                System.out.println("¡Excelente! Te confirmo que tu aporte ha sido de " + aporte
                        + " €. ¡Muchas gracias por tu ayuda!");
                ayudantesDia++;

            } else {
                System.out.println("Oh no, su respuesta me ha deprimido, creo que me iré a casa.");
                System.out
                        .println("*****Información para el empleado:\n Ayudantes totales entrevistados: " + ayudantesDia
                                + " *****");
                entrevistando = false;
            }
            System.out.println("*****Información para el empleado:\n Ayudantes totales entrevistados: "
                    + ayudantesDia + " *****");
        }
        teclado.close();
    }
}
