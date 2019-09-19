import java.util.ArrayList;
import java.util.Scanner;
// This is looping
public class CarApp {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String userInput = "";
        int year;
        String model = "";
        String make = "";
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("We are creating a list of cars.");
        int counter = 1;

        while (true){
            Car car1 = new Car();
            System.out.println("Please enter the make of car " + counter);
            make = sc.nextLine();
            car1.setMake(make);

            System.out.println("Please enter the model of car " + counter);
            model = sc.nextLine();
            car1.setModel(model);

            System.out.println("Please enter the year of car " + counter);
            year = sc.nextInt();
            car1.setYear(year);
            cars.add(car1);
            sc.nextLine();

            System.out.println("Do you want another car?(y/n)");
            userInput= sc.nextLine();
            if (userInput.equalsIgnoreCase("n")){
                System.out.println("Thank you for adding a car. This is the end of adding car ");
                break;
            }
            counter = counter + 1;

        }
        counter = 1;
        System.out.println(counter);
       for (Car car : cars) {
           System.out.println("Car" + counter);
           System.out.println(car.display());
           counter = counter + 1;

       }
    }
}
