// Practice Question 5 – main Method Variations + Command Line Trap
class PracticeQuestion5 {
    static {
        System.out.println("Static Block");
    }

    public static void main(String args[]) {
        System.out.println("Main Method");
    }

    public static void main(int[] args) {
        System.out.println("Overloaded Main");
    }
}

/*
Questions:
1. Which main method will JVM call?
   Answer: The main method with signature public static void main(String[] args) will be called.

2. What is the output?
   Answer: Static Block
           Main Method

3. Is method overloading of main() allowed?
   Answer: Yes, method overloading is allowed in Java.

4. Can JVM call main(int[] args)? Why or why not?
   Answer: No, JVM only calls the main method with the signature public static void main(String[] args). The overloaded main(int[] args) is just another method and will not be called by JVM.
*/
