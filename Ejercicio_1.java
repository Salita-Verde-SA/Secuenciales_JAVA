import java.util.Scanner;

//Ejercicio 1: Generador de Horóscopo
//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento(DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        String[] partesFecha = fecha.split("/");

        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int ano = Integer.parseInt(partesFecha[2]);

        String signo = "";
        String mensaje = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            mensaje = "Gobernado por Marte, planeta relacionado con el dios romano de la guerra, este signo de fuego enciende nuevos comienzos. Bautizado a partir del mito griego del Carnero Dorado, Aries se destaca por la audacia. Emprender y abrir paso a un nuevo camino es típico de los pioneros de este signo que vibran alto, inspiran y se dejan llevar por el impulso, la pasión y la intuición.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            mensaje = "cuerpo celeste asociado a la divinidad del amor y la belleza, las personas de este signo conectado con la tierra, son manifestadoras de belleza y abundancia. En sintonía con su cuerpo y con la naturaleza, los taurinos conocen sus placeres y su valor, ¡y lo hacen valer! Si bien el cambio les incomoda, una vez que comienza a correr el toro en su interior, ¡no hay quién lo detenga!";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Geminis";
            mensaje = "astro vinculado al mensajero de los dioses, este signo intelectual se distingue por sus dones comunicativos. Como el aire que se amolda a las formas sólidas, los geminianos son sumamente adaptables. Inspirado en la constelación de los gemelos, este signo permite tener una opinión y al día siguiente explorar la contraria sin remordimiento. La creatividad, el humor y la frescura también lo caracterizan.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cancer";
            mensaje = "Influenciado por la luna, este signo de agua hace a personas sumamente emocionales que nutren y se nutren del hogar y la familia. Como la constelación del cangrejo, los cancerianos protegen sus sentimientos más profundos con un caparazón. La memoria con un tinte de nostalgia y la intuición también delinean su personalidad. ¿Resuena contigo?";
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
            mensaje = "Gobernado por Júpiter, planeta del padre de los dioses, las personas de este signo fogoso son inspiradoras y grandes maestras. En conexión con la constelación del centauro que dispara su flecha hacia arriba, los más optimistas del Zodíaco apuntan a nuevos horizontes. Fanáticos de los viajes y la aventura, todo lo que implique una expansión mental, como la filosofía o la astrología, ilumina a los sagitarianos.";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            mensaje = "Al compás de Saturno, planeta anillado y dios guardián del tiempo, este signo terrenal caracteriza a personas trabajadoras, estructuradas y disciplinadas que aspiran al éxito y en muchos casos cargan con el deber ser. Su romance con el tiempo las hace amantes de la música. Representados por la constelación de la cabra con cola de pez, los capricornios son todoterreno y siempre van por más.";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            mensaje = "Influenciado por Urano, astro de la deidad del cielo, este signo de aire eleva la intelectualidad. A pesar de su excentricidad, los acuarianos congenian en grupos como nadie. Espejados en las estrellas por una aguatera derramando agua de inmortalidad sobre la Tierra, empatizan con causas mayores y crean comunidad para marchar por cambios trascendentales.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            mensaje = "Regido por Neptuno, planeta azul asociado al dios del mar, este signo de agua hace a personas sensibles, intuitivas y altruistas, que diluyen barreras y llevan todo lo que hacen más allá con su extraordinaria imaginación. Los peces nadando en direcciones opuestas en el océano estelar denotan su profundidad, su compasión tras explorar caminos adversos, y su capacidad de fluir.";
        }

        System.out.println("Tu signo es: " + signo);
        System.out.println("Mensaje: " + mensaje);

    }

    public static void zodiaco(int edad, int fecha) {

    }
}
