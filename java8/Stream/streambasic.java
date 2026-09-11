
package java8;
/*Java Stream
        API
        - Java Stream API is used to operate on the source data structure (collection/array) and
         produce pipelined data that we can use to perform specific operations like we can create
         a stream from the list and filter it based on the given condition
        - Java Stream API is used to increase the performance of application
        - Java Stream API is present in java.util.stream package*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class streambasic {
    public static void main(String[] args) {
        List<String>stre=new ArrayList<>();
        stre.add("Apple");
        stre.add("Guava");
        stre.add("Grapes");
       //˳ System.out.println(stre);
        // list of method used we use this so that we cant have to add list.add
        List<String>str=List.of("APPlE","MANGO","PINEAPPLE");
        //System.out.println(str);
        //traversing using loop
        for(int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
        System.out.println("    ");


        // traverse using for each loop
        for(String i:str){
            System.out.println(i);
        }
        System.out.println("    ");


        // traverse using ForEach add in java8 version
        str.forEach(i-> System.out.println(i));
        System.out.println("    ");


        // traverse using method reference add in java8
        str.forEach(System.out::println);
        System.out.println("    ");

        // traverse using creating stream using list
        Stream<String>st=str.stream();
        st.forEach(System.out::println);
        System.out.println("    ");

        //creating stream using set
        Set<String>hash=new HashSet<String>(str);
        hash.forEach(System.out::println);
        System.out.println("    ");


        // creating stream using array
        String[] arr={"a","b","c"};
        Stream<String>strea=Arrays.stream(arr);
        strea.forEach(System.out::println);

    }
}
