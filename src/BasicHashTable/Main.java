package BasicHashTable;
import java.util.*;
public class Main {
    public static void main(String...args){
        BasicHashTable<Integer,String> basicHash=new BasicHashTable<Integer, String>();
        basicHash.put(298,"Phoenix");
        basicHash.put(1000,"Athens");
        basicHash.put(12,"Napoleon");
        basicHash.put(90,"utopia");
        basicHash.put(111,"tango");
        basicHash.put(1,"felicia");
        System.out.println("Result: "+basicHash);
        System.out.print("Key Array: ");
        System.out.println(basicHash.PrintKeys());
    }
}
