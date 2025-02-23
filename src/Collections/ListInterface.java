package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Ravina");
        l1.add("Arora");
        l1.add(1, "Kumari");
        l1.remove(0);

        if (l1.contains("Arora")){
            System.out.println(l1.indexOf("Arora"));
        }
        // normal loop


        for (int i = 0; i < l1.size(); i++ ){
            System.out.println(l1.get(i));
        }


        // for each loop usage
        for (String str: l1){
            System.out.println(str);
        }
    }

}
