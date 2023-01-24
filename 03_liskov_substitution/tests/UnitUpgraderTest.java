import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitUpgraderTest {
    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        UnitUpgraderWithBedrooms upgrader = new UnitUpgraderWithBedrooms();
        upgrader.upgrade(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();
        UnitUpgraderWithBedrooms upgrader = new UnitUpgraderWithBedrooms();
        upgrader.upgrade(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        UnitUpgraderWithoutBedrooms upgrader = new UnitUpgraderWithoutBedrooms();
        upgrader.upgrade(studio);

        assertEquals(590, studio.squareFootage);
    }

//    Remove the following test case as Studio class does not include numberOfBedrooms instance variable

//    @Test
//    public void testUpgraderDoesntAddBedroomToStudios() {
//        Studio studio = new Studio();
//        UnitUpgrader upgrader = new UnitUpgrader();
//        upgrader.upgrade(studio);
//
//        assertEquals(0, studio.numberOfBedrooms);
//    }
}
