import java.util.Scanner;

public class Ejercicio_6 {

//    Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
//    plan de estudio semanal distribuyendo esas horas en diferentes materias.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese sus horas de estudio al dia: ");
        int horasEstudio = sc.nextInt();

        int horas_semanales = horasEstudio * 7;

        String [] materias = {"Matematicas", "Java", "Organiazacion Empresarial", "Python", "Arquitectura y Sis. Op."};

        int horas_por_materia = horas_semanales / materias.length;
        int horasRestantes = horas_semanales % materias.length;


        ////////////////////////sin terminarrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    }

//    public static String


}
