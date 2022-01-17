public class TransportDevice  implements VehicleInterface {
    String model;
    String color;
    double price;

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
