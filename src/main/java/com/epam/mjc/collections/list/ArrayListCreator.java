package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> divisibleByThree = new ArrayList<>();
        int counter = 1;
        for (String element : sourceList){
            if (counter % 3 == 0){
                divisibleByThree.add(element);
                divisibleByThree.add(element);
            }
            counter++;
        }
        return divisibleByThree;
    }

}
