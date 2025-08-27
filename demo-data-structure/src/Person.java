public class Person {
  private Person person;
  private String name;

  // Constructor
  public Person(String name, Person person) {
    this.name = name;
    this.person = person;
  }

  // get
  public Person getPerson() {
    return this.person;
  }

  public String getName() {
    return this.name;
  }

  // set
  public void setPerson(Person person) {
    this.person = person;
  }


}
