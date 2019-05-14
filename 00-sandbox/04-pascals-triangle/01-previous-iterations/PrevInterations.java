import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {

        // iteration 1
        // int[] array = new int[n];
        // int secondToLast = 0;
        // int thirdToLast = 0;
        // int previousFirst = 0;
        // int previousSecond = 0;
        // for (int i = 0; i < n; i++) {
        //     array[i] = 1;
        //     if (i>0) {
        //         array[1] = i;
        //     }
        //     if (i > 4) {
        //         array[2] = previousFirst + previousSecond;
        //     }
        //     if (i > 3) {
        //         array[i-2] = secondToLast + thirdToLast;
        //         previousFirst = array[1];
        //         previousSecond = array[2];
        //     }
        //     if (i > 2) {
        //         array[i-1] = i;
        //         secondToLast = array[i-1];
        //         thirdToLast = array[i-2];
        //     }
        //     System.out.println(i + ": " + Arrays.toString(array));
        // }


        // iteration 2
        // ArrayList<Integer> array = new ArrayList<Integer>();
        // ArrayList<Integer> prevArray = new ArrayList<Integer>();
        // for (int i = 0; i < n; i++) {
        //     array.add(1);
        //     if (i > 0) {
        //         array.set(1, i);
        //     }
        //     if (i > 2) {
        //         array.set(array.size()-2, array.get(1));
        //     }
        //     if (i > 3) {
        //         array.set(2, prevArray.get(1) + prevArray.get(2));
        //     }
        //     if (i > 4) {
        //         array.set(array.size()-3, array.get(2));
        //     }
        //     if (i > 5) {
        //         array.set(3, prevArray.get(2) + prevArray.get(3));
        //         array.set(4, prevArray.get(3) + prevArray.get(4));
        //     }

        //     // System.out.println(i + ": " + array + " | " + prevArray + ": " + prevArray.size());

        //     if (i > 1) {
        //         for (int j = 1; j < prevArray.size(); j++) {
        //             array.set(array.size()-2, prevArray.get(j-1) + prevArray.get(j));
        //         }
        //     }
        //     System.out.println(i + ": " + array + " | " + prevArray);

        //     // for (int j = 0; j < array.size(); j++) {
        //     //     System.out.print(array.get(j) + " ");
        //     // }
        //     // System.out.println();

        //     prevArray.clear();
        //     prevArray.addAll(array);
        // }


        // iteration 3
        // ArrayList<ArrayList<Integer>> incept = new ArrayList<ArrayList<Integer>>();
        // // incept.add(new ArrayList<Integer>(Arrays.asList(1)));
        // // incept.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
        // // System.out.println(incept);

        // // incept.get(1).set(0, 99);

        // // System.out.println(incept);
        // for (int i = 0; i < n; i++) {
        //     incept.add(new ArrayList<Integer>(Arrays.asList(i)));
        //     // incept.get(i).set(i, 1);
        //     System.out.println(incept);
        //     System.out.println(incept.get(i).get(0));
        // }


        // iteration 4
        // ArrayList<Integer> pascal = new ArrayList<Integer>();
        // ArrayList<Integer> prevRow = new ArrayList<Integer>();
        // for (int i = 0; i < n; i++) {
        //     pascal.add(1);

        //     if (i > 1) {
        //         pascal.set(1, i);
        //         pascal.set(i-1, prevRow.get(i-1) + prevRow.get(i-2));
        //     }
        //     if (i > 3) {
        //         pascal.set(2, prevRow.get(2) + prevRow.get(1));
        //         pascal.set(3, prevRow.get(3) + prevRow.get(2));
        //     }
        //     if (i > 5) {
        //         pascal.set(i-2, pascal.get(2));
        //     }
        //     if ( i % 2 != 0) {
        //         pascal.set((pascal.size()/2), pascal.get((pascal.size()/2)-1));
        //     }
        //     if (i > 7) {
        //         if (i % 2 == 0) {
        //             pascal.set(i/2, prevRow.get(i/2) + prevRow.get(i/2 - 1));
        //             pascal.set(i/2 + 1, pascal.get(i/2 - 1));
        //         }
        //     }
                
        //     System.out.println(i + " - " + pascal.size() +": " + pascal + " | " + prevRow);

        //     // for (int j = 0; j < pascal.size(); j++) {
        //     //     System.out.print(pascal.get(j) + " ");
        //     // }
        //     // System.out.println();

        //     prevRow.clear();
        //     prevRow.addAll(pascal);
        // }

        
        // // iteration 5
        // int n = 3;
        // ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
        // ArrayList<Integer> prevRow = new ArrayList<Integer>();
        // for (int i = 0; i < n; i++) {
        //     pascal.add(new ArrayList<Integer>());
        // }

        // // pascal.get(0).add(1);
        // // pascal.get(1).addAll(Arrays.asList(1,1));
        // // System.out.println(pascal);

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         // if (j == i || j == 0) {
        //         //     System.out.println(i + " | " + 99);
        //         // } else {
        //         //     System.out.println(i + " | " + j);
        //         // }
                
        //         // if (i < 2) {
        //         //     if (j == i || j == 0) {
        //         //         pascal.get(i).add(j, 1);
        //         //     // } else {
        //         //     //     pascal.get(i).add(j, 0);
        //         //     }
        //         // } else if (i >= 2) {
        //         //     pascal.get(i).clear();
        //         //     pascal.get(i).add(0, 1);
        //         //     pascal.get(i).add(1, 99);

        //         //     // // pascal.get(i).add(prevRow.get()+prevRow.get());

        //         //     pascal.get(i).add(i, 1);
        //         // }
        //         pascal.get(i).add(j, x);

        //     }
        //     if (i >= 1) {
        //         prevRow.clear();
        //         prevRow.addAll(pascal.get(i-1));
        //     }
        // }
        // System.out.println(pascal);
        // System.out.println(prevRow);


        // // practice
        // // pascal.get(2).add(0, 1);
        // // pascal.get(2).add(0, 2);
        // // pascal.get(2).add(0, 3);
        // // pascal.get(2).set(2, 99);
        // // System.out.println(pascal);
        // // System.out.println(prevRow);
        // // System.out.println(pascal.get(2).get(0));

        // // // prevRow.add(0,1);
        // // // prevRow.add(0,2);
        // // // pascal.get(n-1).addAll(prevRow);
        // // // System.out.println(pascal.get(n-1).get(0));

        // // prevRow.addAll(pascal.get(2));
        // // System.out.println(prevRow);


        // // iteration 6
        // int n = 3;
        // int x = 0;
        // ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
        // ArrayList<Integer> prevRow = new ArrayList<Integer>();
        // for (int i = 0; i < n; i++) {
        //     pascal.add(new ArrayList<Integer>());
        // }

        // // pascal.get(0).add(1);
        // // pascal.get(1).addAll(Arrays.asList(1,1));

        // for (int i = 0; i < n; i++) {
        //     // pascal.get(i).add(0, 1);
        //     for (int j = 0; j <= i; j++) {
        //         pascal.get(i).add(j, 1);

        //         // if (i < 2) {
        //         //     pascal.get(i).add(j, 1);
        //         // } else {
        //         //     // pascal.get(i).clear();
        //         //     // pascal.get(i).add(0,1);
        //         //     // pascal.get(i).add(1,99);
        //         //     // pascal.get(i).add(i,1);
        //         //     // if (j < prevRow.size()) {
        //         //         // x = prevRow.get(j);
        //         //     // }
        //         //     // pascal.get(i).add(j, x);
        //         // }
        //     }
        //     prevRow.clear();
        //     prevRow.addAll(pascal.get(i));
        // }
        // System.out.println(pascal);
        // System.out.println(prevRow);
    }
}
