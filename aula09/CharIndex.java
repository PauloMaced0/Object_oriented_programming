package aula09;

import java.util.*;

public class CharIndex {
    public static void main(String[] args) {
        String string = "Hello World";

        HashMap<String,ArrayList<Integer>> charindex = new HashMap<String,ArrayList<Integer>>();
        
        for(int i = 0;i<string.length();i++){
            String x = string.substring(i, i+1);
            if(charindex.containsKey(x)){
                System.out.println(x);
                System.out.println(i);
                charindex.get(x).add(i);
            }else{    
                System.out.println(x);
                System.out.println(i);
                charindex.put(x,new ArrayList<>());
                charindex.get(x).add(i);
            }
        }

        System.out.println(charindex);
    }
}