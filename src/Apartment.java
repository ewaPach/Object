public class Apartment {
    int floor;
    String city;
    boolean balcony;
    Apartment(int floor, String city, boolean balcony){
      this.floor = floor;
      this.city = city;
      this.balcony = balcony;
    }
    public int getFloor(){
        return floor;
    }
}
