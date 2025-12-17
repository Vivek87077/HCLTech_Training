// Practice Question 1 – Shadowing + Encapsulation
class Student {
    private int marks = 50;

    public void setMarks(int marks) {
        this.marks = marks; // This line causes shadowing; the parameter 'marks' hides the instance variable 'marks'
    }

    public int getMarks() {
        return marks;
    }
}

public class PracticeQuestion1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(90);
        System.out.println(s.getMarks());
    }
}

/*
Questions:
1. What will be the output?
   Answer: 50

2. Explain why the value does not change.
   Answer: In the setMarks method, the parameter 'marks' shadows the instance variable 'marks'.
   The assignment 'marks = marks;' assigns the parameter to itself, not updating the instance variable.
   To fix it, use 'this.marks = marks;' to refer to the instance variable.

3. Modify only one line to fix the issue (without changing method signature).
   Answer: Change 'marks = marks;' to 'this.marks = marks;'
*/
