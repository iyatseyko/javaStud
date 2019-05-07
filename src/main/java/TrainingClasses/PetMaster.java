package TrainingClasses;

import TrainingClasses.Fish;
import TrainingClasses.Pet;

import java.util.*;

public class PetMaster {

    public static  void main (String[] args) {

        Set <String> se = new HashSet<>();

        se.add("sgsdf");
        se.add("seg");
        se.add("s3425g");
        se.add("s45tvfg");

        System.out.println(se);

        System.out.println(  "CLONE" +      ((HashSet<String>) se).clone());

        ((HashSet<String>) se).clone();


        Map<String,Integer> m = new HashMap<>();
        m.put("df",4);
        m.put("dxfghjdfjf",8);
        m.put("dffg",9);

        System.out.println(m.keySet());
        System.out.println(m.values());

        m.put("eee",9);
        m.put("aaaa",9);
        m.put("aaaa",84);


        Iterator iterator= m.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(m.entrySet().iterator().next().getKey());
        System.out.println(m.entrySet());

        Map<Integer, String> li = new LinkedHashMap<Integer, String>();
        li.put(1, "obj1");
        li.put(15, "obj15");
        li.put(4, "obj4");
        li.put(38, "obj38");


        System.out.println("ENTRY" + li.entrySet());

        li.put(10, "obj38");
        li.put(38, "AAAAAAAAA");

        System.out.println(li.entrySet());    }
}
