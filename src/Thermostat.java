public class Thermostat implements SmartDevice {
    private double currentTemperature;
    private double targetTemperature;

    public Thermostat(double currentTemperature, double targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this); // Шаг двойной диспетчеризации
    }
}