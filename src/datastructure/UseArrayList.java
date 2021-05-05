package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Canada");
        country.add("China");
        country.add("Nepal");
        country.add("India");


        System.out.println(country);
        System.out.println(country.size());

        for (String clist : country) {

            System.out.println(clist);
        }

        country.remove("India");

        System.out.println("*****After Remove*****");

        System.out.println(country);
        System.out.println(country.size());

        Iterator<String> iterator = country.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+ "");
        }





    }

}
