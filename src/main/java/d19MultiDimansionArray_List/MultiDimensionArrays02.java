package d19MultiDimansionArray_List;

import java.util.Arrays;

public class MultiDimensionArrays02 {
    public static void main(String[] args) {
        //Convert a multidimension array into one single array

//int [][] numbers = {{5,4}, {2,3,2}}; ====> {5,4,2,3,2}


//Steps to follow
//1) in md array, type the code to find number of elements from all inners.....
//2)Create one dimension(simple) array with size of total number of elements from complex array/multidimension array
//3) transfer to each single element from md to single array.....
        int [][] numbers = {{5,4}, {2,3,2}};
        /*
        String length="";

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                length=length+numbers[i][j];
            }
        }
        System.out.println(length);
        String [] array =length.split("");//5423
        System.out.println(Arrays.toString(array));//[5, 4, 2, 3]

*/
        int totalElements = 0;

        for (int [] w:numbers) { //{{5,4}, {2,3,2}};


            totalElements = totalElements+ w.length;
        }
        System.out.println("totalElements = " + totalElements);

        //2)Create one dimension(simple) array with size of total number of elements from complex array/multidimension array

        int [] simpleArr = new int[totalElements]; //5
        System.out.println("Arrays.toString(simpleArr) = " + Arrays.toString(simpleArr)); //[0, 0, 0, 0, 0]


        //3) transfer to each single element from md to single array.....

        int index = 0;

        for (int [] x:numbers) {  //{{5,4}, {2,3,2}};

            for (int y:x) { //{5,4}

                simpleArr[index] = y;

                index++;


            }

        }
        System.out.println("Arrays.toString(simpleArr) = " + Arrays.toString(simpleArr));

















    }
}
