import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCheck {
    public static void main(String[] args) {
        System.out.println("Actors");
        Actor actor1 = new Actor(12345, "Bryan", "Cranston");
        Actor actor2 = new Actor(32424, "Aaron", "Paul");
        Actor actor3 = new Actor(23456,"Kit", "Harinton");
        Actor actor4 = new Actor(6543, "Emilia", "Clarke");

        System.out.println(actor1);
        System.out.println(actor2);

        Personaje personaje1 = new Personaje(actor1, "Walter White");
        Personaje personaje2 = new Personaje(actor2, "Jesse Pinkman");
        Personaje personaje3 = new Personaje(actor3, "Jon Snow");
        Personaje personaje4 = new Personaje(actor4, "Daenerys Targaryen");

        System.out.println(personaje1);
        System.out.println(personaje2);

        Capitulo capitulo1 = new Capitulo(1, "cap1t1BB", 1.1f, false );
        Capitulo capitulo2 = new Capitulo(2, "cap2t1BB", 1.2f, false );
        Capitulo capitulo3 = new Capitulo(3, "cap1t2BB", 1.1f, false );
        Capitulo capitulo4 = new Capitulo(4, "cap2t2BB", 1.2f, false );
        Capitulo capitulo5 = new Capitulo(1, "cap1GOT", 1.1f, false );
        Capitulo capitulo6 = new Capitulo(2, "cap2GOT", 1.0f, false );

        System.out.println(capitulo1);
        System.out.println(capitulo2);
        System.out.println(capitulo3);
        System.out.println(capitulo4);

        List<Capitulo> capitulos1 = new ArrayList<>(Arrays.asList(capitulo1,capitulo2));
        System.out.println("List capitulos1 : " + capitulos1);
        List<Capitulo> capitulos2 = new ArrayList<>(Arrays.asList(capitulo3,capitulo4));
        System.out.println("List capitulos2 : " + capitulos2);


        List<Personaje> personajes1 = new ArrayList<>(Arrays.asList(personaje1, personaje2));
        System.out.println("List personajes1 : " + personajes1);
        List<Personaje> personajes2 = new ArrayList<>(Arrays.asList(personaje3, personaje4));
        System.out.println("List personajes2 : " + personajes2);

        Temporada temporada1 = new Temporada(1, 2008, false, false, capitulos1);
        Temporada temporada2 = new Temporada(2, 2009, false, false, capitulos2);

        List<Temporada> temporadas1 = new ArrayList<>(Arrays.asList(temporada1, temporada2));

        Serie serie1 = new Serie(1,"Breaking Bad", "Drama", 2008, "Narra la historia de Walter White (Bryan Cranston), un profesor de química con problemas económicos a quien le diagnostican un cáncer de pulmón inoperable. Para pagar su tratamiento y asegurar el futuro económico de su familia comienza a cocinar y vender metanfetamina", personajes1, temporadas1);
        Serie serie2 = new Serie(2, "Game of Thrones", "Drama", 2011, "La primera temporada comienza quince años después de la guerra civil conocida como la «rebelión de Robert», con la cual Robert Baratheon expulsó del Trono de Hierro a los Targaryen y se proclamó gobernante de Poniente. Tiempo después, y tras la repentina muerte de la Mano del Rey, Jon Arryn, Robert invita a su amigo Eddard «Ned» Stark —Lord de Invernalia— a asumir el oficio vacante. Este último acepta y, tan pronto llega a Desembarco del Rey —la capital de Poniente y sede del Trono de Hierro—, va descubriendo la verdad detrás de una serie de intrigas y conspiraciones que involucran a otras familias nobiliarias y que están relacionadas con la tragedia de Arryn. Sin embargo, cuando Robert muere también repentinamente, los Lannister reclaman el poder y ejecutan a Stark para evitar la difusión de sus investigaciones. Estos acontecimientos desatan una guerra entre los reinos de Poniente que se extiende hasta el final de la serie, y a la cual eventualmente se suma Daenerys, la única superviviente de la casa Targaryen, que en el exilio reúne un vasto ejército y cría a tres dragones para reclamar el poder despojado a su familia tiempo atrás. Simultáneamente, más allá de los territorios de Poniente limitados por un muro de hielo que es vigilado por la Guardia de la Noche, otra amenaza se cierne sobre los siete reinos ante la llegada de criaturas sobrenaturales conocidas como «caminantes blancos» y guiadas por el denominado Rey de la Noche",personajes2);

        System.out.println(serie1);
        System.out.println(serie2);

        List<Serie> series1 = new ArrayList<>(Arrays.asList(serie1,serie2));
        System.out.println("List series1 : " + series1);

        Usuario usuario1 = new Usuario(1234, "Juanjo", series1);

        System.out.println("usuario1 : "+ usuario1);

    }
}
