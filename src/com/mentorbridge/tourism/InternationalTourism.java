package com.mentorbridge.tourism;

/**
 * Represents an international tourism package.
 */
public class InternationalTourism extends TourismPackage {

    // Constructor
    public InternationalTourism(String packageId,
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

        double serviceCharge = getBasePrice() * 0.10;
        double tax = getBasePrice() * 0.08;

        return getBasePrice() + serviceCharge + tax;
    }

    @Override
    public String getPackageType() {
        return "International Tourism";
    }
}