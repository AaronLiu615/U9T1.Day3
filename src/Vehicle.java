public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public void setPassengers(int newPassenger){
    passengers = newPassenger;
  }

  public void setTollFee(double price){
    tollFee = price;
  }

  public int getPassengers() {
    return passengers;
  }

  public double getTollFee() {
    return tollFee;
  }

  public String getLicensePlate(){
    return licensePlate;
  }

  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public void printCar(){
    System.out.println("LisensePlate: " + licensePlate + "\nTollfee: " + tollFee + "\nNumberOfPassengers: " + passengers);
  }
}