package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    // Returns minimum difference between any pair
    public static int findMinDiff(int[] arr, int n)
    {
        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((arr[i] - arr[j]) )< diff)
                    diff = Math.abs((arr[i] - arr[j]));

        // Return min diff
        return diff;
    }

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        System.out.println("Minimum difference between cells of Array1 is "+
                                            findMinDiff(array1, array1.length));
        System.out.println("Minimum difference between cells of Array2 is "+
                                            findMinDiff(array2, array2.length));

        System.out.println("'''''Another way'''''");
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i=0;
        int j=0;

// Initialize minDiff to max-value
        int minDiff = Integer.MAX_VALUE;

        while (i < array1.length && j < array2.length)
        {
            int diff = Math.abs(array1[i] - array2[j]);
            if (diff < minDiff)
                minDiff = diff;

            // Move the smaller array's index forward
            if (array1[i] < array2[j])
                i++;
            else
                j++;


        }
        System.out.println("Smallest Difference between 2 elements from 2 different array is "+minDiff);




    }

}
