/**
 * Interface for energy sensors in the Smart Energy Management System.
 * Used by smart appliances to measure and report energy consumption.
 */
public interface EnergySensor {
    /**
     * Measure the current energy consumption of the device.
     * @return Energy consumption in kWh
     */
    double measureEnergyConsumption();

    /**
     * Get the current status of the device.
     * @return true if the device is on, false otherwise
     */
    boolean getCurrentEnergyUsage();
}