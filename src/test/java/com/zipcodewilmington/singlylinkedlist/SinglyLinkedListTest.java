package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        String hey = "Hey";
        singlyLinkedList.add(hey);

        String actual = (String) singlyLinkedList.get(1);

        String expected = "Hey";

        Assert.assertEquals(expected, actual);
    }
}
