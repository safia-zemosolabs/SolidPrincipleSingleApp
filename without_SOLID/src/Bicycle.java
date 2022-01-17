public class Bicycle extends TransportDevice {

    @Override
    public void setModel(String model){ this.model = model; }

    @Override
    public void setColor(String color) { this.color=color; }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public void setSpeed(double speed) { this.speed = speed; }

    //Violation of LSP Rule
    @Override
    public void startEngine() { System.out.println("Alas! Bicycle doesn't have Engine"); }
}
