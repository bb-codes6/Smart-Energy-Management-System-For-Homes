public class RenewableEnergyIntegration {
    float solarEnergyGenerated;
    float storedEnergy;
    public RenewableEnergyIntegration() {
        solarEnergyGenerated = 0;
        storedEnergy = 0;
    }
    public void monitorSolarPanelEnergy(float energyGenerated) {
        solarEnergyGenerated += energyGenerated;
        System.out.println("Solar energy generated: " + solarEnergyGenerated);
    }
    public void storeExcessEnergy(float excessEnergy) {
        storedEnergy += excessEnergy;
        System.out.println("Energy stored: " + storedEnergy);
    }
    public float getStoredEnergy() {
        return storedEnergy;
    }
}