package core;

public class User implements Greet {
  private String username;
  private String password;

  public User(String username, String password) {
    this.username = username;
    this.password = password;

  }

  @Override
  public void greet() {
    System.out.println("Greetings, " + username);
  }

}
