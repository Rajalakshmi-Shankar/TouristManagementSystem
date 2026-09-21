package com.mentorbridge.tourism;

/**
 * Represents a domestic tourism package.
 */
public class DomesticTourism extends TourismPackage {

    // Constructor
    public DomesticTourism(String packageId,
                           String destination,
                           int days,
                           int travelers,
                           double basePrice) {

        // Calling parent constructor
        super(packageId, destination, days, travelers, basePrice);
    }

    // Method overriding
    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.05;

        return getBasePrice() + serviceCharge;
    }

    @Override
    public String getPackageType() {
        return "Domestic Tourism";
    }
}