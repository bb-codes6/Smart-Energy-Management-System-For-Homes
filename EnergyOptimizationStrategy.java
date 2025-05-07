// Abstract strategy class
public abstract class EnergyOptimizationStrategy {
    float energyUse;

    public abstract void analyzeEnergyUsage();
    public abstract void suggestEnergySaving();

    public float predictEnergyUsage(float[] pastUsage) {
        if (pastUsage == null || pastUsage.length == 0) {
            System.out.println("Prediction unavailable due to lack of data.");
            return 0;
        }
        float sum = 0;
        for (float usage : pastUsage) {
            sum += usage;
        }
        float predictedUsage = sum / pastUsage.length;
        System.out.println("Predicted energy use: " + predictedUsage);
        return predictedUsage;
    }

    public float forecastEnergyConsumption() {
        float forecastedUsage = 0;
        System.out.println("Your forecasted usage is: " + forecastedUsage);
        return forecastedUsage;
    }
}

// Notification system class

// Concrete strategy 1
class AIEnhancedEnergySavingStrategy extends EnergyOptimizationStrategy {
    @Override
    public void analyzeEnergyUsage() {
        System.out.println("Analyzing energy usage with AI-enhanced algorithm...");
    }

    @Override
    public void suggestEnergySaving() {
        System.out.println("Suggested saving: Optimize heating/cooling schedule using AI predictions.");
    }
}

// Concrete strategy 2
class BasicEnergySavingStrategy extends EnergyOptimizationStrategy {
    @Override
    public void analyzeEnergyUsage() {
        System.out.println("Analyzing energy usage with basic pattern recognition...");
    }

    @Override
    public void suggestEnergySaving() {
        System.out.println("Suggested saving: Turn off unused devices and lights.");
    }
}