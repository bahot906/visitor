public interface DeviceVisitor {
    void visit(Thermostat thermostat);
    void visit(SmartBulb lightBulb);
}