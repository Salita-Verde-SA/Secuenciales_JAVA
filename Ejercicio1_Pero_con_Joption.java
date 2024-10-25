import javax.swing.*;
import java.util.Scanner;

//Ejercicio 1: Generador de Horóscopo
//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

public class Ejercicio1_Pero_con_Joption {
    public static void main(String[] args) {

        String fecha = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento: ", "DD/MM/AAAA");

        String[] partesFecha = fecha.split("/");

        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int ano = Integer.parseInt(partesFecha[2]);

        String signo = "";
        String mensaje = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            mensaje = "Atraen las good vibes y las morritas se le pegan por su gran miembro";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            mensaje = "naciste para ser un goat, probablemente seas narcisista pero ¡no hay quién lo detenga! B) ";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Geminis";
            mensaje = "astro vinculado al mensajero de los dioses, Fumador astral y si no fumas en el futuro te van a vapear el miembro, GOD";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cancer";
            mensaje = "Influenciado por la luna, atraen riqueza, madafakin promises, quiza termines solo pero multimillonario ¿Resuena contigo?";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            mensaje = "Regido por el astro rey, este signo de fuego hace a los leoninos brillar con su esencia creativa e iluminar al prójimo, inspirándolo a rugir a su lado. Como el león que dibujan las estrellas, las personas de este signo se destacan por su gigantesco corazón que irradia confianza y generosidad.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            mensaje = "Reinado por Mercurio, el mismo provee el don de bajar ideas a tierra. No por nada, la agenda y la rutina son mejores amigas de los virginianos, que a pesar de esto, no prescinden de la flexibilidad y son sumamente analíticos. Asociados a la figura de una virgen, buscan la purificación y el perfeccionismo en todos los ámbitos, y por eso tienden a profundizar en rubros como la salud y el bienestar.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            mensaje = "Gobernados por Venus, los librianos son conocidos por entrar en simbiosis con la estética y por formar alianzas y parejas. El intelecto también es representativo de este signo de aire. Inspirado en la balanza estelar, Libra hace a personas equilibradas que buscan mantener la armonía y la diplomacia.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            mensaje = "Regido por Plutón, astro asociado a la deidad del inframundo, este signo de agua hace a personas intuitivas y esotéricas. Debido a sus grandes apegos, el cambio les cuesta, si bien el don de renacer es la particularidad que hace a los escorpianos poderosos. Ellos son magnéticos, seductores y románticos; cuando se enamoran, aspiran a fusionarse. También son muy habilidosos administrando recursos ajenos.";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            mensaje = "Gobernado por Júpiter, planeta del padre de los dioses y por tu senora, a los 25 te quedas soltero y te vas de locas, datos reales";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            mensaje = "Al compás de Saturno, la gente te ama y en cualquier momento vas a estar tomando mate con elon musk, te lo juro";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            mensaje = "Influenciado por Urano, astro de la deidad del cielo, este signo de aire eleva la intelectualidad. A pesar de su excentricidad, los acuarianos congenian en grupos como nadie. Espejados en las estrellas por una aguatera derramando agua de inmortalidad sobre la Tierra, empatizan con causas mayores y crean comunidad para marchar por cambios trascendentales.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            mensaje = "Regido por Neptuno, planeta azul asociado al dios del mar, este signo de agua hace a personas sensibles, intuitivas y altruistas, que diluyen barreras y llevan todo lo que hacen más allá con su extraordinaria imaginación. Los peces nadando en direcciones opuestas en el océano estelar denotan su profundidad, su compasión tras explorar caminos adversos, y su capacidad de fluir.";
        }

        JTextArea textArea = new JTextArea(mensaje);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        JOptionPane.showMessageDialog(null,"tu signo es: " + signo + "\n" + mensaje);

    }

    public static void zodiaco(int edad, int fecha) {

    }
}

