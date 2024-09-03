class Example {
    // Static variable (class variable)
    static int staticVar = 0;

    // Instance variable
    int instanceVar;

    // Constructor
    public Example(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Instance method
    public void instanceMethod() {
        // Local variable
        int localVar = 10;
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + this.instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    // Static method
    public static void staticMethod() {
        // Static method can access static variables
        System.out.println("Static variable (from static method): " + staticVar);
        // Cannot directly access instance variables or local variables
        // System.out.println("Instance variable: " + instanceVar); // This would cause an error
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the class
        Example example = new Example(20);

        // Accessing instance and static methods
        example.instanceMethod();

        // Accessing static method
        staticMethod();
    }
}
