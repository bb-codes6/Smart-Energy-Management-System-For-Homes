public class Main {
    public static void main(String[] args) {
        EnergyOptimizationStrategy strategy1 = new AIEnhancedEnergySavingStrategy();
        strategy1.analyzeEnergyUsage();
        strategy1.suggestEnergySaving();

        float[] pastUsage = {15,20,25,12};
        float predicted = strategy1.predictEnergyUsage(pastUsage);
        strategy1.forecastEnergyConsumption();
        System.out.println("Your predicted energy usage is: " + predicted);

        EnergyUsageNotificationSystem notificationSystem = new EnergyUsageNotificationSystem(16);
        float newUsage = 13;
        System.out.println("Updating energy usage to: " +newUsage);
        notificationSystem.updateEnergyUsage(newUsage);

        RenewableEnergyIntegration renewableSystem = new RenewableEnergyIntegration();
        renewableSystem.monitorSolarPanelEnergy(7);
        renewableSystem.storeExcessEnergy(4);

    }
}
