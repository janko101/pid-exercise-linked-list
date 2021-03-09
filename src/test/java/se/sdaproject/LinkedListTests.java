package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void searchMethod() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);

        assertEquals(  list.search(5), 2, "Index of 5 should be 2" );
    }

    @Test
    void searchNonExistingElement() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);

        assertEquals(  list.search(7), -1);
    }

    @Test
    void searchMethodOnEmptyList() {
        LinkedList list = new LinkedList();

        assertEquals(  list.search(5), -1, "Method should return -1" );
    }
}
