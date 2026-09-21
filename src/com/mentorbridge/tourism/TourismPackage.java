package com.mentorbridge.tourism;

/**
 * Abstract parent class for all tourism packages.
 */
public abstract class TourismPackage {

    // Encapsulation
    private String packageId;
    private String destination;
    private int days;
    private int travelers;
    private double basePrice;

    // Parameterized constructor
    public TourismPackage(String packageId,
                          String destination,
                          int days,
                          int travelers,
                          double basePrice) {

        this.packageId = packageId;
        this.destination = destination;
        this.days = days;
        this.travelers = travelers;
        this.basePrice = basePrice;
    }

    // Getters
    public String getPackageId() {
        return packageId;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public int getTravelers() {
        return travelers;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Setters
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setTravelers(int travelers) {
        this.travelers = travelers;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Concrete method
    public void displayPackageDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Tourism Package");
        System.out.println("Package ID   : " + packageId);
        System.out.println("Destination  : " + destination);
        System.out.println("Days         : " + days);
        System.out.println("Travelers    : " + travelers);
        System.out.println("Base Price   : " + basePrice);
        System.out.println("Package Type : " + getPackageType());
    }

    // Used to display package type
    public abstract String getPackageType();

    // Abstract method
    public abstract double calculateFinalPrice();
}