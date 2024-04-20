package core;

public class Student extends User {
  private String nim;
  private double gpa;

  public Student(String username, String password, String nim, double gpa) {
    super(username, password);
    this.nim = nim;
    this.gpa = gpa;
  }

  public Student(String username, String password, double gpa) {
    super(username, password);
    this.gpa = gpa;

  }

}
