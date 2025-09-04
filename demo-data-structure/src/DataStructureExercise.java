import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    List<Integer> nums = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(40);
    nums.add(50);
    // 1c. Print all the elements in the list.
    for (int n : nums) {
      System.out.println(n);
    }
    // 1d. Remove the number 30 from the list.
    nums.remove(2);
    System.out.println(nums);
    // 1e. Print the size of the list.
    System.out.println(nums.size());
    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    // 2b. Check if "Grapes" exists in the list.
    System.out.println(fruits.contains("Grapes"));
    // 2c. If it doesn’t exist, add it to the list.
    fruits.add("Grape");
    // 2d. Update "Mango" to "Peach".
    fruits.set(2, "Peach");
    // 2e. Print the final list.
    System.out.println(fruits);
    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    List<Integer> nums2 = new ArrayList<>();
    nums2.add(10);
    nums2.add(20);
    nums2.add(10);
    nums2.add(30);
    nums2.add(40);
    nums2.add(20);
    nums2.add(50);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> num2Set = new HashSet<>();
    for (int n : nums2) {
      num2Set.add(n);
    }
    // 3c. Print the list after removing duplicates.
    System.out.println(num2Set);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("Chinga");
    countries.add("Japan");
    // 4b. Add "Canada" to the set.
    countries.add("Canada");
    // 4c. Add "India" again. Print the result.
    countries.add("India");
    // 4d. Print all elements in the set.
    System.out.println(countries);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> nums3Set = new HashSet<>();
    nums3Set.add(1.1);
    nums3Set.add(2.2);
    nums3Set.add(3.3);
    nums3Set.add(4.4);
    nums3Set.add(5.5);
    // 5b. Check if the set contains the number 3.3
    System.out.println(nums3Set.contains(3.3));
    // 5c. Remove the number 2.2 from the set.
    nums3Set.remove(2.2);
    System.out.println(nums3Set);
    // 5d. Print the size of the set.
    System.out.println(nums3Set.size());
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    HashSet<Integer> nums4Set = new HashSet<>();
    HashSet<Integer> nums5Set = new HashSet<>();
    // 6b. Set 1: 10, 20, 30, 40
    nums4Set.add(1);
    nums4Set.add(10);
    nums4Set.add(20);
    nums4Set.add(30);
    nums4Set.add(40);
    // 6c. Set 2: 30, 40, 50, 60
    nums5Set.add(2);
    nums5Set.add(30);
    nums5Set.add(40);
    nums5Set.add(50);
    nums5Set.add(60);
    // 6d. Find the common numbers of the two sets.
    HashSet<Integer> commonNums = new HashSet<>();
    commonNums.add(1);
    commonNums.add(10);
    commonNums.add(20);
    commonNums.add(30);
    commonNums.add(40);
    commonNums.retainAll(nums5Set);
    // 6e. Print the resulting set.
    System.out.println(commonNums);
    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    HashSet<String> namesSet = new HashSet<>();
    namesSet.add("Cherry");
    namesSet.add("Steve");
    namesSet.add("Chole");
    namesSet.add("Jenny");
    namesSet.add("Vicky");

    // 7b. Convert the HashSet to an ArrayList.
    List<String> nameList = new ArrayList<>();
    for (String s : namesSet) {
      nameList.add(s);
    }
    // 7c. Print the converted list.
    System.out.println(nameList);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charile"));
    // 8b. Iterate over the ArrayList and print each student's details.
    for (Student s : students) {
      System.out.println(s);
    }
    // 8c. Remove the student Bob.
    students.remove(1);
    System.out.println(students);
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    System.out.println(Student.findName(students, 1));

    // 8e. Create another ArrayList to store student with name starts with 'A'
    List<Student> studentsA = new ArrayList<>();
    for (Student s : students) {
      if (s.getName().startsWith("A")) {
        studentsA.add(s);
      }
    }
    System.out.println(studentsA);

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    HashSet<Student> studentSet1 = new HashSet<>();
    HashSet<Student> studentSet2 = new HashSet<>();
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    studentSet1.add(new Student(1, "Alice"));
    studentSet1.add(new Student(2, "Bob"));
    studentSet1.add(new Student(3, "Charlie"));
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    studentSet2.add(new Student(2, "Bob"));
    studentSet2.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(4, "David"));
    // 9b. Find the common students of the two sets
    HashSet<Student> commonStuds = new HashSet<>();
    commonStuds.add(new Student(1, "Alice"));
    commonStuds.add(new Student(2, "Bob"));
    commonStuds.add(new Student(3, "Charlie"));
    commonStuds.retainAll(studentSet2);
    // 9c. Print the result.
    System.out.println(commonStuds);
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    // getter, setter, etc.
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public static String findName(List<Student> list, int id) {
      for (Student s : list) {
        if (s.getId() == id)
          return s.getName();
      }
      return "Student not found";
    }

    @Override
    public String toString() {
      return "Student(" //
          + "ID=" + this.id//
          + ", Name=" + this.name//
          + ")";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (!(obj instanceof Student))
        return false;
      Student student = (Student) obj;
      return Objects.equals(this.name, student.getName())
          && Objects.equals(this.id, student.getId());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }
  }
}
