
//used chat gpt to generate dummy-data
package com.Learning.BackToBasics.Runner;

import com.Learning.BackToBasics.Model.CargoShip;
import com.Learning.BackToBasics.Model.CruiseShip;
import com.Learning.BackToBasics.Model.Ship;

public class ShipDriver {
    public static void main(String[] args) {
        Ship[] someship = {
                new Ship(
                        true, 50, 80.0, 15.0, 20.0,
                        "Sea Explorer", "USA", "Blue Ocean",
                        "2026-10-01", "2026-10-05",
                        "Seattle", "Vancouver"
                ),

                new CargoShip(
                        true, 25, 200.0, 32.0, 40.0,
                        "Cargo Star", "USA", "Ocean Freight",
                        "2026-10-02", "2026-10-12",
                        "Los Angeles", "Tokyo",
                        "Electronics", "Cranes", 4, false, 2500000.00
                ),

                new CruiseShip(
                        true, 2000, 300.0, 40.0, 60.0,
                        "Sunset Voyager", "USA", "Holiday Cruises",
                        "2026-10-03", "2026-10-10",
                        "Miami", "Nassau",
                        1500.00, 1000, "Pasta, salads, and desserts",
                        new String[]{"Swimming pool", "Spa", "Live music"},
                        "Family cruise"
                )
        };

        // Each object uses its own version of print().
        for (Ship ship : someship) {
            ship.print();
            System.out.printf("%n");
        }
    }
}