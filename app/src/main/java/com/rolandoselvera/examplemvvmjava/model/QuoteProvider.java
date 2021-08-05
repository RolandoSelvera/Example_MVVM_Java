package com.rolandoselvera.examplemvvmjava.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteProvider {

    private static final List<QuoteModel> quote = new ArrayList<>();

    // Devuelve una cita de forma aleatoria:
    public static QuoteModel random() {
        int min = 0;
        int max = 20;
        int position;

        Random random = new Random();
        position = random.nextInt(max - min) + min;
        return listOfQuotes().get(position);
    }

    // Lista de citas:
    private static List<QuoteModel> listOfQuotes() {
        quote.add(new QuoteModel(
                "El misterio de la vida no es un problema a resolver, sino una realidad a experimentar.",
                "Duna",
                "Frank Herbert"));
        quote.add(new QuoteModel(
                "Estar solo no tiene nada que ver con cuantas personas hay alrededor.",
                "Revolutionary Road",
                "Richard Yates"));
        quote.add(new QuoteModel(
                "Sea un hombre o sea más que un hombre. Sea firme con su propósito y firme como una piedra.",
                "Frankestein",
                "Mary Shelley"));
        quote.add(new QuoteModel(
                "El hombre débil se vuelve fuerte cuando no tiene nada, porque sólo entonces puede sentir la locura de la desesperación.",
                "La compañía blanca",
                "Arthur Conan Doyle"));
        quote.add(new QuoteModel(
                "Si buscas la perfección nunca estarás contento.",
                "Anna Karenina",
                "Leo Tolstoy"));
        quote.add(new QuoteModel(
                "Mientras el corazón late, mientras el cuerpo y alma siguen juntos, no puedo admitir que cualquier criatura dotada de voluntad tiene necesidad de perder la esperanza en la vida.",
                "Viaje al centro de la tierra",
                "Julio Verne"));
        quote.add(new QuoteModel(
                "No puedo morir aún doctor. Todavía no. Tengo cosas que hacer. Después de todo, tendré una vida entera en la que morir.",
                "El Juego del Ángel",
                "Carlos Ruiz Zafón"));
        quote.add(new QuoteModel(
                "Tengo esperanza o podría no vivir.",
                "La isla del doctor Moreau",
                "H.G. Wells"));
        quote.add(new QuoteModel(
                "Llamo a la gente “rica” cuando son capaces de satisfacer las necesidades de su imaginación.",
                "El retrato de una dama",
                "Henry James"));
        quote.add(new QuoteModel(
                "El sol es débil cuando se eleva primero, y cobra fuerza y coraje a medida que avanza el día.",
                "Vieja tienda de curiosidades",
                "Charles Dickens"));
        quote.add(new QuoteModel(
                "Es en las noches de diciembre, cuando el termómetro está a cero, cuando más pensamos en el sol.",
                "Los miserables",
                "Victor Hugo"));
        quote.add(new QuoteModel(
                "Cada libro, cada volumen que ves aquí, tiene un alma. El alma de la persona que lo escribió y de aquellos que lo leyeron, vivieron y soñaron con él. Cada vez que un libro cambia de manos, cada vez que alguien baja sus ojos a las páginas, su espíritu crece y se fortalece.",
                "La Sombra del Viento",
                "Carlos Ruiz Zafón"));
        quote.add(new QuoteModel(
                "Mi consejo es: nunca hagas mañana lo que puedes hacer hoy. La procrastinación es la ladrona del tiempo.",
                "David Copperfield",
                "Charles Dickens"));
        quote.add(new QuoteModel(
                "Luchar hasta el último aliento.",
                "Enrique VI",
                "William Shakespeare"));
        quote.add(new QuoteModel(
                "Conseguir lo que quieres es tan difícil como no conseguir lo que quieres. Porque entonces tienes que averiguar qué hacer con ello, en lugar de averiguar qué hacer sin ello.",
                "El reino de la posibilidad",
                "David Levithan"));
        quote.add(new QuoteModel(
                "Deja de preocuparte por envejecer y piensa en crecer.",
                "El animal moribundo",
                "Philip Roth"));
        quote.add(new QuoteModel(
                "Crearía un perfume que no sólo fuera humano, sino sobrehumano. Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor que quien lo oliera quedaría hechizado y no tendría más remedio que amar a la persona que lo llevara, o sea, amarle a él, Grenouille, con todo su corazón.",
                "El Perfume",
                "Patrick Süskind"));
        quote.add(new QuoteModel(
                "¡Qué maravilloso es que nadie necesite esperar ni un solo momento antes de comenzar a mejorar el mundo!",
                "El Diario de Ana Frank",
                "Ana Frank"));
        quote.add(new QuoteModel(
                "Crees que sabes todas tus posibilidades. Entonces, otras personas llegan a tu vida y de repente hay muchas más.",
                "El reino de la posibilidad",
                "David Levithan"));
        quote.add(new QuoteModel(
                "Nada hay en el mundo, ni hombre ni diablo ni cosa alguna, que sea para mí tan sospechoso como el amor, pues éste penetra en el alma más que cualquier otra cosa. Nada hay que ocupe y ate más al corazón que el amor. Por eso, cuando no dispone de armas para gobernarse, el alma se hunde, por el amor, en la más honda de las ruinas.",
                "El Nombre de la Rosa",
                "Umberto Eco"));
        return quote;
    }
}