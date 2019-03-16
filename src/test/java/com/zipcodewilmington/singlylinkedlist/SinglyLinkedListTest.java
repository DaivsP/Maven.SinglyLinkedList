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

    @Test
    public void removeTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        String hey = "hey";
        String hi = "hi";

        singlyLinkedList.add(hey);
        singlyLinkedList.add(hi);

        singlyLinkedList.remove(2);

        Boolean actual = singlyLinkedList.contains("hi");

        Assert.assertFalse(actual);
    }
}
