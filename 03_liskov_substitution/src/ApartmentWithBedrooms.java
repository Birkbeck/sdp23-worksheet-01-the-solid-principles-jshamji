abstract sealed class ApartmentWithBedrooms extends Apartment permits PenthouseSuite {
        int numberOfBedrooms;

    @Override
    abstract void setSquareFootage(int sqft);
}
