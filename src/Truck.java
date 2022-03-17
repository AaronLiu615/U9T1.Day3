public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck(){
    System.out.println("LicensePlate: " + getLicensePlate() + "\ntollFee: " + getTollFee() + "\nNumberOfPassengers: " + getPassengers() + "\nNumberOfAxles: " + axles + "\nhasTrailer: " + hasTrailer);
  }

  public boolean validateLicensePlate(){
    if (hasTrailer){
      if (getLicensePlate().indexOf("MX") != -1 && axles > 4){
        return true;
      }
      else if(getLicensePlate().indexOf("LX") != -1 && axles <= 4){
        return true;
      }
      return false;
    }
    return true;
  }
}