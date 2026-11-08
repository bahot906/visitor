public class SmartBulb implements SmartDevice {
    private int brightness; // в процентах (0-100)
    private boolean isColorModeRGB;

    public SmartBulb(int brightness, boolean isColorModeRGB) {
        this.brightness = brightness;
        this.isColorModeRGB = isColorModeRGB;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isColorModeRGB() {
        return isColorModeRGB;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
}