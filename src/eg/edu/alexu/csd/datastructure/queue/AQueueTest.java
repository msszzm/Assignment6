package eg.edu.alexu.csd.datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AQueueTest {


    @Test
    void dequeue() {
        AQueue test = new AQueue(5);
        test.enqueue("first");
        test.enqueue("second");
        test.enqueue("third");
        test.enqueue("fourth");
        assertEquals("first",test.dequeue());
        assertEquals("second",test.dequeue());
        assertEquals("third",test.dequeue());
        assertEquals("fourth",test.dequeue());
        try {
            assertEquals("fifth",test.dequeue());
        }catch (RuntimeException o){
            System.out.println(o.toString());
        }
        test.enqueue("fifth");
        try {
            test.enqueue("sixth");

        }catch (RuntimeException o){
            System.out.println(o.toString());
        }

    }

    @Test
    void isEmpty() {
        AQueue test = new AQueue(5);
        assertTrue(test.isEmpty());
        test.enqueue("one elemnet");
        assertFalse(test.isEmpty());
         test.dequeue();
        assertTrue(test.isEmpty());

    }

    @Test
    void size() {
        AQueue test = new AQueue(10);
        assertEquals(0,test.size());
        test.enqueue("first");
        test.enqueue("second");
        test.enqueue("third");
        test.enqueue("fourth");
        assertEquals(4,test.size());
        test.enqueue("fifth");
        test.enqueue("sixth");
        test.enqueue("seventh");
        test.enqueue("eigth");
        assertEquals(8,test.size());



    }
}