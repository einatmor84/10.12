public class Main {
    public static void main(String[] args) {

       Vehicle vehicleBMW = new Vehicle("BMW", "red", 4,5);
        System.out.println(vehicleBMW.toString());

        Bike bike = new Bike("Honda", "black", 2, 2);
        System.out.println(bike.toString());
    }
}
