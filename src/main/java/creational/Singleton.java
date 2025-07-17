package creational;

public class Singleton {
    private static volatile Singleton instance;
    private String name;

    // Private constructor prevents instantiation from other classes
    private Singleton(String name) {
        this.name = name;
    }

    // Public method to provide access to the instance
    public static Singleton getInstance(String name) {
        // Check if instance is already created
        Singleton localInstance = instance;
        if (localInstance != null) {
            instance = localInstance;
        }
        // Double-checked locking to ensure thread safety and lazy initialization
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(name);
            }
            return instance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
