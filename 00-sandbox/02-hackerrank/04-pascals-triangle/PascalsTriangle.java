import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {

        // iteration 7

        // number of rows in triangle 
        int n = 10; 

        // sum previous row's elements to build current row
        int sum = 0; 

        // 2D ArrayList, holds Pascal's Triangle
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>(); 

        // saves previous row to build current row
        ArrayList<Integer> prevRow = new ArrayList<Integer>();

        // Instantiate all columns of 2D ArrayList
        for (int i = 0; i < n; i++) {
            pascal.add(new ArrayList<Integer>());
        }

        // builds Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // builds first 2 rows
            if (i < 2) {
                for (int j = 0; j <= i; j++) {
                    pascal.get(i).add(j, 1);
                }
            // builds rows 3 and beyond
            } else {
                // adds the first int 1 to current row
                pascal.get(i).add(0, 1); 

                /**
                 * adds all middle ints to current row. number of 
                 * iterations based on numbers in current row minus 2,
                 * since first and last 1's are added outside loop.
                 * ex: third row [1, 2, 1] will only iterate once
                 * to add int 2, while fourth row [1, 3, 3, 1] will
                 * iterate twice to add int 3 and 3.
                 **/
                for (int k = 1; k < prevRow.size(); k++) { 
                    // clear sum at start of loop
                    sum = 0;
                    // sum previous row's elements
                    sum = prevRow.get(k) + prevRow.get(k-1);
                    // add previous row's sum to current row in appropriate position
                    pascal.get(i).add(sum); 
                }

                // adds the last int 1 to current row
                pascal.get(i).add(i, 1); 
            }
            // clears contents of prevRow, otherwise ALL previous rows would be saved
            prevRow.clear();
            // saves current row on pascal to prevRow to be used on next iteration i
            prevRow.addAll(pascal.get(i));
        }

        // nicely prints 2D ArrayList, pascal, to console
        for (int i = 0; i < pascal.size(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
