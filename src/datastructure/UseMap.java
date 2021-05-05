package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */

        HashMap<String, String> clinic= new HashMap<>();
        clinic.put("PName", "Sumon");
        clinic.put("PGender", "Male");
        clinic.put("PAge", "32");
        clinic.put("PZip", "22309");

        System.out.println(clinic);

        System.out.println(clinic.get("PName"));
        System.out.println(clinic.get("PGender"));
        System.out.println(clinic.get("PAge"));
        System.out.println(clinic.get("PZip"));

        System.out.println("Add List<String> into a Map");

        Map<String, List<String>> mlist = new HashMap<String, List<String>>();

        mlist.put("USA", Arrays.asList("VA", "NY", "CA"));
        mlist.put("CANADA", Arrays.asList("QC", "MB", "AB"));

        System.out.println(mlist);

        System.out.println("Using for each loop");

        for (Map.Entry<String, List<String>> entry : mlist.entrySet())  //Map. entrySet() method in Java is used to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them. Parameters: The method does not take any parameter.
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        System.out.println("Using while loop");

        // using iterators
        Iterator<Map.Entry<String, List<String>>> itr = mlist.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, List<String>> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


    }

}
