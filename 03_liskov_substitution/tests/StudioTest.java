import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudioTest {
    // Following test removed as Studio class does not include bedrooms.
//    @Test
//    public void testInitializedWithZeroBedrooms() {
//        Studio studio = new Studio();
//        assertEquals(0, studio.numberOfBedrooms);
//    }

    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
