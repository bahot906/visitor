public class DiagnosticsVisitor implements DeviceVisitor {

    @Override
    public void visit(Thermostat thermostat) {
        System.out.println("[Диагностика] Термостат: текущая температура = "
                + thermostat.getCurrentTemperature() + "°C, целевая = "
                + thermostat.getTargetTemperature() + "°C. Статус: В норме.");
    }

    @Override
    public void visit(SmartBulb smartBulb) {
        System.out.println("[Диагностика] Умная лампочка: яркость = "
                + smartBulb.getBrightness() + "%, режим RGB = "
                + (smartBulb.isColorModeRGB() ? "Вкл" : "Выкл") + ". Статус: Исправна.");
    }
}