package d14ForLoops_NestedLoops;

public class NestedLoops01 {
    public static void main(String[] args) {
        //Nested Loop

/*
    for(){

        for(){

        }

   }


 */

//type the code printing following output...

/*
Week 1:

    Day: 1
    Day: 2
    Day: 3
Week 2:
    Day: 1
    Day: 2
    Day: 3


 */
            int week =0;
            int day =0;

            for (week=1;week<3;week++) {
                System.out.println("Week " + week);
                    for (day=1;day<4;day++) {
                        System.out.println( "   day: " + day);

                    }
            }

























    }
}
