package d19MultiDimansionArray_List;

public class MultiDimensionalArrays_List {
    public static void main(String[] args) {

        int[][] numbers = {{11,4},{13,43,21}} ;
        int min = numbers[0][0]; //11
        int max = numbers[0][0]; //11

        for (int []w:numbers) {
            for (int l:w) {
               min=Math.min(min,l);

               max=Math.max(max,l);

            }


            }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Total value of min and max = " + (min+max));

        }

    }

