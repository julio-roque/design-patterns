package creational;

import creational.Singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Singleton Design Pattern Test")
class SingletonTest {

    @Test
    @DisplayName("Singleton should have the same name across threads")
    void singletonHaveTheSameNameTest() {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        Assertions.assertNotEquals(threadFoo.getName(), threadBar.getName(),
                "Threads should have different names");
    }

    public  static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.getName());
            assertEquals("FOO", singleton.getName(),
                    "Singleton instance should have the name 'FOO'");
        }
    }

    public static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.getName());
            assertTrue(singleton.getName().equals("FOO") || singleton.getName().equals("BAR"),
                    "Singleton instance should have the name 'FOO'");
        }
    }
}