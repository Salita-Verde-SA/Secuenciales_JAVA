import javax.swing.*;
import java.security.PublicKey;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_3 {
    //Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
    //avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
    //duraciones.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String condicion = JOptionPane.showInputDialog(null, "Ingrese su condicion fisica: \n> Principiante\n> Intermedio\n> Avanzado", "Ingrese seleccion aqui");
        condicion = condicion.toLowerCase(Locale.ROOT);

        String Rutina_Necesaria = "";

        if (condicion.equals("avanzado")) {
            Rutina_Necesaria = Avanzado();
        } else if (condicion.equals("principiante")) {
            Rutina_Necesaria = Principiante();
        } else if (condicion.equals("intermedio")) {
            Rutina_Necesaria = Intermed();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }

        JOptionPane.showMessageDialog(null, "La rutina perfecta para su nivel es: " + Rutina_Necesaria);
    }


    public static String Avanzado() {
        return "\nLunes: Correr - 60 minutos\n" +
                "Martes: Entrenamiento de fuerza (pesas pesadas) - 45 minutos\n" +
                "Miércoles: Natación - 45 minutos\n" +
                "Jueves: Entrenamiento HIIT - 30 minutos\n" +
                "Viernes: Correr - 60 minutos\n" +
                "Sábado: Bicicleta (alta intensidad) - 60 minutos\n" +
                "Domingo: Yoga y estiramientos profundos - 30 minutos";
    }


    public static String Principiante() {
        return "\nLunes: Caminar - 30 minutos\n" +
                "Martes: Descanso\n" +
                "Miércoles: Yoga - 20 minutos\n" +
                "Jueves: Caminar - 30 minutos\n" +
                "Viernes: Ejercicios de peso corporal (sentadillas, flexiones) - 15 minutos\n" +
                "Sábado: Descanso\n" +
                "Domingo: Estiramientos - 15 minutos";
    }


    public static String Intermed() {
        return "\nLunes: Correr - 40 minutos\n" +
                "Martes: Entrenamiento de fuerza (pesas) - 30 minutos\n" +
                "Miércoles: Natación - 30 minutos\n" +
                "Jueves: Correr - 40 minutos\n" +
                "Viernes: Entrenamiento HIIT - 25 minutos\n" +
                "Sábado: Bicicleta - 45 minutos\n" +
                "Domingo: Estiramientos y movilidad - 20 minutos";
    }
}
