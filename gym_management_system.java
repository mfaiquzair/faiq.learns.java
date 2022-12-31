import java.util.ArrayList;
import java.util.Scanner;

public class Gym {
  // Declare instance variables
  private ArrayList<Member> members;
  private ArrayList<Trainer> trainers;
  private Scanner input;

  // Constructor
  public Gym() {
    members = new ArrayList<Member>();
    trainers = new ArrayList<Trainer>();
    input = new Scanner(System.in);
  }

  // Method to add a new member to the gym
  public void addMember() {
    System.out.println("Enter member's name: ");
    String name = input.nextLine();
    System.out.println("Enter member's age: ");
    int age = input.nextInt();
    System.out.println("Enter member's height (in meters): ");
    double height = input.nextDouble();
    System.out.println("Enter member's starting weight (in kilograms): ");
    double weight = input.nextDouble();

    // Create a new Member object and add it to the list of members
    Member m = new Member(name, age, height, weight);
    members.add(m);
  }

  // Method to add a new trainer to the gym
  public void addTrainer() {
    System.out.println("Enter trainer's name: ");
    String name = input.nextLine();
    System.out.println("Enter trainer's age: ");
    int age = input.nextInt();
    System.out.println("Enter trainer's qualification: ");
    String qualification = input.nextLine();

    // Create a new Trainer object and add it to the list of trainers
    Trainer t = new Trainer(name, age, qualification);
    trainers.add(t);
  }

  // Main method
  public static void main(String[] args) {
    Gym gym = new Gym();

    // Add some members and trainers to the gym
    gym.addMember();
    gym.addTrainer();
    gym.addMember();
    gym.addTrainer();

    // Print out the list of members and trainers
    System.out.println("Members: ");
    for (Member m : gym.members) {
      System.out.println(m.getName());
    }
    System.out.println("Trainers: ");
    for (Trainer t : gym.trainers) {
      System.out.println(t.getName());
    }
  }
}

// Member class
class Member {
  // Declare instance variables
  private String name;
  private int age;
  private double height;
  private double startingWeight;

  // Constructor
  public Member(String name, int age, double height, double startingWeight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.startingWeight = startingWeight;
  }

  // Getter method for name
  public String getName() {
    return name;
  }
}

// Trainer class
class Trainer {
  // Declare instance variables
  private String name;
  private int age;
