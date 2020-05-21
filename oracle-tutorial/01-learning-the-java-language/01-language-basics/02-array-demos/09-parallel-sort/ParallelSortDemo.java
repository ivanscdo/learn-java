import java.util.Arrays;

class ParallelSortDemo {
    
    public static void main (String[] args) {
        
        char[] redWine = {'r', 'e', 'd', 'w', 'i', 'n', 'e', 's', 'u', 'c', 'e', 's', 's'};

        int[] intRedWine = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("---Before Parallel Sort---");
        
        System.out.println(redWine);
        System.out.println(Arrays.toString(intRedWine));


        System.out.println("---After Parallel Sort---");

        Arrays.parallelSort(redWine);
        Arrays.parallelSort(intRedWine);

        System.out.println(redWine);
        System.out.println(Arrays.toString(intRedWine));

    }

}
