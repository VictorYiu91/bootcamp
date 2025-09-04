package generic;

import java.util.ArrayList;
import java.util.List;

public class Zoo1 {
  private List<Animal> animals;

  public Zoo1() {
    this.animals = new ArrayList<>();
  }
  public boolean add(Animal animal) {
    return this.animals.add(animal);
  }
}
