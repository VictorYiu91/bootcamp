import java.time.LocalDate;

public class Animal {
  private boolean isColdBlood;
  private String classification;
  private LocalDate dob;

  // Method -> Input (Optional) -> Output (Optional)
  // void -> No return type
  public void setIsColdBlood(boolean isColdBlood) {
    this.isColdBlood = isColdBlood;
  }
  public void setClassification(String classification) {
    this.classification = classification;
  }
  public void setDob (LocalDate dob) {
    this.dob = dob;
  }
  public boolean getIsColdBlood() {
    return this.isColdBlood;
  }
  public String getClassification() {
    return this.classification;
  }
  // ! Method Return type: LocalDate
  public LocalDate getDob() {
    return this.dob;
  }

  public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.setIsColdBlood(false);
    System.out.println(a1.getIsColdBlood());
    a1.setClassification("mammals");
    System.out.println(a1.getClassification());
    a1.setDob(LocalDate.of(1990,4,8));
    System.out.println(a1.getDob());

    Animal a380 = new Animal();
    a380.setIsColdBlood(true);
    a380.setClassification("fishes"); 
    a380.setDob(LocalDate.of(1991,10,28));
    LocalDate a380Dob = a380.getDob();
    System.out.println(a380.getIsColdBlood() + " & " + a380.getClassification() + " & " + a380.getDob());

    a380.setDob(LocalDate.of(2021,11,2));
    System.out.println(a380.getDob()); // 2021-11-02
    System.out.println(a380Dob); // 1991-10-28

    Animal lucas = new Animal();
    lucas.setDob(LocalDate.of(2021,11,2)); // <-- New value for LocalDate
    System.out.println(lucas.getDob()); // 2021-11-02

    lucas = a380;
    lucas.setDob(LocalDate.of(2024,12,31));
    System.out.println(lucas.getDob()); // 2024-12-31
    System.out.println(a380.getDob()); // 2024-12-31
  }
}
