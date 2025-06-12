public class Fitbyte {

    private int age;
    private int restingHeeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - restingHeeartRate) * percentageOfMaximum + restingHeeartRate;
    }
}
