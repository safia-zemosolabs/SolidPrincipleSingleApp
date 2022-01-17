public class TransportDevice  implements VehicleInterface{
    String model;
    String color;
    double price;
    double speed;

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpeed(double speed) { this.speed = speed; }

    public void startEngine() {
        System.out.println("Device Engine started");
    }
}
