package count;

import java.util.List;

public class Exo1 {

    public Long count(List list, String mot){
/*        for (Object el:
             list) {
            if(el.equals(mot)){
                val++;
            }
        }*/
        ;
        return list.stream().filter(i -> i == mot).count();
    }
}
