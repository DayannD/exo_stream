package count;

import java.util.List;

public class main {
    public static void main(String[] args) {
        /*Le but de cet exercice est de découvrir comment utiliser des lambdas et des streams.

                On cherche à compter le nombre d'occurences d'un mot dans une liste.


        Écrire le code de la méthode count sachant que le compteur est un entier long.
                On cherche à écrire une méthode count2 sémantiquement équivalente (qui fait la même chose) à count mais en utilisant l'API des Stream.
        Comment obtenir un Stream à partir d'un objet de type List ?
        L'idée, ici, est de filtrer le stream pour ne garder que les mots égaux au mot passé en paramètre puis de compter ceux-ci.
        Quel sont les méthodes permettant respectivement de filtrer un stream et de compter le nombre d’éléments ?
                La méthode qui permet de filtrer prend un objet de type Predicate<T> en paramètre. Dans notre cas, quel est le type correspondant à T ?
        Indiquer le code permettant de créer une lambda filtrant sur le mot passé en paramètre que l'on peut déclarer en tant que Predicate
        Écrire le code de la méthode count2. */

        Exo1 exo1 = new Exo1();
        var list = List.of("hello", "world", "hello", "lambda");
        System.out.println(exo1.count(list, "hello"));  // 2
    }
}
