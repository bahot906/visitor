public class EnergyConsumptionVisitor implements DeviceVisitor {
    private double totalEnergyKWh = 0.0;

    @Override
    public void visit(Thermostat thermostat) {
        double consumption = 1.5 + Math.abs(thermostat.getTargetTemperature() - thermostat.getCurrentTemperature()) * 0.2;
        totalEnergyKWh += consumption;
        System.out.println("[Энергия] Термостат потребляет: " + String.format("%.2f", consumption) + " кВт*ч");
    }

    @Override
    public void visit(SmartBulb smartBulb) {
        double consumption = (smartBulb.getBrightness() / 100.0) * 0.05;
        totalEnergyKWh += consumption;
        System.out.println("[Энергия] Умная лампочка потребляет: " + String.format("%.2f", consumption) + " кВт*ч");
    }

    public double getTotalEnergyKWh() {
        return totalEnergyKWh;
    }
}