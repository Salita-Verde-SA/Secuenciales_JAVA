import java.util.Scanner;

public class Ejercicio_5 {

//    Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
//    combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
//    calcule e imprima el costo total del viaje.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia del viaje (KM): ");
        Float dist = sc.nextFloat();

        System.out.println("Ingrese el consumo de combustible del vehiculo (Litros x Km): ");
        Float cons = sc.nextFloat();

        System.out.println("Ingrese el precio del combustible por litro: ");
        Float combsPorLitro = sc.nextFloat();

        Float total = Costo_total_del_viaje(dist, cons, combsPorLitro);

        System.out.println(total);
        
    }

    public static Float Costo_total_del_viaje (Float dist,Float cons,Float combsPorLitro){
    return dist * cons * combsPorLitro;
    }
}
