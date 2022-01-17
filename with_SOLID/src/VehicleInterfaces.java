interface VehicleInterface {
    //Following ISP Rule
    public void setModel(String model);
    public void setColor(String color);
    public void setPrice(double price);
}

interface VehicleControl {
    public void setSpeed(double speed);
}

interface VehicleWithEngine {
    public void startEngine();
}

interface VehicleWithoutEngine {
    public void startMoving();
}
