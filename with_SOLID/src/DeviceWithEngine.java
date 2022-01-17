public class DeviceWithEngine extends TransportDevice implements VehicleControl, VehicleWithEngine {
    double speed;

    public void setSpeed(double speed) { this.speed = speed; }

    public void startEngine() {
        System.out.println("Device Engine started");
    }
}
