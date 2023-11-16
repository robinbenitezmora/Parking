import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  ArrayList<String> parkingLot = new ArrayList<String>();
  int choice = 0;
  String car = "";
  while (choice != 3) {
   System.out.println("1. Park a car");
   System.out.println("2. Remove a car");
   System.out.println("3. Quit");
   System.out.print("Enter your choice: ");
   choice = input.nextInt();
   if (choice == 1) {
    System.out.print("Enter the car to park: ");
    car = input.next();
    parkingLot.add(car);
   } else if (choice == 2) {
    System.out.print("Enter the car to remove: ");
    car = input.next();
    parkingLot.remove(car);
   }
   System.out.println(parkingLot);
  }
 }
}
