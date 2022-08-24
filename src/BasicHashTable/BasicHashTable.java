package BasicHashTable;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.*;

public class BasicHashTable<k,v> {
    private int index=0;
    private Object[] values=new Object[256];
    private Integer[] keyArray = new Integer[values.length];
    public void put(k key,v Value){
        values[calculatePosition(key)]=Value;
        keyArray[index]=calculatePosition(key);
        index+=1;
    }
    public v get(k key){
        return (v)values[calculatePosition(key)];
    }
    private int calculatePosition(k key){
        int hash=key.hashCode();
        int post=hash & (values.length-1);
        if(post<0) post+=values.length;
        return post;
    }
    @Deprecated
    private int calculatePositionOld(k key){
        int hash=key.hashCode();
        int post=hash%values.length;
        if(post<0) post+= values.length;
        return post;
        //This implementation frequently assigned of multiple values to the same packet, which
        // is not efficient and resulted in data loss.
    }
    public String toString(){
        return Stream.of(values)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(", ","[","]"));
    }
    public String PrintKeys(){
        return Stream.of(keyArray)
                .filter(Objects::nonNull)
                .map(Objects::toString)
                .collect(Collectors.joining(", ","{","}"));
    }



}
