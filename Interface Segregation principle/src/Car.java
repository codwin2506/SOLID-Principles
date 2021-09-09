public class Car implements Vehicle, Movable {
    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Price of the car is "+price);
    }
    @Override
    public void setColor(String color) {
        this.color=color;
        System.out.println("color of the car is "+ color);
    }
    @Override
    public void start(){
        // Implementation
    }
    @Override
    public void stop(){
        // Implementation
    }
}