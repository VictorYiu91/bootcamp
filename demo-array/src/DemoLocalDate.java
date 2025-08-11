import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    // number, String, boolean etc.
    String birthday = "01-JAN-1999";
    // +1 year
    LocalDate yearEnd = LocalDate.of(1999,12,31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true
    System.out.println(firstDateOfYear.plusMonths(4L)); //2000-05-01   
  }
}
