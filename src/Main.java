import java.util.Scanner;
//This is just without ArrayList
public class Main {
public  static  void main(String [] args){
    Car carOne = new Car();//Defualt constructor
    //Car carTwo = new Car("Jeap", "Campus",2019);//orverladed constructor
    String answer = "";
    int answer2;
    carOne.setMake("Honda");
    carOne.setModel("Civic");
    carOne.setYear(2019);
    System.out.println(carOne.display());
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the make of car: ");
    answer= input.nextLine();
    carOne.setMake(answer);
    System.out.println("Enter the model of car: ");
    answer= input.nextLine();
    carOne.setModel(answer);
    System.out.println("Enter year of car: ");
    answer2= input.nextInt();
    carOne.setYear(answer2);
    System.out.println("The infromation you entered are:"+carOne.display());
  }
}
