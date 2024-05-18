public class Vehicle {

    protected String name;
    protected String color;

    public Vehicle(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void move(){
        System.out.println("The vehicle " + this.name + " is moving");
    }

    public void stop(){
        System.out.println("The vehicle " + this.name + " has stopped");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
