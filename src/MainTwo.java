import java.util.ArrayList;
import java.util.Scanner;
//This is how to save to ArrayList as a note
public class MainTwo {
           public  static  void main(String [] args){
            Car carOne = new Car();//Defualt constructor, Car is a calss whereas carOne is an instance created here undr the is class
            //Car carTwo = new Car("Jeap", "Campus",2019);//orverladed constructor
            Car carTwo = new Car("Mercedece", "Civic", 2019);
            String answer = "";
            int answer2;
            carOne.setMake("Honda");//puting in data to defual constrcutor
            carOne.setModel("Civic");
            carOne.setYear(2019);
            System.out.println(carOne.display());// to display or print out
            Scanner input = new Scanner (System.in);//create Scanner class instance
            System.out.println("Enter the make of car: ");//prompt user to enter input
            answer= input.nextLine();//save the input
            carOne.setMake(answer);//put in the input from user to carone instance
            System.out.println("Enter the model of car: ");
            answer= input.nextLine();
            carOne.setModel(answer);
            System.out.println("Enter year of car: ");
            answer2= input.nextInt();
            carOne.setYear(answer2);
            System.out.println("The infromation you entered are:"+carOne.display());
            //ArrayList<String> cars = new ArrayList<>();// ArrayList is a class + cars is an instance here
            //Since car also a class, then we can use Car in place of String = ArrayList<Car> cars = new ArrayList
            ArrayList<Car> cars = new ArrayList();
            cars.add(carOne);// Since carOne was instance under class Car, then it is used for adding carOne. if we have many instance such as CarOne, carTwo etc we follow simialr patterns
            cars.add(carTwo);
            int counter = 1;// to identify/define which car we are displaying
            for(Car car: cars){
                System.out.println("This is your car "+ counter);
                System.out.println(car.display());// to print out what is in ArrayList
                System.out.println();
                counter = counter+1;

            }

        }
    }


