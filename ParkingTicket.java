
public class ParkingTicket {

 private String car;
 private int spot;

 public ParkingTicket(String car, int spot) {
  this.car = car;
  this.spot = spot;
 }

 public String getCar() {
  return car;
 }

 public int getSpot() {
  return spot;
 }

 public String toString() {
  return car + " in spot " + spot;
 }

}
