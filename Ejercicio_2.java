import java.util.Scanner;

//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
//ejercicio.

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso actual( En Kilogramos ): ");
        int peso = sc.nextInt();

        System.out.println("Ingrese la duracion ( En Minutos ): ");
        int minutos = sc.nextInt();

        System.out.println("Ingrese el ejercicio: \n1- Correr \n2- Caminar \n3- Nadar \n4- Andar en biciclieta");
        int ejercicio = sc.nextInt();

        double caloraias_quemadas = calcular_Calorias(peso, minutos, ejercicio);

        if (caloraias_quemadas > 0 ){
            System.out.println("Aproximadamente las calorias que quemaste son: " + caloraias_quemadas);
        }

        sc.close();
    }
    public static double calcular_Calorias(int peso, int minutos, int ejercicio) {

            double calorias_quemadas_por_minuto = 0;


            switch (ejercicio) {
                case 1:
                    calorias_quemadas_por_minuto = 0.0175 * 8 * peso;
                    break;
                case 2:
                    calorias_quemadas_por_minuto = 0.0175 * 3 * peso;
                    break;
                case 3:
                    calorias_quemadas_por_minuto = 0.0175 * 8 * peso;
                    break;
                case 4:
                    calorias_quemadas_por_minuto = 0.0175 * 6.8 * peso;
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                    return 0;
            }
            return calorias_quemadas_por_minuto * minutos;
    }
}
