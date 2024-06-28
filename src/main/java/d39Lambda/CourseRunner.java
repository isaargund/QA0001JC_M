package d39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseRunner {
    public static void main(String[] args) {
        Course courseTrDay = new Course("Summer", "TR DAY", 97, 130);
        Course courseTrNight = new Course("Winter", "TR NIGHT", 95, 110);
        Course courseEngDay = new Course("Spring", "ENG DAY", 93, 125);
        Course courseEngNight = new Course("Winter", "ENG NIGHT", 98, 145);


        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTrDay);
        courseList.add(courseTrNight);
        courseList.add(courseEngDay);
        courseList.add(courseEngNight);

        System.out.println("courseList = " + courseList);


            /*
        [Course{season='Summer',courseName='TR Day',    averageScore=97, numberOfStudents=130},
        Course{season='Winter', courseName='TR Night',  averageScore=95, numberOfStudents=110},
        Course{season='Spring', courseName='ENG Day',   averageScore=93, numberOfStudents=125},
        Course{season='Winter', courseName='ENG Night', averageScore=98, numberOfStudents=145}]
         */

        //1) check if all "averageScore" are greater than 91
        // allMatch method works with lambda

        boolean result = courseList.stream().allMatch(t-> t.getAverageScore()>95);
        System.out.println("result = " + result);

        //2Check if all courses have more than 100 students

        boolean result2 = courseList.stream().allMatch(t -> (t.getNumberOfStudents()>100));
        System.out.println("result2 = " + result2); //result2 = true

        //3 check if no course season is "Fall"
        //noneMatch function is perfections in negative logic.....

        boolean result3  = courseList.stream().noneMatch(t -> t.getSeason().equals("Fall"));
        System.out.println("result3 = " + result3); // true

        // check if at least one course name contains ENG
        boolean result4 = courseList.stream().anyMatch(t-> t.getCourseName().contains("ENG"));

        System.out.println("result4 = " + result4); //true

        //Print the name of the course with the highest averagescore
        //max function methid is returning object structure with maximum averageScore
       List<Course> aList= courseList.stream().sorted(Comparator.comparing(t->t.getAverageScore())).skip(2).
                collect(Collectors.toList());

        System.out.println(aList);

       List<Course> newList=courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(newList);



    }
}





















