package com.collections.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapLecture {

        public static void main(String[] args){
            Map<Integer, String> namesMap = new HashMap();
            namesMap.put(2, "Shashank");
            namesMap.put(43, "Rahul");
            namesMap.put(13, "Robert");

            String name = namesMap.get(43);
            System.out.println(name);

            for(Map.Entry entry: namesMap.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

}
