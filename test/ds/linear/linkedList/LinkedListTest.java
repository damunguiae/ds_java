package test.ds.linear.linkedList;

import ds.linear.linkedList.linkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    
    private linkedList list;
    
    @BeforeEach
    void setUp() {
        list = new linkedList();
    }
    
    @Test
    void testNewListIsEmpty() {
        assertEquals(0, list.getSize());
    }
    
    @Test
    void testAddOneElement() {
        list.add(5);
        assertEquals(1, list.getSize());
    }
    
    @Test
    void testAddMultipleElements() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.getSize());
    }
    
}
