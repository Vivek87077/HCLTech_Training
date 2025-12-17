// Practice Question 2 – Command Line Arguments + Object Class
public class PracticeQuestion2 {
    public static void main(String... args) {
        Object obj = args;
        System.out.println(obj.getClass().getName());
    }
}

/*
Questions:
1. Is this a valid main method? Why?
   Answer: Yes, main(String... args) is a valid main method because varargs (String...) is equivalent to String[].

2. What will be printed if program is run as: java Demo A B C
   Answer: [Ljava.lang.String; (the canonical name for the String array class)

3. Explain how Object class is involved here.
   Answer: args is a String[], which is a subclass of Object. obj.getClass() returns the Class object for the array type.
*/
