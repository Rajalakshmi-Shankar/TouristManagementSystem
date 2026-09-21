package com.mentorbridge.tourism;

/**
 * Main class for Tourism Management System.
 */
public class TourismManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          SAAI TRAVELS");
        System.out.println("========================================");

        // No-argument constructor
        Tourist tourist1 = new Tourist();

        // Using setters
        tourist1.setTouristId(101);
        tourist1.setTouristName("Raji");
        tourist1.setEmail("raji@gmail.com");
        tourist1.setPhone("9876543210");


        // Parameterized constructor
        Tourist tourist2 = new Tourist(
                102,
                "Kaviya",
                "kaviya@gmail.com",
                "9876543211"
        );


        // Display first tourist
        tourist1.displayTouristInfo();

        System.out.println("----------------------------------------");

        // Display second tourist
        tourist2.displayTouristInfo();


        System.out.println();
        System.out.println("========================================");


        // Polymorphism
        TourismPackage package1 =
                new DomesticTourism(
                        "TP101",
                        "Goa",
                        5,
                        2,
                        40000
                );

        TourismPackage package2 =
                new InternationalTourism(
                        "TP102",
                        "Paris",
                        7,
                        2,
                        100000
                );

        TourismPackage package3 =
                new AdventureTourism(
                        "TP103",
                        "Manali",
                        6,
                        3,
                        60000
                );


        // Store child objects in parent reference array
        TourismPackage[] packages = {
                package1,
                package2,
                package3
        };


        // Runtime polymorphism
        for (TourismPackage tourismPackage : packages) {

            tourismPackage.displayPackageDetails();

            System.out.println("Final Price  : "
                    + tourismPackage.calculateFinalPrice());

            System.out.println("----------------------------------------");
        }
    }
}