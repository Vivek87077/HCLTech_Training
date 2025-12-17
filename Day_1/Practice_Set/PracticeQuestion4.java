// Practice Question 4 – Object Class Methods + Reference Comparison
class Book {
    int price = 500;
}

public class PracticeQuestion4 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}

/*
Questions:
1. What is the output?
   Answer: false
           false

2. Explain how equals() works here.
   Answer: Since Book does not override equals(), it uses the default Object.equals() method, which checks for reference equality (same as ==). Since b1 and b2 are different objects, both == and equals() return false.
*/
