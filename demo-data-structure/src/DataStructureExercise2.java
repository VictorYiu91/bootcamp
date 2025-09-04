import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeSet;

public class DataStructureExercise2 {
  public static void main(String[] args) {
    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    Queue<Integer> nums1 = new LinkedList<>();
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    nums1.add(5);
    nums1.add(10);
    nums1.add(15);
    nums1.add(20);
    nums1.add(25);
    // 1c. Print the head of the queue without removing it.
    System.out.println(nums1.peek());
    // 1d. Remove two elements from the queue.
    System.out.println(nums1.poll());
    System.out.println(nums1.poll());
    // 1e. Print the remaining queue and its size.
    System.out.println(nums1);
    System.out.println(nums1.size());

    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    Queue<String> customers = new LinkedList<>();
    customers.add("Alice");
    customers.add("Bob");
    customers.add("Charlie");
    customers.add("David");
    // 2b. Serve (remove) the first two customers.
    customers.poll();
    customers.poll();
    // 2c. Print the remaining customers in the queue.
    System.out.println(customers);
    // 2d. Add two new customers: "Eva", "Frank".
    customers.add("Eva");
    customers.add("Frank");
    // 2e. Write a method that processes the queue until it is empty, printing each served customer.
    proceed(customers);

    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.
    System.out.println(isPalindrome("level"));
    System.out.println(isPalindrome("hello"));

    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    Deque<String> history = new LinkedList<>();
    history.add("google.com");
    history.add("facebook.com");
    history.add("youtube.com");
    history.add("github.com");
    // 4b. Simulate "back" and "forward" navigation using deque operations.
    // 4c. Print the current page after each operation.
    Deque<String> forwardHistory = new LinkedList<>();
    // Back
    forwardHistory.addLast(history.removeLast());
    System.out.println(
        "Current page: " + (history.isEmpty() ? "No page" : history.getLast()));
    // Forward
    if (!forwardHistory.isEmpty()) {
      history.addLast(forwardHistory.removeLast());
      System.out.println("Current page: " + history.getLast());
    } else {
      System.out.println("No forward page available");
    }

    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // 5b. The method should split the text by spaces and count occurrences of each word.
    // Example input: "apple banana apple orange banana apple"
    // Output: {apple=3, banana=2, orange=1}
    System.out
        .println(countWordFrequency("apple banana apple orange banana apple"));
    // 5c. Print the word with the highest frequency.
    System.out
        .println(highestFrequency("apple banana apple orange banana apple"));

    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    HashMap<Integer, Student> studentsMap = new HashMap<>();
    studentsMap.put(1, new Student("Alice"));
    studentsMap.put(2, new Student("Bob"));
    studentsMap.put(3, new Student("Charlie"));
    studentsMap.put(4, new Student("David"));

    // 6b. Write a method to search for a student by ID.
    System.out.println(studentsMap.get(1));
    System.out.println(Student.findName(studentsMap, 1));
    // 6c. Write a method to remove a student by ID.
    studentsMap.remove(1);
    Student.remove(studentsMap, 2);
    System.out.println(studentsMap);
    studentsMap.put(1, new Student("Alice"));
    studentsMap.put(2, new Student("Bob"));
    // 6d. Print all student names in alphabetical order.
    TreeSet<String> sortedNames = new TreeSet<>();
    for (Student student : studentsMap.values()) {
      sortedNames.add(student.getName());
    }
    for (String name : sortedNames) {
      System.out.println(name);
    }
    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    HashMap<String, String> countriesMap = new HashMap<>();
    countriesMap.put("USA", "Washington");
    countriesMap.put("France", "Paris");
    countriesMap.put("Japan", "Tokyo");
    countriesMap.put("India", "Delhi");
    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    HashMap<String, String> capitalsMap = new HashMap<>();
    for (String country : countriesMap.keySet()) {
      String capital = countriesMap.get(country);
      capitalsMap.put(capital, country);
    }
    // 7c. Print the inversed map.
    System.out.println(capitalsMap);

    // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    HashMap<String, ArrayList<String>> studentsubjects = new HashMap<>();
    // 8b. Add:
    // "Alice" -> ["Math", "Science"]
    ArrayList<String> aliceSubjects = new ArrayList<>();
    aliceSubjects.add("Math");
    aliceSubjects.add("Science");
    // "Bob" -> ["History"]
    ArrayList<String> bobSubjects = new ArrayList<>();
    bobSubjects.add("History");
    // "Charlie" -> ["Math", "English"]
    ArrayList<String> charlieSubjects = new ArrayList<>();
    charlieSubjects.add("Math");
    charlieSubjects.add("English");
    studentsubjects.put("Alice", aliceSubjects);
    studentsubjects.put("Bob", bobSubjects);
    studentsubjects.put("Charlie", charlieSubjects);
    // 8c. Add "English" to Bob’s subjects.
    bobSubjects.add("English");
    // 8d. Print each student with their subjects.
    System.out.println(studentsubjects);
    // 8e. Write a method to return all students taking "Math".
    System.out.println(findMathStudent(studentsubjects));
  }

  // Question 2
  public static void proceed(Queue<String> queue) {
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }

  // Question 3
  public static boolean isPalindrome(String s) {
    Deque<Character> words = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      words.add(s.charAt(i));
    }
    for (int i = 0; i < s.length() / 2; i++) {
      if (words.pollFirst() != words.pollLast()) {
        return false;
      }
    }
    return true;
  }

  // Question 5
  // Example input: "apple banana apple orange banana apple"
  // Output: {apple=3, banana=2, orange=1}
  public static Map<String, Integer> countWordFrequency(String text) {
    Map<String, Integer> frequencyMap = new HashMap<>();
    String[] words = text.split(" ");
    for (String word : words) {
      frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
    }
    return frequencyMap;
  }

  public static String highestFrequency(String text) {
    Map<String, Integer> result = countWordFrequency(text);
    String maxWord = "";
    int maxCount = 0;

    for (Map.Entry<String, Integer> entry : result.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxWord = entry.getValue() + "x " + entry.getKey();
        maxCount = entry.getValue();
      }
    }

    return ("Most frequent word: " + maxWord);
  }

  // Question 6
  public static class Student {
    private String name;

    // Constructor, getters, setters, toString
    public Student(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public static Student findName(HashMap<Integer, Student> map, int id) {
      return map.get(id);
    }

    public static void remove(HashMap<Integer, Student> map, int id) {
      map.remove(id);
    }

    @Override
    public String toString() {
      return "Student(" //
          + "Name=" + this.name//
          + ")";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (!(obj instanceof Student))
        return false;
      Student student = (Student) obj;
      return Objects.equals(this.name, student.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.name);
    }
  }

  // Question 8
  public static ArrayList<String> findMathStudent(
      HashMap<String, ArrayList<String>> map) {
    ArrayList<String> result = new ArrayList<>();
    for (String student : map.keySet()) {
      if (map.get(student).contains("Math"))
        result.add(student);
    }
    return result;
  }
}
