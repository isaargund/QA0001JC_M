package d39Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda15 {
    public static void main(String[] args) throws IOException {

        // Example 1: Write the code that prints the text in the given text file to the console.
        // lines= is a method of the file class. And it returns Stream<String> for reading data line by line....
        //From a specified file path, this alllows you perform stream operations on each line in the file....


        //Paths.get is a static method of the Paths class. It returns a path object representing the given file path string....

        Files.lines(Paths.get("src/main/java/d39Lambda/File.txt")).forEach(System.out:: println);

        Path path = Paths.get("src/main/java/d39Lambda/File.txt");

        Files.lines(path).forEachOrdered(System.out::println);


        //Example 2 write code that prints the text in the given file to the console in uppercase....

        //1ST WAY
        String path1 = Files.readString(Paths.get("src/main/java/d39Lambda/File.txt")).toUpperCase();
        System.out.println("path1 = " + path1);

        System.out.println("===============================================================================");

        //2ND WAY

        Files.lines(Paths.get("src/main/java/d39Lambda/File.txt")).map(String::toUpperCase).forEach(System.out::println);



        //Example; return the different words used in the texts in the given text file as a list...

        List<String> differentWords = Files.lines(Paths.get("src/main/java/d39Lambda/File.txt")).
                map(t-> t.replaceAll("\\p{Punct}" , "")).
                map(t-> t.split(" ")).flatMap(t-> Arrays.stream(t)).distinct().collect(Collectors.toList());


        System.out.println("differentWords = " + differentWords);


    }
    /*

        Intermediate Operations:
        These operations perform a process on a Stream and return another Stream.
        Thus, you can chain several intermediate operations together.

        Intermediate operations are "lazy." That means the actual operation occurs when
        a terminal operation is invoked.

        Common intermediate operations include:

        filter: Filters elements that meet a specific condition.
        map: Transforms each element in the Stream.
        flatMap: Transforms each element into one or more new elements.
        sorted: Sorts the elements in natural order or according to a specified comparator.
        distinct: Retrieves only unique elements.
        peek: Used for performing an operation on the elements of a Stream without consuming them.
             */
        /*Terminal Operations:
        These operations perform a final process on a Stream and terminate or consume the Stream.
        Once a terminal operation is performed on a Stream,
        no further operations can be done on it.

        Common terminal operations include:

        forEach: Performs an operation on each element in the Stream.
        collect: Converts the elements in the Stream into a collection.
        reduce: Reduces the elements in the Stream to a single value.
        sum, min, max, average: Calculates the sum, minimum, maximum,
        or average of the elements in the Stream.
        allMatch, anyMatch, noneMatch: Checks if the elements in the Stream meet a specific condition.
        findFirst, findAny: Retrieves an element from the Stream.

        In summary, intermediate operations return a Stream and terminal operations
        terminate the Stream. To perform operations on a Stream, at least one terminal
        operation must be invoked, because intermediate operations are lazy
        and are actually executed only when a terminal operation is invoked. There is only one terminal operation.

 */

}
