package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> evensAndOdds = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++){
            Integer element = sourceList.get(i);
            if (element % 2 == 0){
                evensAndOdds.addLast(element);
            }else {
                evensAndOdds.addFirst(element);
            }
        }
        return evensAndOdds;
    }
}
