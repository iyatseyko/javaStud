package TrainingClasses;

import TrainingClasses.Fish;
import TrainingClasses.Pet;

import java.util.*;

public class PetMaster {

    public static  void main (String[] args) {

        Set <String> se = new HashSet<>();

        se.add("1");
        se.add("2");
        se.add("3");
        se.add("4");

        System.out.println(se);


        Iterator <String> it = se.iterator();
        while (it.hasNext()) {
            System.out.println( "ITERATOR"+ it.next());
        }


        System.out.println(  "CLONE" +  ((HashSet<String>) se).clone());


        Map<String,Integer> m = new HashMap<>();
        m.put("df",4);
        m.put("dxfghjdfjf",8);
        m.put("dffg",9);
        m.put(null, 0);


        System.out.println(m.keySet());
        System.out.println(m.values());

        m.put("eee",9);
        m.put("aaaa",9);
        m.put("aaaa",84);


        Iterator iterator= m.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(m.entrySet());

        Map<Integer, String> li = new LinkedHashMap<Integer, String>();
        li.put(1, "obj1");
        li.put(15, "obj15");
        li.put(4, "obj4");
        li.put(38, "obj38");

        li.put(10, "obj38");
        li.put(38, "AAAAAAAAA");

        System.out.println(li.entrySet());

        Pet pet1 = new Pet("pet1");
        Pet pet2 = new Pet("pet2");

        Pet pet3 = new Pet("pet3");
        Pet fish = new Fish(12, "fishhh");

        List <String> pets = new ArrayList<>();
        pets.add("4");
        pets.add("41");
        pets.add("74");
        pets.add("40");


        List <String> pets2 = new ArrayList<>();
        pets2.add("40");
        pets2.add("4");
        pets2.add("455");
        pets2.add("402");

        pets.retainAll(pets2);

        Iterator itt = pets.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }
    }
}
