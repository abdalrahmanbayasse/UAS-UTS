import core.*;
//package 

public class App {
    public static void main(String[] args) throws Exception {
        // Normal User
        User user = new User("Adam", "adamPassword");
        // here encapsulation :
        // user.username; not visible
        user.greet();

        // Basic Student
        // inheritance
        Student student = new Student("Ahmad", "ahmadPassword", "200222333", 2.11);
        student.greet();

        // Student with no nim
        // poly
        Student student2 = new Student("Ahmad", "ahmadPassword", 2.11);
        // interface
        student2.greet();

    }

}
