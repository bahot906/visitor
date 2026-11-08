import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объектной структуры (коллекции элементов)
        List<SmartDevice> homeDevices = new ArrayList<>();
        homeDevices.add(new Thermostat(20.5, 22.0));
        homeDevices.add(new SmartBulb(80, true));
        homeDevices.add(new Thermostat(18.0, 22.0));
        homeDevices.add(new SmartBulb(30, false));

        System.out.println("=== ЗАПУСК ДИАГНОСТИКИ СИСТЕМЫ ===");
        DeviceVisitor diagnosticsVisitor = new DiagnosticsVisitor();
        for (SmartDevice device : homeDevices) {
            device.accept(diagnosticsVisitor);
        }

        System.out.println("\n=== РАСЧЕТ ЭНЕРГОПОТРЕБЛЕНИЯ ===");
        EnergyConsumptionVisitor energyVisitor = new EnergyConsumptionVisitor();
        for (SmartDevice device : homeDevices) {
            device.accept(energyVisitor);
        }
        System.out.println("Общее энергопотребление: " + String.format("%.2f", energyVisitor.getTotalEnergyKWh()) + " кВт*ч");
    }
}