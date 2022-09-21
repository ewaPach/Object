public class Main {
    public static void main(String[] args){
        Apartment mieszkanie1 = new Apartment (1, "Chorzów", true);
        System.out.println(mieszkanie1.getFloor());
        System.out.println(mieszkanie1.getCity());
        System.out.println(mieszkanie1.getBalcony());
        mieszkanie1.setBalcony(false);
        System.out.println(mieszkanie1.getBalcony());
        mieszkanie1.setCity("Gdańsk");
        System.out.println(mieszkanie1.getCity());
        Apartment mieszkanie2 = new Apartment(3,"Katowice",true);
        mieszkanie2.setFloor(0);
        System.out.println(mieszkanie2.getFloor());
    }
}