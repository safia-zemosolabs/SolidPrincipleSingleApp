public class DeviceWithoutEngine extends TransportDevice implements VehicleControl, VehicleWithoutEngine {
    double speed;

    public void setSpeed(double speed) { this.speed = speed; }

    public void startMoving() {
        System.out.println("Device started moving");
    }
}
