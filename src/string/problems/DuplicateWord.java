package string.problems;

import java.text.DecimalFormat;
import java.util.HashMap;

public class DuplicateWord {

    public static HashMap<String, Integer> getTheOccurencesOfWords(String data) {
        String updatedData = data.replace(".", "");
        String[] arrayOfIndividualWord = updatedData.split(" ");

        HashMap<String, Integer> mapIfOccurance = new HashMap<>();

        for (int i = 0; i < arrayOfIndividualWord.length; i++) {
            Integer previousCount = mapIfOccurance.get(arrayOfIndividualWord[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            mapIfOccurance.put(arrayOfIndividualWord[i], previousCount + 1);
        }

        System.out.println(mapIfOccurance);
        return mapIfOccurance;
    }

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        getTheOccurencesOfWords(st);

        int count = 0;
        double sum = 0;

        String[] words = st.split("\\s+");
    // iterate over each word and update the stats
        for (String word : words) {
            double wordLength = word.length();
            sum += wordLength;
            count++;
        }

    // calculate the average at the end
        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Average word length = " + df.format(average));

    }

}
