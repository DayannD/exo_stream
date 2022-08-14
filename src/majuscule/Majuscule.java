package majuscule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Majuscule {

    public List<String> upperCase(List<String> list){
        /*List<String> newList = new ArrayList<>();
        for (String el: list){
            newList.add(el.toUpperCase());
        }
        return newList;*/

        return list.stream().map(test -> test.toUpperCase()).toList();
        //return list.stream().collect(Collectors.)
    }
}
