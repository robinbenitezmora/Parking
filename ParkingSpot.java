public class ParkingSpot {

 private String car;

 public ParkingSpot() {
  car = "";
 }

 public void park(String car) {
  this.car = car;
 }

 public void remove(String car) {
  this.car = "";
 }

 public String toString() {
  return car;
 }

}
