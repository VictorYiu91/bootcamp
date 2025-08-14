public class Chemistry {
  private char chemicalSymbol;
  private int atomicNumber;
  public void setChemicalSymbol (char chemicalSymbol) {
    this.chemicalSymbol = chemicalSymbol;
  }
  public void setAtomicNumber (int atomicNumber) {
    this.atomicNumber = atomicNumber;
  }
  public char getChemicalSymbol() {
    return this.chemicalSymbol;
  }
  public int getAtomicNumber() {
    return this.atomicNumber;
  }
  public static void main(String[] args) {
    Chemistry carbon = new Chemistry();
    carbon.setChemicalSymbol('C');
    carbon.setAtomicNumber(6);
    System.out.println(carbon.getAtomicNumber() + " & " + carbon.getChemicalSymbol());
    Chemistry hydrogen = new Chemistry();
    hydrogen.setChemicalSymbol('H');
    hydrogen.setAtomicNumber(1);
    System.out.println(hydrogen.getAtomicNumber() + " & " + hydrogen.getChemicalSymbol());
  }
}
