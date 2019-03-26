package Main;

public class Metryka {
    private double meter;
    private double centimeter;
    private double millimeter;

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setCentimeter(double centimeter) {
        this.centimeter = centimeter;
    }

    public void setMillimeter(double millimeter) {
        this.millimeter = millimeter;
    }

    public double getMeter() {
        return meter;
    }

    public double getCentimeter() {
        return centimeter;
    }

    public double getMillimeter() {
        return millimeter;
    }

    double meterToCentimeter(double meter){
        return meter*100;
    }
    double meterToMillimeter(double meter){
        return meter*1000;
    }
    double centimeterToMeter(double centimeter){
        return (centimeter/100);
    }
    double millimeterToMeter(double millimeter){
        return (millimeter/1000);
    }
}
