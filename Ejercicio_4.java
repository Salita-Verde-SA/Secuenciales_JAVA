import javax.swing.*;
import java.util.Locale;
import java.util.MissingResourceException;

//    Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//    genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.

public class Ejercicio_4 {

    public static void main(String[] args) {
        String ingresar_estado_de_animo = JOptionPane.showInputDialog("Ingrese su estado de animo:\n> Feliz😂\n> Triste😣\n> Energetico😍\n> Relajado😎");

        ingresar_estado_de_animo = ingresar_estado_de_animo.toLowerCase(Locale.ROOT);

        String estado_animo = "";

        if (ingresar_estado_de_animo.equals("feliz")) {
            estado_animo = Felizzz();
        } else if (ingresar_estado_de_animo.equals("triste")) {
            estado_animo = Tristee();
        } else if (ingresar_estado_de_animo.equals("energetico")) {
            estado_animo = Energeticc();
        } else if (ingresar_estado_de_animo.equals("relajado")) {
            estado_animo = Relaxx();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
        }

        JOptionPane.showMessageDialog(null, "Segun tu estado de animo actual se genero esta lista de canciones: " + estado_animo);

    }


    public static String Felizzz() {
        return "\n" +
                "1 - Pharrell Williams - Happy\n" +
                "2 - Katrina and the Waves - Walking on Sunshine\n" +
                "3 - Justin Timberlake - Can't Stop the Feeling!\n" +
                "4 - Bruno Mars - Uptown Funk\n" +
                "5 - Maroon 5 - Sugar\n" +
                "6 - Taylor Swift - Shake It Off\n" +
                "7 - Bobby McFerrin - Don't Worry, Be Happy\n" +
                "8 - Jessie J - Price Tag\n" +
                "9 - The Beach Boys - Good Vibrations\n" +
                "10 - Lizzo - Juice\n" +
                "11 - Shakira - Waka Waka (This Time for Africa)\n" +
                "12 - David Guetta feat. Sia - Titanium\n" +
                "13 - Imagine Dragons - On Top of the World\n" +
                "14 - Sophie Ellis-Bextor - Murder on the Dancefloor\n" +
                "15 - Walk the Moon - Shut Up and Dance";
    }

    public static String Tristee() {
        return "\n" +
                "1 - Adele - Someone Like You\n" +
                "2 - Coldplay - Fix You\n" +
                "3 - Sam Smith - Too Good at Goodbyes\n" +
                "4 -  Lewis Capaldi - Someone You Loved\n" +
                "5 - Radiohead - Creep\n" +
                "6 - Sinead O'Connor - Nothing Compares 2 U\n" +
                "7 - James Blunt - Goodbye My Lover\n" +
                "8 - Billie Eilish - When the Party's Over\n" +
                "9 - The Fray - How to Save a Life\n" +
                "10 - Taylor Swift - All Too Well\n" +
                "11 - Linkin Park - Numb\n" +
                "12 - Hozier - Cherry\n" +
                "13 - Florence + The Machine - Shake It Out\n" +
                "14 - Katy Perry - The One That Got Away\n" +
                "15 - Demi Lovato - Skyscraper";
    }

    public static String Energeticc(){
        return "\n" +
                "1 - Survivor - Eye of the Tiger\n" +
                "2 - Eminem - Lose Yourself\n" +
                "3 - AC/DC - Thunderstruck\n" +
                "4 - Queen - Don't Stop Me Now\n" +
                "5 - The White Stripes - Seven Nation Army\n" +
                "6 - Kanye West - Stronger\n" +
                "7 - Linkin Park - Bleed It Out\n" +
                "8 - David Guetta feat. Sia - Titanium\n" +
                "9 - Black Eyed Peas - I Gotta Feeling\n" +
                "10 - Maroon 5 - Moves Like Jagger\n" +
                "11 - Rihanna - Where Have You Been\n" +
                "12 - Dua Lipa - Don't Start Now\n" +
                "13 - Calvin Harris - Summer\n" +
                "14 - Fall Out Boy - Centuries\n" +
                "15 - Lady Gaga - Just Dance";
    }

    public static String Relaxx(){
        return "\n" +
                "1 - Norah Jones - Don't Know Why\n" +
                "2 - Jack Johnson - Banana Pancakes\n" +
                "3 - The Scientist\n" +
                "4 - John Mayer - Gravity\n" +
                "5 - Ludovico Einaudi - Nuvole Bianche\n" +
                "6 - Simon & Garfunkel - The Sound of Silence\n" +
                "7 - Hozier - Cherry\n" +
                "8 - Enya - Only Time\n" +
                "9 - Adele - Someone Like You\n" +
                "10 - James Taylor - Fire and Rain\n" +
                "11 - Bill Withers - Lean on Me\n" +
                "12 - Iron & Wine - Naked as We Came\n" +
                "13 - Fleetwood Mac - Landslide\n" +
                "14 - Ed Sheeran - Photograph\n" +
                "15 - Air - La Femme D'Argent";
    }
}
