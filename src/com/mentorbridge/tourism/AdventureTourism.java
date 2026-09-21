package com.mentorbridge.tourism;

/**
 * Represents an adventure tourism package.
 */
public class AdventureTourism extends TourismPackage {

    // Constructor
    public AdventureTourism(String packageId,
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

        double adventureCharge = getBasePrice() * 0.15;

        return getBasePrice() + adventureCharge;
    }

    @Override
    public String getPackageType() {
        return "Adventure Tourism";
    }
}