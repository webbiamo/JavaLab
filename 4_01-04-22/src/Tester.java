import esempi.Bambino;
import esempi.Persona;

public class Tester
{

    public static void main(String[] args)
    {
        Persona personaGenerica = new Persona("Ciccio", "Pasticcio");
        System.out.println(personaGenerica);

        Bambino piccoloCucciolo = new Bambino("Ciccio", "Graziani", 3.08, true);
        System.out.println(piccoloCucciolo);

        System.out.println();
        System.out.println("La classe di appartenza di personaGenerica: " + personaGenerica.getClass().getName());
        System.out.println("La classe di appartenza di piccoloCucciolo: " + piccoloCucciolo.getClass().getName());



    }
}
