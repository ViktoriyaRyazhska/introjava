import java.util.Scanner;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
    Pet pet = new Pet();
    pet.name = "Battler";

    pet.ask("Do you want to walk?", sc);
    pet.ask("Do you want to eat?", sc);
    
  }
}

class Pet {

  String name;

  void ask(String question, Scanner sc) {
    System.out.println(question);
    int answer = sc.nextInt();
    if (answer == 1) {
      System.out.println("Yes, " + name + " wants");
    } else {
      System.out.println("No, " + name + " doesn't want");
    }
  }
}
