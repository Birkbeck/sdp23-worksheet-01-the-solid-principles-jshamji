abstract sealed class Apartment permits ApartmentWithBedrooms, ApartmentWithoutBedrooms {
    int squareFootage;
//    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
