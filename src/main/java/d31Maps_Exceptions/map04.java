package d31Maps_Exceptions;

import java.util.HashMap;
import java.util.Hashtable;

public class map04 {
    public static void main(String[] args) {

        /*  Let 's examine the concepts of Thread Safe, Multi Thread, and Synchronized.

        Thread safe means that a piece of software can be safely used by multiple threads at the same time.
        An example of thread -safe software is a system managing a bank account.This system should allow multiple customers
        to access their account at the same time, and therefore it needs to be thread safe.


                Multi - threading is the ability of software to execute multiple threads concurrently.This can allow the
        software to operate faster and more efficiently. An example of multi-threaded software is a web browser.
        A web browser can open several web pages at the same time, which is why it is multi-threaded.

                Being synchronized means that a data structure can be used by only one thread at a time.
                */

          /*
        a)HashMap is non-synchronized. This means that multiple threads can access a HashMap at the same
        time. For example, if one customer withdraws money while another deposits at the same time, it could result in an
        incorrect account balance. (it is also not thread-safe)
        However, synchronization must be managed manually in such cases.
        (developers use special structures like Synchronized Blocks, Locks, and Semaphores.)


         b)HashTable is thread - safe and synchronized
        (meaning that only one thread can use the same Hashtable at a time, creating a queue and extending the service
        time). It is not commonly used

        a) HashMap allows one null key(must be unique, cannot have 2 nulls, it would overwrite) and as many null values as
        you want. Example for linkedin platform to register form...

        b) Hashtable does not allow null values for either keys or values.
        Attempting to add a null value will throw a NullPointerException. // you can not give empty for firstname in linkedin

        HashMap is fast, HashTable is slower compared to HashMap.
          Note:Both HashMaps and Hashtables store their entries in a random order.
        */


        HashMap<String , Integer> stdAges = new HashMap<>();

        stdAges.put("Ismail" , 25);
        stdAges.put("Tanya" , 28);
        stdAges.put("Mikail" , 34);
        stdAges.put("Derya" , 33);
        stdAges.put("Goksen" , 45);
        stdAges.put(null , 28);



        Hashtable<String , Integer> stdAges1 = new Hashtable<>();

        stdAges1.put("Ismail" , 25);
        stdAges1.put("Tanya" , 28);
        stdAges1.put("Mikail" , 34);
        stdAges1.put("Derya" , 33);
        stdAges1.put("Goksen" , 45);
        stdAges1.put(null , 28);

        System.out.println("stdAges1 = " + stdAges1);
    }
}
