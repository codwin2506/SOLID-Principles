public class Aeroplane implements Vehicle, Movable, Flyable {
    double price;
    String color;

    @Override
    public void setPrice(double price) {

        this.price = price;
        System.out.println("Price of the Aeroplane is "+ price);

    }

    @Override
    public void setColor(String color) {
        this.color=color;
        System.out.println("Color of the Aeroplane is "+ color);
    }
    @Override
    public void start(){
        // Implementation
    }
    @Override
    public void stop(){
        // Implementation
    }
    @Override
    public void fly(){
        // Implementation
    }
}