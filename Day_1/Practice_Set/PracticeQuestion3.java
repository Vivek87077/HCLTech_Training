// Practice Question 3 – HAS-A Relationship + Encapsulation
class Engine {
    private int power = 120;

    public int getPower() {
        return power;
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();  // Creating an instance of the Engine class
    }

    public int getEnginePower() {
        return engine.getPower(); // Accessing power through the public method
    }
}

public class PracticeQuestion3 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getEnginePower());
    }
}

/*
Questions:
1. Will this code compile? If not, why?
   Answer: No, it will not compile. In the getEnginePower method, 'engine.power' tries to access the private field 'power' of the Engine class from the Car class, which violates encapsulation and access rules.

2. Identify the HAS-A relationship.
   Answer: Car HAS-A Engine (composition).

3. Correct the code without breaking encapsulation.
   Answer: Change 'return engine.power;' to 'return engine.getPower();'
*/
