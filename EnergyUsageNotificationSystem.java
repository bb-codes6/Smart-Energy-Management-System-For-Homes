/**
 * The EnergyUsageNotificationSystem class is responsible for monitoring and
 * notifying users when their energy usage exceeds a predefined limit.
 *
 * This system allows the user to define a maximum energy usage limit
 * (usageBeforeNotice). The current energy usage can be updated,
 * and if the usage surpasses the set limit, a notification is triggered.
 */
public class EnergyUsageNotificationSystem {
    private float usageBeforeNotice;
    private float currentUsage;

    public EnergyUsageNotificationSystem(float usageNotice) {
        this.usageBeforeNotice = usageNotice;
        this.currentUsage = 0;
    }

    public float updateEnergyUsage(float usage) {
        this.currentUsage = usage;
        if (currentUsage > usageBeforeNotice) {
            sendNotification();
        }
        return this.currentUsage;
    }

    public float getUsageBeforeNotice() {
        return usageBeforeNotice;
    }

    public void setUsageBeforeNotice(float usageBeforeNotice) {
        this.usageBeforeNotice = usageBeforeNotice;
    }

    public float getCurrentUsage() {
        return currentUsage;
    }

    private void resetUsage() {
        this.currentUsage = 0;
        System.out.println("Current energy usage has been reset.");
    }

    private void sendNotification() {
        System.out.println("Warning: Your current energy usage is " + currentUsage + " which exceeds the threshold of " + usageBeforeNotice + ".");
    }
}
