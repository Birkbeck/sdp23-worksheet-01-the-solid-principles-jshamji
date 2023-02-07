abstract sealed class ApartmentWithoutBedrooms extends Apartment permits Studio  {

    @Override
    abstract void setSquareFootage(int sqft);
}
