interface VehicleInterface {
    //Violation of ISP Rule
    public void setModel(String model);
    public void setColor(String color);
    public void setPrice(double price);
    public void setSpeed(double speed);
    public void startEngine();
}
