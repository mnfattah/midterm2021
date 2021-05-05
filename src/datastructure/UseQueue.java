package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.remove("one");
        System.out.println(queue);

        /*The peek() method only retrieved the element
         at the head but the poll() also removes the
         element along with the retrieval. */

        System.out.println(queue.poll());
        System.out.println(queue);

    }

}
