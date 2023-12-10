public class Vehicle {
    public String name;
    public String color;
    public int wheelsNum;
    public int seatsNum;

    public Vehicle(){

    }
    public Vehicle(String name, String color, int wheelsNum, int seatsNum){
        this.name = name;
        this.color = color;
        this.wheelsNum = wheelsNum;
        this.seatsNum =seatsNum;
    }

    public String toString(){
        return "This Vehicle: " + name + ", color: " + color + ", number of Weels: " + wheelsNum + ", number of seats: " + seatsNum;
    }
    /*public void V_toString(){
        System.out.println( "This Vehicle: " + name + ", color: " + color + ", number of Weels: " + wheelsNum + ", number of seats: " + seatsNum);
    }*/

}
