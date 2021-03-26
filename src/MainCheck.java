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

        List<Personaje> personajes1 = new ArrayList<>(Arrays.asList(personaje1, personaje2));
        System.out.println("List personajes1 : " + personajes1);
        List<Personaje> personajes2 = new ArrayList<>(Arrays.asList(personaje3, personaje4));
        System.out.println("List personajes2 : " + personajes2);

        Serie serie1 = new Serie(1,"Breaking Bad", "Drama", 2008, "Narra la historia de Walter White (Bryan Cranston), un profesor de química con problemas económicos a quien le diagnostican un cáncer de pulmón inoperable. Para pagar su tratamiento y asegurar el futuro económico de su familia comienza a cocinar y vender metanfetamina", personajes1);
        Serie serie2 = new Serie(2, "Game of Thrones", "Drama", 2011, "La primera temporada comienza quince años después de la guerra civil conocida como la «rebelión de Robert», con la cual Robert Baratheon expulsó del Trono de Hierro a los Targaryen y se proclamó gobernante de Poniente. Tiempo después, y tras la repentina muerte de la Mano del Rey, Jon Arryn, Robert invita a su amigo Eddard «Ned» Stark —Lord de Invernalia— a asumir el oficio vacante. Este último acepta y, tan pronto llega a Desembarco del Rey —la capital de Poniente y sede del Trono de Hierro—, va descubriendo la verdad detrás de una serie de intrigas y conspiraciones que involucran a otras familias nobiliarias y que están relacionadas con la tragedia de Arryn. Sin embargo, cuando Robert muere también repentinamente, los Lannister reclaman el poder y ejecutan a Stark para evitar la difusión de sus investigaciones. Estos acontecimientos desatan una guerra entre los reinos de Poniente que se extiende hasta el final de la serie, y a la cual eventualmente se suma Daenerys, la única superviviente de la casa Targaryen, que en el exilio reúne un vasto ejército y cría a tres dragones para reclamar el poder despojado a su familia tiempo atrás. Simultáneamente, más allá de los territorios de Poniente limitados por un muro de hielo que es vigilado por la Guardia de la Noche, otra amenaza se cierne sobre los siete reinos ante la llegada de criaturas sobrenaturales conocidas como «caminantes blancos» y guiadas por el denominado Rey de la Noche",personajes2);

        System.out.println(serie1);
        System.out.println(serie2);
    }
}
