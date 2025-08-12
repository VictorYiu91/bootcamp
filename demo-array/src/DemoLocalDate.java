import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    // number, String, boolean etc.
    String birthday = "01-JAN-1999";
    // +1 year
    LocalDate yearEnd = LocalDate.of(1999,12,31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(yearEnd.plusMonths(2L)); //2000-02-29
    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true
    LocalDate today = LocalDate.now(); // read running machine system time
    System.out.println(today.getDayOfWeek());
    System.out.println(today.getYear());
    System.out.println(today.getMonth().ordinal()); // ordinal:Count from 0 -> 7 (August)
    System.out.println(today.isAfter(LocalDate.of(2025,8,11))); // true
    System.out.println(today.isAfter(LocalDate.of(2025,12,11))); // false
    System.out.println(today.isBefore(LocalDate.of(2025,8,11))); // false
    System.out.println(today.isBefore(LocalDate.of(2025,12,11))); // true
  }
}
