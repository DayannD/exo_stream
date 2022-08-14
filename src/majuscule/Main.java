package majuscule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Le but de cet exercice est de découvrir comment utiliser, en plus des lambdas et des streams, des " method references ".

                On cherche à écrire une méthode prenant en paramètre une liste de chaînes de caractères et renvoyant une nouvelle liste contenant les chaînes de caractères en majuscules.
        var list = List.of("hello", "world", "hello", "lambda");
        System.out.println(upperCase(list));  // [HELLO, WORLD, HELLO, LAMBDA]

        Écrire la méthode upperCase (dans un premier temps) sans utiliser l'API des Stream.
        On cherche maintenant à écrire une méthode upperCase2 faisant la même chose mais avec un Stream.
        Comment peut-on utiliser la méthode Stream.map ici ?
        Pour stocker le résultat dans une nouvelle liste, l'idée est de créer la liste puis d'ajouter chaque mot dans la liste.
        public static List<String> upperCase2(List<String> words) {
            var uppercases = new ArrayList<String>();
      ...

            pour demander l'ajout, on utilisera sur le stream la méthode forEach.
            Écrire le code de la méthode upperCase2 en utilisant des lambdas.
                    En fait, au lieu d'utiliser des lambdas, il est possible dans cet exemple d'utiliser la syntaxe des références de méthodes avec l'opérateur :: (coloncolon).
            Écrire une méthode upperCase3 qui utilise la syntaxe des référence de méthodes.
            En fait, au lieu d'utiliser forEach, il est mieux (pas d'effet de bord) d'utiliser la méthode collect avec comme Collector celui renvoyé par la méthode Collectors.toList().
            Écrire une méthode upperCase4 en utilisant le collector Collectors.toList().*/
        Majuscule maj = new Majuscule();
        var list = List.of("hello", "world", "hello", "lambda");
        System.out.println(maj.upperCase(list));  // [HELLO, WORLD, HELLO, LAMBDA]

    }
}
