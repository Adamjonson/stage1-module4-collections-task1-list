package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> divisibleByThree = new ArrayList<String>();
        for (int i = 0; i < sourceList.size(); i++){
            if (i % 3 == 0){
                divisibleByThree.add(sourceList.get(i));
            }
        }
        return divisibleByThree;
    }

}
