import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();

    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    // try, catch
    try {
      registerUser(username, password, email);
      System.out.println("User registered successfully: " + username);
    } catch (UserRegistrationException e) {
      System.out.println(e.getMessage());
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    public UserRegistrationException(String message) {
      super(message);
    }
  }
  public static class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
      super(message);
    }
  }
  public static class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }
  public static class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
      super(message);
    }
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    boolean isValidUsername = true, isValidPassword = true, isValidEmail = true;
    try {
      validateUsername(username);
    } catch (InvalidUsernameException e) {
      isValidUsername = false;
    }
    try {
      validatePassword(password);;
    } catch (InvalidPasswordException e) {
      isValidPassword = false;
    }
    try {
      validateEmail(email);
    } catch (InvalidEmailException e) {
      isValidEmail = false;
    }
    if (!isValidUsername || !isValidPassword || !isValidEmail) {
      String message = "Registration Fail:";
      if (!isValidUsername)
      message += " Invalid Username;";
      if (!isValidPassword)
      message += " Invalid Password;";
      if (!isValidEmail)
      message += " Invalid Email;";
      throw new UserRegistrationException(message);
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == null || username.isEmpty())
      throw new InvalidUsernameException("Invalid Username");
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    if (password == null || password.length() < 8)
      throw new InvalidPasswordException("Invalid Password.");
    else {
      if (!password.contains("!") && !password.contains("@")
          && !password.contains("$") && !password.contains("&")
          && !password.contains("_")) {
        throw new InvalidPasswordException("Invalid Password.");
      }
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    // code here ...
    if (email == null || !email.contains("@")) {
      throw new InvalidEmailException("Invalid Email.");
    }
  }
}
